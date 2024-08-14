package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphSteps {
	WebDriver driver = LoginSteps.getDriver();
	@When("user clicks on get started button in Graph module")
	public void user_clicks_on_get_started_button_in_graph_module() {
		driver.findElement(By.xpath("//a[@href='graph']")).click();
	    
	}

	@Then("user is navigated to Graph homepage")
	public void user_is_navigated_to_graph_homepage() {
		Assert.assertEquals(driver.getTitle(), "Graph");
	    
	    
	}




}
