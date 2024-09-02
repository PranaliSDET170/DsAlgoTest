package stepdefinition;

import java.util.Map;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import utilities.ExcelReader;
import utilities.WebDriverManager;

public class LoginSteps {

	private LoginPage loginPage;

	private String userName;
	private String password;
	private String expectedMessage;

	public LoginSteps(WebDriverManager driverManager) {
		this.loginPage = new LoginPage(driverManager.getDriver());
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		this.loginPage.openLoginPage();
		this.userName = "ArinSwalke";
		this.password = "Nandita@09";
		this.expectedMessage = "You are logged in";
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		loginPage.enterUserName(this.userName);
		loginPage.enterPassword(this.password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		loginPage.clickLogin();
	}

	@Given("User crdentials are read from Sheet {string} at RowNumber {int}")
	public void user_crdentials_are_read_from_sheet_user_credentials_at_row_number(String sheetName, Integer rowNum) {
		ExcelReader excelReader = new ExcelReader(sheetName);
		Map<String, String> excelRow = excelReader.getData(rowNum);
		System.out.println(excelRow);
		this.userName = excelRow.get("username");
		this.password = excelRow.get("password");
		this.expectedMessage = excelRow.get("expectedmessage");
	}

	@Then("Verify alert message for login action")
	public void verify_alert_message_for_login_action() {
		loginPage.verifyAlertMessage(expectedMessage);
	}

}
