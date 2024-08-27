package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
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

}
