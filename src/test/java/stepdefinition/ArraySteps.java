package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverManager;

public class ArraySteps {
	private final WebDriver driver = DriverManager.getDriver();

	@When("user clicks on get started button in Array module")
	public void user_clicks_on_get_started_button_in_array_module() {
		driver.findElement(By.xpath("//a[@href='array']")).click();

	}

	@Then("user is navigated to Array homepage")
	public void user_is_navigated_to_array_homepage() {
		Assert.assertEquals(driver.getTitle(), "Array");

	}

	@Then("user clicks on Arrays in Python link")
	public void user_clicks_on_arrays_in_python_link() {
		driver.findElement(By.linkText("Arrays in Python")).click();

	}

	@Then("user is navigated to Arrays in Python homepage")
	public void user_is_navigated_to_array_in_python_homepage() {

		Assert.assertEquals(driver.getTitle(), "Arrays in Python");

	}
	@Then("user clicks on Arrays Using List link")
	public void user_clicks_on_arrays_using_list_link() {
		driver.findElement(By.linkText("Arrays Using List")).click();
	    
	}
	@Then("user is navigated to Arrays Using List homepage")
	public void user_is_navigated_to_arrays_using_list_homepage() {
		Assert.assertEquals(driver.getTitle(), "Arrays Using List");
	   
	    
	}
	@Then("user clicks on Basic Operations in Lists link")
	public void user_clicks_on_basic_operations_in_lists_link() {
		driver.findElement(By.linkText("Basic Operations in Lists")).click();
	    
	}

	@Then("user is navigated to Basic Operations in Lists homepage")
	public void user_is_navigated_to_basic_operations_in_lists_homepage() {
	   
		Assert.assertEquals(driver.getTitle(), "Basic Operations in Lists");
	}
	@Then("user clicks on Applications of Array link")
	public void user_clicks_on_applications_of_array_link() {
	   
		driver.findElement(By.linkText("Applications of Array")).click();
	}

	@Then("user is navigated to Applications of Array homepage")
	public void user_is_navigated_to_applications_of_array_homepage() {
	   
		Assert.assertEquals(driver.getTitle(), "Applications of Array");
	}

}
