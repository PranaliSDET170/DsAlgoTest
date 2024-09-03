package DsAlgoPageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataStructIntroPage {
	
		public static ChromeDriver driver = new ChromeDriver();
			
			String URL = "https://dsportalapp.herokuapp.com/login" ;
			
		    By usernameID=By.id("id_username");
		    By passwordID=By.id("id_password");
		    By getstarted = By.xpath("//a[@href='data-structures-introduction']");
		    By timeComplexity = By.linkText("Time Complexity");
		    By TimeComplexity = By.linkText("/data-structures-introduction/time-complexity/");
		    By practiceQues = By.linkText("Practice Questions");
		    By tryhere = By.linkText("Try here>>>");
		    By RunButton = By.xpath("//button");
		    
		    public DataStructIntroPage () {
		    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    	
		   	driver.findElement(usernameID).sendKeys("ArinSwalke");
		   	driver.findElement(passwordID).sendKeys("Nandita@09");
		   	driver.findElement(getstarted).click();
		   	driver.findElement(timeComplexity).click();
		   	driver.findElement(TimeComplexity).click();
		   	driver.findElement(practiceQues).click();
		   	driver.findElement(tryhere).click();
		   	String script = "var editor = document.querySelector('.CodeMirror').CodeMirror; editor.setValue(arguments[0]);";
		   	JavascriptExecutor js = (JavascriptExecutor) driver;
		   	js.executeScript(script, "print \"Hello\"");
		    	  
		    	

		}

		}


