package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LinkedListPage {
	private WebDriver driver;
	By getStartedBtn = By.xpath("//a[@href='linked-list']");
	

	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickGetStartedButton() {
		driver.findElement(getStartedBtn).click();
	}

	public void verifyUserIsOnLinkedListHomePage() {
		Assert.assertEquals(driver.getTitle(), "Linked List");
	}

	public void clickLinkByText(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}

	public void verifyUserIsNavigatedToPage(String pageTitle) {
		Assert.assertEquals(driver.getTitle(), pageTitle);
	}
}
