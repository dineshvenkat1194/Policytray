package runnerClasses;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Test-Report/Extent/ExtentReport.html"
@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature_files", glue = "stepDefenitions", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:Test-Report/HTML-Report", })
public class TestRunner {
	
	@AfterClass
	public static void setup() {
		String xmlPath = "D:\\Java\\Neon\\com.policytray.test\\src\\test\\java\\extent-config.xml";
		Reporter.loadXMLConfig(xmlPath);
		Reporter.setSystemInfo("Tester Name", "Dinesh");
		Reporter.setSystemInfo("Application Name", "Policytray.com");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "Production");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
		
	}
}
