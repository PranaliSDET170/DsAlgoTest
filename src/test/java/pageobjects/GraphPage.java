package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class GraphPage {
public static ChromeDriver driver = new ChromeDriver();
	
	String URL = "https://dsportalapp.herokuapp.com/login" ;
	
    By usernameID=By.id("id_username");
    By passwordID=By.id("id_password");
    By getstarted = By.xpath("//a[@href='graph']");
    By graph = By.linkText("Graph");
    By graphrepresentations = By.linkText("Graph Representations");
    By practiceQues = By.linkText("Practice Questions");
    By tryhere = By.linkText("Try here>>>");
    By RunButton = By.xpath("//button");
    
    public GraphPage() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	
   	driver.findElement(usernameID).sendKeys("ArinSwalke");
   	driver.findElement(passwordID).sendKeys("Nandita@09");
   	driver.findElement(getstarted).click();
   	driver.findElement(graph).click();
   	driver.findElement(graphrepresentations).click();
   	driver.findElement(practiceQues).click();
   	driver.findElement(tryhere).click();
   	String script = "var editor = document.querySelector('.CodeMirror').CodeMirror; editor.setValue(arguments[0]);";
   	JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript(script, "print \"Hello\"");
    	  
    	

}

}