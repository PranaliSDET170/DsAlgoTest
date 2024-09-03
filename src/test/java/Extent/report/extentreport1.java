package Extent.report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@SuppressWarnings("unused")
public class extentreport1 {
	    //private static final ExtentReports extentReports = null;
	    public static void main(String[] args) throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		ExtentReports extentReports = new ExtentReports();
		File file = new File("Extentrepot.html");
		//Created extentreport by relative path
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("Extentreport.html");
		ExtentReports ExtentReport;
		extentReports.attachReporter(sparkReporter);
		
		
	    ExtentTest test1 = extentReports.createTest("Test 1");
	    test1.pass("This is passed");
	    
	    ExtentTest test2 = extentReports.createTest("Test 2");
	    test2.log(Status.FAIL,"This is failed");
	    
	    ExtentTest test3 = extentReports.createTest("Test 3");
	    test3.createNode("Test 3").skip("This is skipped");
	    
	    
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("Extentreport.html").toURI());
				
	}

	    private static void flush() {
	 	// TODO Auto-generated method stub
		
		
	}

}
