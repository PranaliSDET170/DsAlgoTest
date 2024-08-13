package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeSteps {

	WebDriver driver = LoginSteps.getDriver();

	@When("user clicks on get started button in tree module")
	public void user_clicks_on_get_started_button_in_tree_module() {
		driver.findElement(By.xpath("//a[@href='tree']")).click();
	}

	@Then("user is navigated to tree homepage")
	public void user_is_navigated_to_tree_homepage() {
		Assert.assertEquals(driver.getTitle(), "Tree");

	}
	
	@When("user clicks on Overview of Trees link")
	public void user_clicks_on_overview_of_trees_link() {
	    driver.findElement(By.linkText("Overview of Trees")).click();
	    
	}
	
	@Then("user is on Overview of Trees homepage")
	public void user_is_on_overview_of_trees_homepage() {
	     Assert.assertEquals(driver.getTitle(), "Overview of Trees");
	    
	}
	

}
