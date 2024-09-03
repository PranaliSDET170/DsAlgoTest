package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WebDriverManager;

public class DataStructureSteps {
	private WebDriver driver;

	public DataStructureSteps(WebDriverManager driverManager) {
		this.driver = driverManager.getDriver();
	}

	@When("user clicks on get started button in Data Structures-Introduction module")
	public void user_clicks_on_get_started_button_in_data_structures_introduction_module() {
		driver.findElement(By.xpath("//a[@href='data-structures-introduction']")).click();

	}

	@Then("user is navigated to Data Structures-Introduction homepage")
	public void user_is_navigated_to_data_structures_introduction_homepage() {
		Assert.assertEquals(driver.getTitle(), "Data Structures-Introduction");

	}

	@When("user clicks on Time Complexity link")
	public void user_clicks_on_time_complexity_link() {
		driver.findElement(By.linkText("Time Complexity")).click();

	}

	@Then("user is navigated to Time Complexity homepage")
	public void user_is_navigated_to_time_complexity_homepage() {
		Assert.assertEquals(driver.getTitle(), "Time Complexity");

	}

}
