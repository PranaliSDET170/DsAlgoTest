package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WebDriverManager;

public class LoginSteps {

	private WebDriver driver;

	public LoginSteps(WebDriverManager driverManager) {
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

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://dsportalapp.herokuapp.com/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {

		driver.findElement(By.id("id_username")).sendKeys("ArinSwalke");
		driver.findElement(By.id("id_password")).sendKeys("Nandita@09");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//input[4]")).click();

	}

	@Then("user is successfully logged in")
	public void user_is_successfully_logged_in() {
		Assert.assertEquals(driver.findElement(By.className("alert")).getText(), "You are logged in");
	}

	@Given("user is on homepage")
	public void user_is_on_homepage() {
		// Assert.assertEquals(<ActualValueReturnedByDriver>, <ExpectedValue>);
		Assert.assertEquals(driver.getTitle(), "NumpyNinja");

	}

}
