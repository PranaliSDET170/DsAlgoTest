package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.StackPage;
import utilities.WebDriverManager;

public class StackSteps {
	
	private StackPage stackpage;

	public StackSteps(WebDriverManager driverManager) {
		this.stackpage = new StackPage(driverManager.getDriver());
	}
	
	@When("user clicks the Get Started button in stack module")
	public void user_clicks_the_get_started_button_in_stack_module() {
		stackpage.clickGetStartedButton();
	}

	@Then("user should be redirected to stack page")
	public void user_should_be_redirected_to_stack_page() {
		stackpage.verifyUserIsOnStackHomePage();
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string) {
		stackpage.clickLinkByText(string);
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		stackpage.verifyUserIsNavigatedToPage(string);
	}
}