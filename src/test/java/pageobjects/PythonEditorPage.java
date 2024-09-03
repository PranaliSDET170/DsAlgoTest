package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PythonEditorPage {

	private WebDriver driver;

	By tryHereLink = By.linkText("Try here>>>");
	By runBtn = By.xpath("//button");
	By outPutTxt = By.id("output");

	public PythonEditorPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void clickTryHereButton() {
		driver.findElement(tryHereLink).click();
	}

	public void writePythonCode(String pythonCode) {
		String script = "var editor = document.querySelector('.CodeMirror').CodeMirror; editor.setValue(arguments[0]);";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, pythonCode);
	}

	public void clickRunButton() {
		driver.findElement(runBtn).click();
	}

	public void verifyConsoleOutput(String expected) {
		Assert.assertEquals(driver.findElement(outPutTxt).getText(), expected);

	}

	public void verifyAlertWindow(String expectedAlertText) {
		String actualAlertText = null;
		try {
			// Check the presence of alert
			Alert alert = driver.switchTo().alert();
			
			//Get Alert text
			actualAlertText = alert.getText();
			
			// if present consume the alert
			alert.accept();

		} catch (NoAlertPresentException ex) {
		
		} finally {
			Assert.assertEquals(actualAlertText, expectedAlertText);
		}
	}

}
