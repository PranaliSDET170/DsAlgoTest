package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

	private WebDriver driver;
	By alertBox = By.className("alert");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyUserSuccessfullyLoggedIn() {
		Assert.assertEquals(driver.findElement(alertBox).getText(), "You are logged in");
	}

	public void verifyUserIsOnHomePage() {
		Assert.assertEquals(driver.getTitle(), "NumpyNinja");
	}
}
