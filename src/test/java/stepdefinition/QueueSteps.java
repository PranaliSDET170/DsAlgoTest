package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueSteps {
	
	WebDriver driver;
	
	@After
	public void closeWebPage() throws InterruptedException {
		Thread.sleep(10000);
		LoginSteps.getDriver().close();
	}

	@Given("user is on homepage")
	public void user_is_on_homepage() {

	}

	@When("user clicks on get started button in queue module")
	public void user_clicks_on_get_started_button_in_queue_module() {

	}

	@Then("user is navigated to queue homepage")
	public void user_is_navigated_to_queue_homepage() {

	}

}
