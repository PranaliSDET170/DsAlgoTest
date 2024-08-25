package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/CucumberReport/TestRusult.html", 
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //to generate reports
			monochrome=true,  //console output colour
			tags = "@DsAlgo", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= {"stepdefinition", "hooks"}) //location of step definition files


	public class ParallelTestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
					
			return super.scenarios();	
	    }

	
}