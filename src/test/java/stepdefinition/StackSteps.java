package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class StackSteps{
	
	WebDriver driver = LoginSteps.getDriver();
	
	@When("User clicks the Get Started button in Stack Panel")
	public void user_clicks_the_get_started_button_in_stack_panel() {
		driver.findElement(By.xpath("//a[@href='stack']")).click();
	}

}