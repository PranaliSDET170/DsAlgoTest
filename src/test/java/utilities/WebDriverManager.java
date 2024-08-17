package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class WebDriverManager {

	private final WebDriver driver;

	public WebDriverManager() {
		String browserName = ConfigPropertiesReader.getPropertyValue("browserKey");

		// Initialize local variable based on property
		if (browserName.equalsIgnoreCase("Chrome")) {
			this.driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			this.driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			this.driver = new SafariDriver();
		} else {
			this.driver = null;
			Assert.fail("Invalid Browser Name");
		}
		
		System.out.println("New Driver Created!!!");
	}

	public WebDriver getDriver() {
		return driver;
	}
}
