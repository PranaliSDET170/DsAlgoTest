package stepdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@Given("user is navigated to login page using {string} browser")
	public void user_is_navigated_to_login_page_using_browser(String browserName) {
		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		}else if (browserName.equals("Safari")) {
			driver = new SafariDriver();
		}
		
		driver.get("https://dsportalapp.herokuapp.com/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

		
	}


	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();

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
		//Assert.assertEquals(<ActualValueReturnedByDriver>, <ExpectedValue>);
		Assert.assertEquals(driver.getTitle(), "NumpyNinja");

	}

}
