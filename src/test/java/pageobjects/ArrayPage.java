package pageobjects;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class ArrayPage {
	public static ChromeDriver driver = new ChromeDriver();
	
	String URL = "https://dsportalapp.herokuapp.com/login" ;
	
    By usernameID=By.id("id_username");
    By passwordID=By.id("id_password");
    By getstarted = By.xpath("//a[@href='array']");
    By arraysinpython = By.linkText("Arrays in Python");
    By arraysusinglist = By.linkText("Arrays Using List");
    By basicoperationsinlists = By.linkText("Basic Operations in Lists");
    By applicationsofarray = By.linkText("Applications of Array");
    By practiceQues = By.linkText("Practice Questions");
    By tryhere = By.linkText("Try here>>>");
    By RunButton = By.xpath("//button");
    
	public ArrayPage() {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(usernameID).sendKeys("ArinSwalke");
	driver.findElement(passwordID).sendKeys("Nandita@09");
	driver.findElement(getstarted).click();
	driver.findElement(arraysinpython).click();
	driver.findElement(arraysusinglist).click();
	driver.findElement(basicoperationsinlists).click();
	driver.findElement(applicationsofarray).click();
	driver.findElement(practiceQues).click();
	driver.findElement(tryhere).click();
	String script = "var editor = document.querySelector('.CodeMirror').CodeMirror; editor.setValue(arguments[0]);";
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript(script, "print \"Hello\"");
	

	
	}
	
	
	
	

}
