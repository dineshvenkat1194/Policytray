package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driversAndUtilities.Utility;

public class HomePage extends Utility {
	
	// Navigation bar
	@FindBy(xpath = "//div[@class='navbar-header']//a//img")
	public WebElement homeLogo;
	@FindBy(linkText = "Maturity Calculator")
	public WebElement maturityCalculator;
	@FindBy(linkText = "Surrender Value Calculator")
	public WebElement surrenderValueCalculator;
	@FindBy(linkText = "PA Policy")
	public WebElement paPolicy;
	@FindBy(linkText = "Spot Your Agent")
	public WebElement spotYourAgent;
	@FindBy(linkText = "Apply Online")
	public WebElement applyOnline;
	@FindBy(xpath = "//form[@id='form1']//a[contains(text(),'Blog')]")
	public WebElement blog;
	
	// Useful links Widget's
	@FindBy(xpath = "//a[contains(text(),'CoverNest')]")
	public WebElement coverNest;
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	public WebElement home;
	@FindBy(xpath = "//a[contains(text(),'Get Vehicle Details')]")
	public WebElement getVehicleDetails;
	@FindBy(xpath = "//a[contains(text(),'Apply policy')]")
	public WebElement applyPolicy;
	@FindBy(linkText = "Blog")
	public WebElement blog_2;
	@FindBy(linkText = "Agent")
	public WebElement agent;
	@FindBy(xpath = "//a[contains(text(),'Refer Friends')]")
	public WebElement referFriends;
	@FindBy(xpath = "//a[contains(text(),'Withdrawn Plans')]")
	public WebElement withdrawnPlans;
	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	public WebElement aboutUs;
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	public WebElement contactUs;
	@FindBy(xpath = "//a[contains(text(),'Hiring')]")
	public WebElement hiring;
	@FindBy(xpath = "//a[contains(text(),'Employee')]")
	public WebElement employee;
	
	// Investment Plans Widget's
	@FindBy(xpath = "//a[contains(text(),'New Jeevan Anand')]")
	public WebElement newJeevanAnand;
	@FindBy(xpath = "//a[contains(text(),'New Endowment Plan')]")
	public WebElement newEndowmentPlan;
	@FindBy(xpath = "//a[contains(text(),'Single Endowment')]")
	public WebElement singleEndowment;
	@FindBy(xpath = "//a[contains(text(),'Jeevan Pragati')]")
	public WebElement jeevanPragati;
	@FindBy(xpath = "//a[contains(text(),'Micro Bachat')]")
	public WebElement microBachat;
	@FindBy(xpath = "//a[contains(text(),'Invest 4G')]")
	public WebElement invest4G;
	
	// MoneyBack Plans Widget's
	@FindBy(xpath = "//a[contains(text(),'New Money Back Policy')]")
	public WebElement newMoneyBackPolicy;
	@FindBy(xpath = "//a[contains(text(),'New BIMA BACHAT')]")
	public WebElement newBimaBachat;
	@FindBy(xpath = "//a[contains(text(),'Jeevan Shiromani')]")
	public WebElement jeevanShiromani;
	@FindBy(xpath = "//a[contains(text(),'Bima Shree')]")
	public WebElement bimaShree;
	
	// Health Plans Widget's
	@FindBy(xpath = "//a[contains(text(),'Jeevan Arogya')]")
	public WebElement jeevanArogya;
	@FindBy(xpath = "//a[contains(text(),'HDFC Cancer Care Plan')]")
	public WebElement hdfcCancerCarePlan;
	
	// Term Plans Widget's
	@FindBy(xpath = "//a[contains(text(),'Amulya Jeevan')]")
	public WebElement amulyaJeevan;
	@FindBy(xpath = "//a[contains(text(),'HDFC Term Plan')]")
	public WebElement hdfcTermPlan;
	@FindBy(xpath = "//a[contains(text(),'iSelect Term Plan')]")
	public WebElement iselectTermPlan;
	@FindBy(xpath = "//a[contains(text(),'Anmol Jeevan')]")
	public WebElement anmolJeevan;
	
	// Child Plans Widget's
	@FindBy(xpath = "//a[contains(text(),'New Child Money Back')]")
	public WebElement newChildMoneyBack;
	@FindBy(xpath = "//a[contains(text(),'Jeevan Tarun')]")
	public WebElement jeevanTarun;
	
	// Pension Plans Widget's
	@FindBy(xpath = "//a[contains(text(),'New Jeevan Nidhi')]")
	public WebElement newJeevanNidhi;
	@FindBy(xpath = "//a[contains(text(),'Jeevan Akshay-VI')]")
	public WebElement jeevanAkshay_VI;
	
	// PA Policy Widget's
	@FindBy(xpath = "//a[contains(text(),'Religare Secure PA')]")
	public WebElement religareSecurePA;
	
	// App Download Page
	@FindBy(xpath = "//div[@class='item active']//a//img")
	public WebElement appDownload;
	
	// Home page containers
	@FindBy(xpath = "//div[@class='row']//div[1]//a[1]//img[1]")
	public WebElement religareSecurePA_2;
	@FindBy(xpath = "//img[@class='img-responsive']")
	public WebElement maturityCalculator_2;
	@FindBy(xpath = "//h1[contains(text(),'Life Insurance Surrender Value Calculator')]")
	public WebElement surrenderValueCalculator_2;
	@FindBy(xpath = "//h1[contains(text(),'Life Insurance Loan Calculator')]")
	public WebElement loanCalculator;
	@FindBy(xpath = "//div/div[2]/div[1]/a[1]/img[1]")
	public WebElement maturityCalculator_3;
	@FindBy(xpath = "//div/div[2]/div[2]/a[1]/img[1]")
	public WebElement spotYourAgent_2;
	@FindBy(xpath = "//div/div[2]/div[3]/a[1]/img[1]")
	public WebElement blog_3;
	
	// Social Media Icons
	@FindBy(xpath = "//div[@class='social-icons']//a[1]")
	public WebElement fbIcon;
	@FindBy(xpath = "//a[2]//i[1]")
	public WebElement twitterIcon;
	@FindBy(xpath = "//a[3]//i[1]")
	public WebElement youtubeIcon;
	@FindBy(xpath = "//a[4]//i[1]")
	public WebElement mailIcon;
	
	// Sharing Container
	@FindBy(xpath = "//div[7]/div[1]")
	public WebElement fbSharing;
	@FindBy(xpath = "//div[7]/div[2]")
	public WebElement twitterSharing;
	@FindBy(xpath = "//div[7]//div[3]")
	public WebElement linkedInSharing;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
}
