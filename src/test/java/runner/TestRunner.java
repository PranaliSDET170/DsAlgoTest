package runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/TestRusult.html"}, //to generate reports
			monochrome=true,  //console output colour
			tags = "@Queue or @LinkedList or @Stack or @Tree", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= "stepdefinition") //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		ExtentReports extent = new ExtentReports();
		
		@BeforeSuite
		public void setup() {			
			ExtentSparkReporter spark = new ExtentSparkReporter("target/DSAlgoExtentReport.html");
			extent.attachReporter(spark);
			ExtentTest test = extent.createTest("LinkedListSteps");
		}
		
		@AfterSuite
		public void teardown() {
			extent.flush();
		}
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();	
	    }

	
}