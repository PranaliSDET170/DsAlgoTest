package stepdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private static final WebDriver driver = new ChromeDriver();
	
	public static WebDriver getDriver() {
		return driver;
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

	@And("cicks on login button")
	public void cicks_on_login_button() {
		driver.findElement(By.xpath("//input[4]")).click();

	}
	
	@Then("user is successfully logged in")
	public void user_is_successfully_logged_in() {
		Assert.assertEquals(driver.findElement(By.className("alert")).getText(), "You are logged in");
	}
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		//Assert.assertEquals(<ActualValueReturnedByDriver>, <ExpectedValue>);
		Assert.assertEquals(driver.getTitle(), "NumpyNinja");

	}

}
