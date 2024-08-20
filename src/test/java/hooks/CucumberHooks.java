package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import com.aventstack.extentreports.Status;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ExtentManager;
import utilities.WebDriverManager;

public class CucumberHooks {

	private WebDriver driver;

	public CucumberHooks(WebDriverManager driverManager) {
		this.driver = driverManager.getDriver();
	}

	@AfterStep
	public void afterStep() {
//		System.out.println("Session Id is: " + ((RemoteWebDriver) driver).getSessionId());
	}

	@Before
    public void beforeScenario(Scenario scenario) {
		ExtentManager.getInstance();
        ExtentManager.createTest(scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
    	driver.close();
    	
        if (scenario.isFailed()) {
            ExtentManager.getTest().log(Status.FAIL, "Scenario failed");
        } else {
            ExtentManager.getTest().log(Status.PASS, "Scenario passed");
        }
        ExtentManager.getInstance().flush();
    }

}
