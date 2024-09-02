package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.PythonEditorPage;
import utilities.WebDriverManager;

public class PythonEditorSteps {

	private PythonEditorPage pythonEditorPage;

	public PythonEditorSteps(WebDriverManager driverManager) {
		this.pythonEditorPage = new PythonEditorPage(driverManager.getDriver());
	}

	@When("user clicks on Try here button")
	public void user_clicks_on_try_here_button() {
		pythonEditorPage.clickTryHereButton();
	}

	@When("user writes valid python code")
	public void user_writes_valid_python_code() {
		String pythonCode = "print \"Hello\"";
		pythonEditorPage.writePythonCode(pythonCode);

	}

	@Then("user writes python code {string}")
	public void user_writes_python_code(String pythonCode) {
		pythonEditorPage.writePythonCode(pythonCode);
	}
	
	@When("user clicks on Run button")
	public void user_clicks_on_run_button() {
		pythonEditorPage.clickRunButton();
	}

	@Then("user is able to see the output in the console")
	public void user_is_able_to_see_the_output_in_the_console() {
		pythonEditorPage.verifyConsoleOutput("Hello");

	}

}
