package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LinkedListPage;
import utilities.WebDriverManager;

public class LinkedListSteps {
	
	private LinkedListPage linkedlistpage;

	public LinkedListSteps(WebDriverManager driverManager) {
		this.linkedlistpage = new LinkedListPage(driverManager.getDriver());
	}
	
	@When("user clicks the Get Started button in linkedlist module")
	public void user_clicks_the_get_started_button_in_linkedlist_module() {
		linkedlistpage.clickGetStartedButton();
	}	

	@Then("user should be redirected to linkedlist page")
	public void user_should_be_redirected_to_linkedlist_page() {
		linkedlistpage.verifyUserIsOnLinkedListHomePage();

	}

	@When("user clicks {string} link")
	public void user_clicks_link(String string) {
		linkedlistpage.clickLinkByText(string);

	}

	@Then("user should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String string) {
		linkedlistpage.verifyUserIsNavigatedToPage(string);

	}

}