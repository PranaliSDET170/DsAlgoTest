package Extent.report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport2 {
	
	private static ExtentReports extentReports2;

	public static void main(String[] args) throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		ExtentReports extentReports = new ExtentReports();
		File file = new File("Extentrepot.html");
		//Created extentreport by relative path
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("Extentreport.html");
		ExtentReports ExtentReport;
		extentReports.attachReporter(sparkReporter);
		
		
	    extentReports
	    .createTest("Array").log(Status.INFO, "info1");
	    extentReports.createTest("driver.findElement(By.xpath(\"//a[@href='array']\")).click();").log(Status.INFO, "info1");
	    extentReports.createTest("user is navigated to Array homepage").log(Status.INFO, "info2");
	    extentReports.createTest("user clicks on Arrays in Python link").log(Status.INFO, "info2");
	    extentReports.createTest("user is navigated to Arrays in Python homepage").log(Status.PASS, "pass");
	    extentReports.createTest("user clicks on Arrays Using List link").log(Status.WARNING, "warning");
	    extentReports.createTest("user is navigated to Arrays Using List homepage").log(Status.WARNING, "warning");
	    extentReports.createTest("user clicks on Basic Operations in Lists link").log(Status.SKIP, "skip");
	    extentReports.createTest("user is navigated to Basic Operations in Lists homepage").log(Status.FAIL, "fail");
	    extentReports.createTest("user clicks on Applications of Array link").log(Status.PASS, "pass");
	    extentReports.createTest("user is navigated to Applications of Array homepage").log(Status.PASS, "pass");
	    
	    extentReports
	    .createTest("Graph").log(Status.INFO, "info1");
	    extentReports.createTest("user clicks on get started button in Graph module").log(Status.INFO, "info1");
	    extentReports.createTest("user is navigated to Graph homepage").log(Status.SKIP, "skip");
	    extentReports.createTest("user clicks on Graph link").log(Status.PASS, "pass");
	    extentReports.createTest("user clicks on Graph Representations link").log(Status.PASS, "pass");
	    extentReports.createTest("user is navigated to Graph Representations homepage").log(Status.PASS, "pass");
	    
	    String xmlData = "<menu id=\"file\" value=\"File\">\r\n"
	    		+ "  <popup>\r\n"
	    		+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
	    		+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
	    		+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
	    		+ "  </popup>\r\n"
	    		+ "</menu>" ;
	    
	    String jsonData = "{\"menu\": {\r\n"
	    		+ "  \"id\": \"file\",\r\n"
	    		+ "  \"value\": \"File\",\r\n"
	    		+ "  \"popup\": {\r\n"
	    		+ "    \"menuitem\": [\r\n"
	    		+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
	    		+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
	    		+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
	    		+ "    ]\r\n"
	    		+ "  }\r\n"
	    		+ "}}" ;
	    
	    extentReports
	    .createTest("XML based Test")
	    .info(MarkupHelper.createCodeBlock(xmlData, CodeLanguage.XML));
	    
	    extentReports
	    .createTest("JSON based Test") 
	    .log(Status.INFO, MarkupHelper.createCodeBlock(jsonData, CodeLanguage.JSON));
		
		List<String> listData = new ArrayList<>();
		listData.add("Nandita");
		listData.add("Walke");
		
		Map<Integer, String> mapData = new HashMap<>();
		mapData.put(101, "Nandita");
		mapData.put(102, "Walke");
		
		Set<Integer> setData = mapData.keySet();
		
	    extentReports
	   .createTest("List based Test")
      .info(MarkupHelper.createOrderedList(listData));
	   
	   extentReports
	   .createTest("Set based Test")
       .info(MarkupHelper.createOrderedList(setData));
	   
	     
	   
	   extentReports
	   .createTest("Map based Test")
       .info(MarkupHelper.createOrderedList(mapData));
	  
	    	       
	    extentReports.flush();
		Desktop.getDesktop().browse(new File("Extentreport.html").toURI());
		
	    
	   
	   
	
			

}

	private static void file(Markup unorderedList) {
		// TODO Auto-generated method stub
		
	}

	private static void info(Markup orderedList) {
		// TODO Auto-generated method stub
		
	}

	private static Object CodeLanguage(String xmlData, CodeLanguage xml) {
		// TODO Auto-generated method stub
		return null;
	}

	private static ExtentTest createTest(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void log(Status info, String string) {
		// TODO Auto-generated method stub
		
	}
}
