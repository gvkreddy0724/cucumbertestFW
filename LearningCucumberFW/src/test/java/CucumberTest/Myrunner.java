package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features="Feature/Tags.feature",tags= {"@FunctionalTest","~@RegressionTest","~@SmokeTest","~@End2End",})
////		   glue="src/test/java/CucumberTest/LoginStepDefination",
//		   dryRun=true,
//		   monochrome = true,
//		   plugin= {"html:target/cucumber-html-report",
//		   "json:target/cucumber-json",
//		   "pretty:target/cucumber-pretty.txt",
//		   "junit:target/cucumber-results.xml"})
public class Myrunner {

}
