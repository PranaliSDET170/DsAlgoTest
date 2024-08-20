package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import com.aventstack.extentreports.Status;

public class CucumberHooks {

	@Before
    public void beforeScenario(Scenario scenario) {
		ExtentManager.getInstance();
        ExtentManager.createTest(scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            ExtentManager.getTest().log(Status.FAIL, "Scenario failed");
        } else {
            ExtentManager.getTest().log(Status.PASS, "Scenario passed");
        }
        ExtentManager.getInstance().flush();
    }
	
}
