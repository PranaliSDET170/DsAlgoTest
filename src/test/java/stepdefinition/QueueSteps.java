package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.QueuePage;
import utilities.WebDriverManager;

public class QueueSteps {
	
	private QueuePage queuePage;

	public QueueSteps(WebDriverManager driverManager) {
		this.queuePage = new QueuePage(driverManager.getDriver());
	}

	@When("user clicks on get started button in queue module")
	public void user_clicks_on_get_started_button_in_queue_module() {
		queuePage.clickGetStartedButton();
	}

	@Then("user is navigated to queue homepage")
	public void user_is_navigated_to_queue_homepage() {
		queuePage.verifyUserIsOnQueueHomePage();

	}
	
//	@Given("user is on queue homepage")
//	public void user_is_on_queue_homepage() {
//		Assert.assertEquals(driver.getTitle(), "Queue");
//	}

//	@When("user clicks on Implementation of Queue in Python link")
//	public void user_clicks_on_implementation_of_queue_in_python_link() {
//		queuePage.clickImplementationOfQueueInPythonLink();
//	}
//
//	@Then("user is navigated to Implementation of Queue in Python homepage")
//	public void user_is_navigated_to_implementation_of_queue_in_python_homepage() {
//		queuePage.verifyUserIsOnImplementationOfQueueInPythonHomePage();
//
//	}
	
	@When("user clicks on Queues {string} link")
	public void user_clicks_on_queues_link(String string) {
		queuePage.clickLinkByText(string);
	}

	@Then("user is navigated to Queues {string} homepage")
	public void user_is_navigated_to_queues_homepage(String string) {
	    queuePage.verifyUserIsNavigatedToPage(string);
	}

//
//	
//
//	@When("user clicks on Implementation using collections.deque link")
//	public void user_clicks_on_implementation_using_collections_deque_link() {
//		driver.findElement(By.linkText("Implementation using collections.deque")).click();
//
//	}
//
//	@Then("user is navigated to Implementation using collections.deque homepage")
//	public void user_is_navigated_to_implementation_using_collections_deque_homepage() {
//		Assert.assertEquals(driver.getTitle(), "Implementation using collections.deque");
//
//	}
//
//	@When("user clicks on Implementation using array link")
//	public void user_clicks_on_implementation_using_array_link() {
//		driver.findElement(By.linkText("Implementation using array")).click();
//	}
//
//	@Then("user is navigated to Implementation using array homepage")
//	public void user_is_navigated_to_implementation_using_array_homepage() {
//		Assert.assertEquals(driver.getTitle(), "Implementation using array");
//
//	}
//
//	@When("user clicks on Queue Operations link")
//	public void user_clicks_on_queue_operations_link() {
//		driver.findElement(By.linkText("Queue Operations")).click();
//
//	}
//
//	@Then("user is navigated to Queue Operations homepage")
//	public void user_is_navigated_to_queue_operations_homepage() {
//		Assert.assertEquals(driver.getTitle(), "Queue Operations");
//
//	}

}
