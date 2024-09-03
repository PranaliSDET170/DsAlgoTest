package utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentManager {
	private static ExtentReports extent;
    private static ExtentSparkReporter htmlReporter;
    private static ExtentTest test;
	
	
	 public static ExtentReports getInstance() {
	        if (extent == null) {
	            htmlReporter = new ExtentSparkReporter("extent-report.html");
	            extent = new ExtentReports();
	            extent.attachReporter(htmlReporter);
	        }
	        return extent;
	    }
	    
	public static ExtentTest createTest(String testName) {
	        test = extent.createTest(testName);
	        return test;
	    }
	    
	    public static ExtentTest getTest() {
	        return test;
	    }
	}


