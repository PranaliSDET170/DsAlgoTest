package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class DriverConfig {

    private static WebDriver driver;

    private static WebDriver createBrowserInstance() {

        // Reference of local variable
        WebDriver driverInstance = null;

        String browserName = ConfigPropertiesReader.getPropertyValue("browserKey");

        // Initialize local variable based on property
        if (browserName.equalsIgnoreCase("Chrome")) {
            driverInstance = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("FireFox")) {
            driverInstance = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Safari")) {
            driverInstance = new SafariDriver();
        } else {
            Assert.fail("Invalid Browser Name");
        }

        return driverInstance;

    }

    public static WebDriver getDriver() {
        if(driver ==null) {
            driver = createBrowserInstance();
        }
        return driver;
    }

}
