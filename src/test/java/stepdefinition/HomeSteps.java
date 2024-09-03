package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.HomePage;
import utilities.WebDriverManager;

public class HomeSteps {

	private HomePage homePage;

	public HomeSteps(WebDriverManager driverManager) {
		this.homePage = new HomePage(driverManager.getDriver());
	}

	@Given("user is on homepage")
	public void user_is_on_homepage() {
		homePage.verifyUserIsOnHomePage();
	}

	@Then("user is successfully logged in")
	public void user_is_successfully_logged_in() {
		homePage.verifyUserSuccessfullyLoggedIn();
	}

}
