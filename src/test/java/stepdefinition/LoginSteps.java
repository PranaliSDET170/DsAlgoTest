package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.LinkedListPage;
import pageobjects.LoginPage;
import utilities.ExcelCredentials;
import utilities.WebDriverManager;

public class LoginSteps {

	private LoginPage loginPage;

	public LoginSteps(WebDriverManager driverManager) {
		this.loginPage = new LoginPage(driverManager.getDriver());
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		this.loginPage.openLoginPage();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		//loginPage.enterUserName("ArinSwalke");
		//loginPage.enterPassword("Nandita@09");
		
		ExcelCredentials excelCredentials = new ExcelCredentials();		
		String credentials[] = excelCredentials.getUserNameAndPassword();		
		String username = credentials[0];
		String password = credentials[1];
		
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		loginPage.clickLogin();
	}

}
