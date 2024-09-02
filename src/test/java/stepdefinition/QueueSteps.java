package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

	@When("user clicks on Queues {string} link")
	public void user_clicks_on_queues_link(String string) {
		queuePage.clickLinkByText(string);
	}

	@Then("user is navigated to Queues {string} homepage")
	public void user_is_navigated_to_queues_homepage(String string) {
		queuePage.verifyUserIsNavigatedToPage(string);
	}

}
