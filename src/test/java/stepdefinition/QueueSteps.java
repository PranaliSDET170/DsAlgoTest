package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueSteps {
	/*
	 * Driver instance is required to find elements on the web page. Created static
	 * method getDriver inside LoginSteps class to return required driver instance.
	 */
	WebDriver driver = LoginSteps.getDriver();

	@When("user clicks on get started button in queue module")
	public void user_clicks_on_get_started_button_in_queue_module() {
		driver.findElement(By.xpath("//a[@href='queue']")).click();
	}

	@Then("user is navigated to queue homepage")
	public void user_is_navigated_to_queue_homepage() {
		Assert.assertEquals(driver.getTitle(), "Queue");

	}

	@Given("user is on queue homepage")
	public void user_is_on_queue_homepage() {
		Assert.assertEquals(driver.getTitle(), "Queue");
	}

	@When("user clicks on Implementation of Queue in Python link")
	public void user_clicks_on_implementation_of_queue_in_python_link() {
		driver.findElement(By.linkText("Implementation of Queue in Python")).click();

	}

	@Then("user is navigated to Implementation of Queue in Python homepage")
	public void user_is_navigated_to_implementation_of_queue_in_python_homepage() {
		Assert.assertEquals(driver.getTitle(), "Implementation of Queue in Python");

	}

	@When("user clicks on Try here button")
	public void user_clicks_on_try_here_button() {
		driver.findElement(By.linkText("Try here>>>")).click();

	}

	@When("user writes valid python code")
	public void user_writes_valid_python_code() {
		String script = "var editor = document.querySelector('.CodeMirror').CodeMirror; editor.setValue(arguments[0]);";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, "print \"Hello\"");

	}

	@When("user clicks on Run button")
	public void user_clicks_on_run_button() {
		driver.findElement(By.xpath("//button")).click();
	}

	@Then("user is able to see the output in the console")
	public void user_is_able_to_see_the_output_in_the_console() {
		Assert.assertEquals(driver.findElement(By.id("output")).getText(), "Hello");
	}

	@When("user clicks on Implementation using collections.deque link")
	public void user_clicks_on_implementation_using_collections_deque_link() {
		driver.findElement(By.linkText("Implementation using collections.deque")).click();

	}

	@Then("user is navigated to Implementation using collections.deque homepage")
	public void user_is_navigated_to_implementation_using_collections_deque_homepage() {
		Assert.assertEquals(driver.getTitle(), "Implementation using collections.deque");

	}

}
