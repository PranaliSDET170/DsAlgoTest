package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.TreePage;
import utilities.WebDriverManager;

public class TreeSteps {

	private TreePage treePage;

	public TreeSteps(WebDriverManager driverManager) {
		this.treePage = new TreePage(driverManager.getDriver());
	}

	@When("user clicks on get started button in tree module")
	public void user_clicks_on_get_started_button_in_tree_module() {
		treePage.clickGetStartedButton();
	}

	@Then("user is navigated to tree homepage")
	public void user_is_navigated_to_tree_homepage() {
		treePage.verifyUserIsOnTreeHomePage();

	}

	@When("user clicks on Trees {string} link")
	public void user_clicks_on_queues_link(String string) {
		treePage.clickLinkByText(string);
	}

	@Then("user is on Trees {string} homepage")
	public void user_is_on_trees_homepage(String string) {
		treePage.verifyUserIsNavigatedToPage(string);
	}

}
