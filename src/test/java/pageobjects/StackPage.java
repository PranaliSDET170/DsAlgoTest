package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StackPage {
	
	private WebDriver driver;
	By getStartedBtn = By.xpath("//a[@href='stack']");
	

	public StackPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickGetStartedButton() {
		driver.findElement(getStartedBtn).click();
	}

	public void verifyUserIsOnStackHomePage() {
		Assert.assertEquals(driver.getTitle(), "Stack");
	}

	public void clickLinkByText(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}

	public void verifyUserIsNavigatedToPage(String pageTitle) {
		Assert.assertEquals(driver.getTitle(), pageTitle);
	}

}