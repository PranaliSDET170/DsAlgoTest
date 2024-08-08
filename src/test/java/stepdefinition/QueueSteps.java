package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueSteps {
	
	WebDriver driver;
	

	@Given("user is on homepage")
	public void user_is_on_homepage() {

	}

	@When("user clicks on get started button in queue module")
	public void user_clicks_on_get_started_button_in_queue_module() {

	}

	@Then("user is navigated to queue homepage")
	public void user_is_navigated_to_queue_homepage() {

	}

	@After
	public void closeWebPage() throws InterruptedException {
		Thread.sleep(3000);
		LoginSteps.getDriver().close();
	}

}
