package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class QueuePage {

	private WebDriver driver;
	By getStartedBtn = By.xpath("//a[@href='queue']");

	public QueuePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickGetStartedButton() {
		driver.findElement(getStartedBtn).click();
	}

	public void verifyUserIsOnQueueHomePage() {
		Assert.assertEquals(driver.getTitle(), "Queue");
	}

	public void clickLinkByText(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}

	public void verifyUserIsNavigatedToPage(String pageTitle) {
		Assert.assertEquals(driver.getTitle(), pageTitle);
	}
}
