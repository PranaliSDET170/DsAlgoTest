package hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import com.aventstack.extentreports.Status;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExtentManager;


public class CucumberHooks {
	private WebDriverManager driver;

	public CucumberHooks(WebDriverManager driverManager) {
		this.driver = WebDriverManager.chromedriver();
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
    	((WebDriver) driver).close();
    	
        if (scenario.isFailed()) {
            ExtentManager.getTest().log(Status.FAIL, "Scenario failed");
        } else {
            ExtentManager.getTest().log(Status.PASS, "Scenario passed");
        }
        ExtentManager.getInstance().flush();
    }

}


