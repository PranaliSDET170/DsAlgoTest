package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverManager {

	private static WebDriver driver;

	public static void createDriver() {
		String browserName = ConfigPropertiesReader.getPropertyValue("browserKey");

		// Initialize local variable based on property
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		} else {
			Assert.fail("Invalid Browser Name");
		}
	}

	public synchronized static void closeDriver() {
		System.out.println("Close Driver!!!");
		driver.close();
	}

	public synchronized static WebDriver getDriver() {
		return driver;
	}

}
