package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClass01 {
//A thread is an independent path of execution within a program
	@SuppressWarnings("deprecation")
	@Test
	public void test01() {
		System.out.println("I am in test01_class@01 - ID: " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/login");
		
	}
	
	@Test
	public void test02() {
		System.out.println("I am in test02_Class01");
		System.out.println("I am in test01_class@02 - ID: " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/login");
	}
	
	//@Test
	//public void test03(){
	//	System.out.println("I am in test03_Class01");
		//System.out.println("I am in test03_class@01 - ID: " + Thread.currentThread().getId());
		
	}
//}
