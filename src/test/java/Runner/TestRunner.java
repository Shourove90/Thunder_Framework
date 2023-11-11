package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features ="Features",
		glue = "Steps"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

	
	
}
