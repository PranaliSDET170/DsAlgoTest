
package hooks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Scenario;
import utilities.ExtentManager;
import utilities.WebDriverManager;

public class CucumberHooks {

	private WebDriver driver;

	public CucumberHooks(WebDriverManager driverManager) {
		this.driver = driverManager.getDriver();
	}

	@After
	public void afterScenario(Scenario scenario) {
		
		driver.close();
	}

	/*@AfterAll
	public static void after_all() {
		ExtentManager.getExtentReportsInstance().flush();
	}

	private void generateExtendReport(Scenario scenario) {
		ExtentTest extentTest = ExtentManager.getExtentReportsInstance().createTest(scenario.getName());

		if (scenario.isFailed()) {
			extentTest.createNode("Node").pass(Status.FAIL.getName());
			extentTest.log(Status.FAIL, "Scenario failed: " + scenario.getName());
		} else {
			extentTest.createNode("Node").pass(Status.PASS.getName());
			extentTest.log(Status.PASS, "Scenario passed: " + scenario.getName());
		}
	}
*/
}

