package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/TestRusult.html"}, //reporting purpose
			monochrome=true,  //console output colour
			tags = "@Queue", //tags from feature file
			features = {"src/test/resources/features/Queue.feature"}, //location of feature files
			glue= "stepdefination") //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();	
	    }

	
}