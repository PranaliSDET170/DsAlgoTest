package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	private WebDriver driver;
	private By txtUserName = By.id("id_username");
	private By txtPassword = By.id("id_password");
	private By btnLoginButton = By.xpath("//input[4]");
	private By alertBox = By.className("alert");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void openLoginPage() {
		driver.get("https://dsportalapp.herokuapp.com/login");
	}

	public void enterUserName(String userName) {
		driver.findElement(txtUserName).sendKeys(userName);
	}

	public void enterPassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btnLoginButton).click();
	}
	
	public void verifyAlertMessage(String expectedMsg) {
		Assert.assertEquals(driver.findElement(alertBox).getText(), expectedMsg);
		
	}

}
