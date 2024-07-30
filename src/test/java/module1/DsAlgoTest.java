package module1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DsAlgoTest {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {

		// Initiate browser driver
		driver = new ChromeDriver();

		// adding implicit wait of 12 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Opening the webpage
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@Test
	public void test001() {
		System.out.println("In test001");

	}

}
