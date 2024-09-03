package stepdefinition;

import java.util.Map;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.PythonEditorPage;
import utilities.ExcelReader;
import utilities.WebDriverManager;

public class PythonEditorSteps {

	private PythonEditorPage pythonEditorPage;
	
	String pythonCode;
	String result;
	String alert;

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
		this.result = "Hello";
		pythonEditorPage.writePythonCode(pythonCode);

	}

	@Then("user writes python code {string}")
	public void user_writes_python_code(String pythonCode) {
		this.result = "Hello";
		pythonEditorPage.writePythonCode(pythonCode);
	}
	
	@When("user clicks on Run button")
	public void user_clicks_on_run_button() {
		pythonEditorPage.clickRunButton();
	}

	@Then("user is able to see the output in the console")
	public void user_is_able_to_see_the_output_in_the_console() {
		pythonEditorPage.verifyConsoleOutput(this.result);
	}
	
	@Then("Write python code from Sheet {string} at RowNumber {int} and enter")
	public void write_python_code_from_sheet_at_row_number_and_enter(String sheetName, Integer rowNum) {
		//Read test data from excel
		ExcelReader excelReader = new ExcelReader(sheetName);
		Map<String, String> excelRow = excelReader.getData(rowNum);
		pythonCode = excelRow.get("pythonCode");
		result = excelRow.get("Result");
		alert = excelRow.get("Alert");
		
		//Use test data to write python script
		pythonEditorPage.writePythonCode(pythonCode);
	}
	
	@Then("Verify alert window and close it")
	public void verify_alert_window_and_close_it() {
		pythonEditorPage.verifyAlertWindow(this.alert);
	}


}
