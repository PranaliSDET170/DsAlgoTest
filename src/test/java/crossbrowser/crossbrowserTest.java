package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class crossbrowserTest<Edgeoptions> {
	    WebDriver driver;
	    FirefoxOptions firefoxoptions = new FirefoxOptions();
	    ChromeOptions chromeoptions   = new ChromeOptions();
	    @SuppressWarnings("unchecked")
	    Edgeoptions edgeoptions = (Edgeoptions) new EdgeOptions();
	
	    @SuppressWarnings("null")
	    @BeforeTest
	
public void initialize(String browser)
  {
		
		     String brower = null;
		if(browser.equalsIgnoreCase("firebox")) {
			 
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 System.out.println("Firefox is launched");
			 
    	 }
		 else if (brower.equalsIgnoreCase("chrome")) {
			 
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 System.out.println("Chrome is launched");
			 
		 }
        else if (brower.equalsIgnoreCase("edge")) {
		     WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			 System.out.println("Edge is launched");
			 
		 }
  
  }
  
  @Test
  public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver = createBrowserInstance();

	   driver.get("https://dsportalapp.herokuapp.com/login");
	   String actual = driver.getTitle();
	   String expect = "Dsportalapp";
	   Assert.assertEquals(actual.contains("Dsportalapp"), expect.contains("Dsportalapp"));
	  
  }
       @AfterTest
       public void endTest() {
    	   
    	   driver.quit();
       }
       

private WebDriver createBrowserInstance() {
	// TODO Auto-generated method stub
	return null;
}
}