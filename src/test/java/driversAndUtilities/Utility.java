package driversAndUtilities;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Utility {
	public static WebDriver driver;
	static final String HOME_URL = "https://policytray.com/";
	
	static Date now = new Date();
	static SimpleDateFormat form = new SimpleDateFormat("dd/MMM/YYYY hh:mma");
	static String date = form.format(now);
	
	public static WebDriver getdriver(String Browser) {
		if (Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\Java\\Neon\\com.policytray.test\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"D:\\Java\\Neon\\com.policytray.test\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (Browser.equalsIgnoreCase("html"))
		{
			driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		}
		else
		{
			System.out.println("pass the currect browser");
		}
		driver.get(HOME_URL);
		return driver;
	}
	
	public static void flash(WebElement element, WebDriver driver) {
		String bgColor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 100; i++)
		{
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgColor, element, driver);
		}
		
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor=" + color, element);
		
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void screenShot(WebDriver driver, String fileName) throws IOException {
		File capture = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(capture,
				new File("D:\\Java\\Neon\\com.policytray.test\\Files" + fileName + " " + date + ".png"));
	}
	
	// pageLoadTimeout method
	public static void pageload(WebDriver driver, int time) {
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}
	
	// implicitlyWait method
	public static void implicitly(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	// ExplicityWait method for click on a element
	public static void clickon(WebDriver driver, WebElement element, int time) {
		new WebDriverWait(driver, time).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");
	}
	
	public static void activeLinks() throws MalformedURLException, IOException {
		List<WebElement> link_list = driver.findElements(By.tagName("a"));
		link_list.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total links on present in this page ==>" + link_list.size());
		List<WebElement> active_links = new ArrayList<WebElement>();
		for (int i = 0; i < link_list.size(); i++)
		{
			if (link_list.get(i).getAttribute("href") != null)
			{
				active_links.add(link_list.get(i));
			}
		}
		System.out.println("Size of active links ==>" + active_links.size());
		for (int j = 0; j < active_links.size(); j++)
		{
			HttpURLConnection conection = (HttpURLConnection) new URL(active_links.get(j).getAttribute("href"))
					.openConnection();
			conection.connect();
			String response = conection.getResponseMessage();
			conection.disconnect();
			System.out.println(j + "." + active_links.get(j).getAttribute("href") + " = = >" + response);
		}
		
	}
}
