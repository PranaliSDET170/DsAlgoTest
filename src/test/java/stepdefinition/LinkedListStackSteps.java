package stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

public class LinkedListSteps{
	
	WebDriver driver = LoginSteps.getDriver();

	@When("User clicks the Get Started button in Linked List Panel")
	public void user_clicks_the_get_started_button_in_linked_list_panel() {
		driver.findElement(By.xpath("//a[@href='linked-list']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		Assert.assertEquals(driver.getTitle(), string);
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string) {
		driver.findElement(By.linkText(string)).click();
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		driver.findElement(By.linkText(string)).click();
	}

	@Then("The user should be redirected to a page having Editor and run button")
	public void the_user_should_be_redirected_to_a_page_having_editor_and_run_button() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}

	@When("The user writes the valid python code")
	public void the_user_writes_the_valid_python_code() {
		String script = "var editor = document.querySelector('.CodeMirror').CodeMirror; editor.setValue(arguments[0]);";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, "print \"Hello\"");
	}

	@When("Click run button")
	public void click_run_button() {
		driver.findElement(By.xpath("//button")).click();
	}

	@Then("The user is able to see the output inside the console")
	public void the_user_is_able_to_see_the_output_inside_the_console() {
		Assert.assertEquals(driver.findElement(By.id("output")).getText(), "Hello");
	}

	@When("The user writes the invalid python code")
	public void the_user_writes_the_invalid_python_code() {
		String script = "var editor = document.querySelector('.CodeMirror').CodeMirror; editor.setValue(arguments[0]);";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, "printer \"Hello\"");
	}

	@Then("The user see error msg in alert window")
	public void the_user_see_error_msg_in_alert_window() {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert detected with text: " + alertText);
	}
	
}
