package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraySteps {
	WebDriver driver = LoginSteps.getDriver();
	@When("user clicks on get started button in Array module")
	public void user_clicks_on_get_started_button_in_array_module() {
		driver.findElement(By.xpath("//a[@href='array']")).click();
	   
	}

	@Then("user is navigated to Array homepage")
	public void user_is_navigated_to_array_homepage() {
	    
		Assert.assertEquals(driver.getTitle(), "Array");
	}


}
