package stepDefenitions;

import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driversAndUtilities.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.HomePage;

public class HomePageSD extends Utility {
	HomePage elem;
	
	@Given("^User on Policytray homepage$")
	public void user_on_Policytray_homepage() throws Throwable {
		
		driver = Utility.getdriver("chrome");
		Utility.pageload(driver, 40);
		Utility.implicitly(driver, 30);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Then("^User clicking the links in navigation bar$")
	public void user_clicking_the_links_in_navigation_bar(DataTable data) throws Throwable {
		int i = 1;
		for (String link : data.asList())
		{
			driver.findElement(By.linkText(link)).click();
			String title = driver.getTitle();
			if (link.equals("Maturity Calculator"))
			{
				Assert.assertEquals("LIC Premium and Maturity Calculator | PolicyTray", title);
			}
			else if (link.equals("Surrender Value Calculator"))
			{
				Assert.assertEquals("LIC Surrender Value Calculator | PolicyTray", title);
			}
			else if (link.equals("PA Policy"))
			{
				Assert.assertEquals("Personal Accident Policy (Religare Health Insurance - Group Secure) | PolicyTray",
						title);
			}
			else if (link.equals("Spot Your Agent"))
			{
				Assert.assertEquals("Find LIC Agent | LIC Agent Search | PolicyTray", title);
			}
			else if (link.equals("Apply Online"))
			{
				Assert.assertEquals("Apply LIC Policy online | LIC Investment Plans Online | PolicyTray", title);
			}
			System.out.println(i + ".Successfully clicked on '" + link + "' page");
			i = i + 1;
			driver.navigate().back();
		}
	}
	
	@Then("^Click the blog link$")
	public void click_the_blog_link() throws Throwable {
		elem = new HomePage();
		String home = driver.getWindowHandle();
		elem.blog.click();
		Set<String> all_window_1 = driver.getWindowHandles();
		for (String child_1 : all_window_1)
		{
			if (!home.equalsIgnoreCase(child_1))
			{
				driver.switchTo().window(child_1);
				String title = driver.getTitle();
				Assert.assertEquals("PolicyTray | Insurance Blog", title);
				System.out.println("Successfully clicked on Blog page");
				driver.close();
			}
			
		}
		driver.switchTo().window(home);
		
	}
	
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
	
	@When("^User clicking the links in Widget that opening in same window$")
	public void user_clicking_the_links_in_Widget_that_opening_in_same_window(DataTable data) throws Throwable {
		int i = 1;
		for (String link : data.asList())
		{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			WebElement click = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'" + link + "')]")));
			click.click();
			String title = driver.getTitle();
			
			if (link.equals("Home"))
			{
				Assert.assertEquals("LIC Policy Features | LIC Premium and Maturity Calculator | PolicyTray", title);
			}
			else if (link.equals("Get Vehicle Details"))
			{
				Assert.assertEquals("Get My Vehicle Registration & Insurance Details | PolicyTray", title);
			}
			else if (link.equals("Apply policy"))
			{
				Assert.assertEquals("Apply LIC Policy online | LIC Investment Plans Online | PolicyTray", title);
			}
			else if (link.equals("Agent"))
			{
				Assert.assertEquals("PolicyTray - Agent Associates Registration for LIC Agents", title);
			}
			else if (link.equals("Refer Friends"))
			{
				Assert.assertEquals("Refer your friends to PolicyTray and become a Star Customer", title);
			}
			else if (link.equals("Withdrawn Plans"))
			{
				Assert.assertEquals("Plans Withdrawn by LIC on Dec 2013", title);
			}
			else if (link.equals("About Us"))
			{
				Assert.assertEquals("About US - PolicyTray", title);
			}
			else if (link.equals("Contact Us"))
			{
				Assert.assertEquals("Contact Us - PolicyTray", title);
			}
			else if (link.equals("Hiring"))
			{
				Assert.assertEquals("Hiring - PolicyTray", title);
			}
			else if (link.equals("New Jeevan Anand"))
			{
				Assert.assertEquals("LIC New Jeevan Anand Review & Benefits, Premium Calculator", title);
			}
			else if (link.equals("New Endowment Plan"))
			{
				Assert.assertEquals(
						"LIC New Endowment Plan (Investment Plan) Features | LIC Maturity Calculator | PolicyTray",
						title);
			}
			else if (link.equals("Single Endowment"))
			{
				Assert.assertEquals(
						"LIC Single Premium Endowment Plan | LIC Premium and Maturity Calculator | PolicyTray", title);
			}
			else if (link.equals("Jeevan Pragati"))
			{
				Assert.assertEquals("LIC Jeevan Pragati policy (increasing life cover) Features | PolicyTray", title);
			}
			else if (link.equals("Micro Bachat"))
			{
				Assert.assertEquals("LIC Micro Bachat policy (Micro Insurance) Features | PolicyTray", title);
			}
			else if (link.equals("Invest 4G"))
			{
				Assert.assertEquals("Canara HSBC OBC Invest 4G (ULIP) plan | PolicyTray", title);
			}
			else if (link.equals("New Money Back Policy"))
			{
				Assert.assertEquals(
						"LIC New Money Back Policy Features | LIC Premium and Maturity Calculator | PolicyTray", title);
			}
			else if (link.equals("New BIMA BACHAT"))
			{
				Assert.assertEquals(
						"LIC New Bima Bachat policy Features | LIC Premium and Maturity Calculator | PolicyTray",
						title);
			}
			else if (link.equals("Jeevan Shiromani"))
			{
				Assert.assertEquals("LIC Jeevan Shiromani - HNI Money Back policy Features | PolicyTray", title);
			}
			else if (link.equals("Bima Shree"))
			{
				Assert.assertEquals("LIC Bima Shree Features, Premium & Maturity Calculator | PolicyTray", title);
			}
			else if (link.equals("Jeevan Arogya"))
			{
				Assert.assertEquals("LIC Jeevan Arogya (Health Insurance Policy) Features | PolicyTray", title);
			}
			else if (link.equals("Amulya Jeevan"))
			{
				Assert.assertEquals("LIC Term Plan (Amulya Jeevan) Features | LIC Term Insurance Premium Calculator",
						title);
			}
			else if (link.equals("iSelect Term Plan"))
			{
				Assert.assertEquals("Canar HSBC OBC Life iSelect Term Plan | PolicyTray", title);
			}
			else if (link.equals("Anmol Jeevan"))
			{
				Assert.assertEquals("LIC Term Insurance (Anmol Jeevan) Features | LIC Premium Calculator | PolicyTray",
						title);
			}
			else if (link.equals("New Child Money Back"))
			{
				Assert.assertEquals(
						"LIC New Child Money Back Plan Features | LIC Child Plan | Child Marriage | PolicyTray", title);
			}
			else if (link.equals("Jeevan Tarun"))
			{
				Assert.assertEquals("LIC Jeevan Tarun Features | LIC Child Plan | PolicyTray", title);
			}
			else if (link.equals("New Jeevan Nidhi"))
			{
				Assert.assertEquals(
						"LIC New Jeevan Nidhi (Pension Plan) Features | LIC Pension Calculator | LIC Premium and Maturity Calculator | PolicyTray",
						title);
			}
			else if (link.equals("Jeevan Akshay-VI"))
			{
				Assert.assertEquals("LIC Pension Plan (Jeevan Akshay 6) Features| Pension Calculator | PolicyTray",
						title);
			}
			else if (link.equals("Religare Secure PA"))
			{
				Assert.assertEquals("Personal Accident Policy (Religare Health Insurance - Group Secure) | PolicyTray",
						title);
			}
			else if (link.equals("Employee"))
			{
				Assert.assertEquals("Employee Login - Policy Tray", title);
			}
			System.out.println(i + ".Successfully clicked on '" + link + "' page");
			i = i + 1;
			driver.navigate().back();
			
		}
	}
	
	@When("^User clicking the links in Widget that opening in new window$")
	public void user_clicking_the_links_in_Widget_that_opening_in_new_window(DataTable data) throws Throwable {
		int i = 1;
		for (String link : data.asList())
		{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			WebElement click = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'" + link + "')]")));
			String home = driver.getWindowHandle();
			click.click();
			Set<String> all_window_1 = driver.getWindowHandles();
			for (String child_1 : all_window_1)
			{
				if (!home.equalsIgnoreCase(child_1))
				{
					driver.switchTo().window(child_1);
					String title = driver.getTitle();
					if (link.equals("CoverNest"))
					{
						Assert.assertEquals(
								"CoverNest - Life Insurance | Car Insurance | Two Wheeler Insurance | Health Insurance",
								title);
					}
					else if (link.equals("HDFC Cancer Care Plan"))
					{
						Assert.assertEquals("HDFC Life Cancer Care Plan", title);
					}
					else if (link.equals("HDFC Term Plan"))
					{
						String url = driver.getCurrentUrl();
						if (url.contains("https://onlineinsurance.hdfclife.com"))
						{
							Assert.assertTrue(true);
						}
						else Assert.assertTrue(false);
					}
					System.out.println(i + ".Successfully clicked on '" + link + "' page");
					
					driver.close();
				}
				
			}
			driver.switchTo().window(home);
			i = i + 1;
		}
	}
	
	@When("^User clicks personal accident policy image$")
	public void user_clicks_personal_accident_policy_image() throws Throwable {
		elem = new HomePage();
		elem.religareSecurePA_2.click();
		String title = driver.getTitle();
		Assert.assertEquals("Personal Accident Policy (Religare Health Insurance - Group Secure) | PolicyTray", title);
		System.out.println("Successfully clicked on Personal accident policy image");
		driver.navigate().back();
	}
	
	@When("^User clicks LIC premium and maturity calculator image$")
	public void user_clicks_LIC_premium_and_maturity_calculator_image() throws Throwable {
		elem = new HomePage();
		elem.maturityCalculator_2.click();
		String title = driver.getTitle();
		Assert.assertEquals("LIC Premium and Maturity Calculator | PolicyTray", title);
		System.out.println("Successfully clicked on LIC premium and maturity calculator image");
		driver.navigate().back();
	}
	
	@Then("^User clicks Life insurance Surrender value calculator$")
	public void user_clicks_Life_insurance_Surrender_value_calculator() throws Throwable {
		elem = new HomePage();
		elem.surrenderValueCalculator_2.click();
		String title = driver.getTitle();
		Assert.assertEquals("LIC Surrender Value Calculator | PolicyTray", title);
		System.out.println("Successfully clicked on Life insurance Surrender value calculator");
		driver.navigate().back();
		
	}
	
	@Then("^User clicks Life insurance loan calculator$")
	public void user_clicks_Life_insurance_loan_calculator() throws Throwable {
		elem = new HomePage();
		elem.loanCalculator.click();
		String title = driver.getTitle();
		Assert.assertEquals("LIC Policy Loan Calculator | PolicyTray", title);
		System.out.println("Successfully clicked on Life insurance loan calculator");
		driver.navigate().back();
		
	}
	
	@Then("^User clicks Life insurance calculator image$")
	public void user_clicks_Life_insurance_calculator_image() throws Throwable {
		elem = new HomePage();
		elem.maturityCalculator_3.click();
		String title = driver.getTitle();
		Assert.assertEquals("LIC Premium and Maturity Calculator | PolicyTray", title);
		System.out.println("Successfully clicked on Life insurance calculator image");
		driver.navigate().back();
		
	}
	
	@Then("^User clicks Agent locator image$")
	public void user_clicks_Agent_locator_image() throws Throwable {
		elem = new HomePage();
		elem.spotYourAgent_2.click();
		String title = driver.getTitle();
		Assert.assertEquals("Find LIC Agent | LIC Agent Search | PolicyTray", title);
		System.out.println("Successfully clicked on Agent locator image");
		driver.navigate().back();
		
	}
	
	@Then("^User clicks Life insurance blog image$")
	public void user_clicks_Life_insurance_blog_image() throws Throwable {
		elem = new HomePage();
		elem.blog_3.click();
		String title = driver.getTitle();
		Assert.assertEquals("PolicyTray | Insurance Blog", title);
		System.out.println("Successfully clicked on Life insurance blog image");
		driver.navigate().back();
		
	}
	
	@Then("^User clicks App download link$")
	public void user_clicks_App_download_link() throws Throwable {
		elem = new HomePage();
		elem.appDownload.click();
		String title = driver.getTitle();
		Assert.assertEquals("PolicyTray Mobile App | PolicyTray Android App | PolicyTray Windows App", title);
		System.out.println("Successfully clicked on App download link");
		
	}
	
	@When("^User click Facebook sharing$")
	public void user_click_Facebook_sharing() throws Throwable {
		elem = new HomePage();
		String home = driver.getWindowHandle();
		elem.fbSharing.click();
		Set<String> all_window_1 = driver.getWindowHandles();
		for (String child_1 : all_window_1)
		{
			if (!home.equalsIgnoreCase(child_1))
			{
				driver.switchTo().window(child_1);
				String url = driver.getCurrentUrl();
				if (url.contains("https://www.facebook.com/"))
				{
					Assert.assertTrue(true);
					
				}
				else Assert.assertTrue(false);
				driver.close();
			}
			
		}
		driver.switchTo().window(home);
		System.out.println("Successfully clicked on Facebook sharing");
	}
	
	@When("^User clicks Twitter sharing$")
	public void user_clicks_Twitter_sharing() throws Throwable {
		elem = new HomePage();
		String home = driver.getWindowHandle();
		elem.twitterSharing.click();
		Set<String> all_window_1 = driver.getWindowHandles();
		for (String child_1 : all_window_1)
		{
			if (!home.equalsIgnoreCase(child_1))
			{
				driver.switchTo().window(child_1);
				String url = driver.getCurrentUrl();
				if (url.contains("https://twitter.com/"))
				{
					Assert.assertTrue(true);
					
				}
				else Assert.assertTrue(false);
				driver.close();
			}
			
		}
		driver.switchTo().window(home);
		System.out.println("Successfully clicked on Twitter sharing");
	}
	
	@When("^User clicks LinkedIN sharing$")
	public void user_clicks_LinkedIN_sharing() throws Throwable {
		elem = new HomePage();
		String home = driver.getWindowHandle();
		elem.linkedInSharing.click();
		Set<String> all_window_1 = driver.getWindowHandles();
		for (String child_1 : all_window_1)
		{
			if (!home.equalsIgnoreCase(child_1))
			{
				driver.switchTo().window(child_1);
				String url = driver.getCurrentUrl();
				if (url.contains("https://www.linkedin.com"))
				{
					Assert.assertTrue(true);
					
				}
				else Assert.assertTrue(false);
				driver.close();
			}
			
		}
		driver.switchTo().window(home);
		System.out.println("Successfully clicked on LinkedIN sharing");
		
	}
	
	@When("^User clicks Facebook Icon$")
	public void user_clicks_Facebook_Icon() throws Throwable {
		elem = new HomePage();
		String home = driver.getWindowHandle();
		elem.fbIcon.click();
		Set<String> all_window_1 = driver.getWindowHandles();
		for (String child_1 : all_window_1)
		{
			if (!home.equalsIgnoreCase(child_1))
			{
				driver.switchTo().window(child_1);
				String title = driver.getTitle();
				Assert.assertEquals("PolicyTray - Home | Facebook", title);
				System.out.println("Successfully clicked on Facebook Icon");
				driver.close();
			}
			
		}
		driver.switchTo().window(home);
	}
	
	@When("^User clicks Twitter Icon$")
	public void user_clicks_Twitter_Icon() throws Throwable {
		elem = new HomePage();
		String home = driver.getWindowHandle();
		elem.twitterIcon.click();
		Set<String> all_window_1 = driver.getWindowHandles();
		for (String child_1 : all_window_1)
		{
			if (!home.equalsIgnoreCase(child_1))
			{
				driver.switchTo().window(child_1);
				String url = driver.getCurrentUrl();
				if (url.contains("https://twitter.com/PolicyTray/"))
				{
					Assert.assertTrue(true);
					System.out.println("Successfully clicked on Twitter icon");
					
				}
				else Assert.assertTrue(false);
				driver.close();
			}
			
		}
		driver.switchTo().window(home);
	}
	
	@When("^User clicks Youtube Icon$")
	public void user_clicks_Youtube_Icon() throws Throwable {
		elem = new HomePage();
		String home = driver.getWindowHandle();
		elem.youtubeIcon.click();
		Set<String> all_window_1 = driver.getWindowHandles();
		for (String child_1 : all_window_1)
		{
			if (!home.equalsIgnoreCase(child_1))
			{
				driver.switchTo().window(child_1);
				String title = driver.getTitle();
				Assert.assertEquals("PolicyTray - YouTube", title);
				System.out.println("Successfully clicked on Youtube Icon");
				driver.close();
			}
			
		}
		driver.switchTo().window(home);
	}
	
}
