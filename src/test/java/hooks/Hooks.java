package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import utilities.WebDriverManager;

public class Hooks {

	private WebDriver driver;

	public Hooks(WebDriverManager driverManager) {
		this.driver = driverManager.getDriver();
	}

	@AfterStep
	public void afterStep() {
		SessionId s = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Session Id is: " + s);
	}

	@After
	public void afterScenario() {
		driver.close();
	}

}
