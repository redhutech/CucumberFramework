package TestRunner;

//import org.junit.runner.RunWith; 

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)


@CucumberOptions(
		
		features = ".//Features/ShopingLoginFeature.feature",
		glue="StepDefination",
		dryRun = false, 
		monochrome = true,
		//tags = "@Sanity",
		plugin = {"pretty","html: target/cucumber-reports/report.html"}
		)

//"pretty","html: target/cucumber-reports/report.html"
//pretty","html: target/cucumber-reports/report_json.json
//"pretty","html: target/cucumber-reports/report_xml.xml"

public class Run extends AbstractTestNGCucumberTests{
	/*This class will be empty*/
}

