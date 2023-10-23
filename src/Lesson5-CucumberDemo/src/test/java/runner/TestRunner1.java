package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\lokes\\eclipse-workspace\\Lesson5-CucumberDemo\\src\\test\\java\\features\\HooksDemo.feature",
                 glue = {"steps"},
                 dryRun=false,
                 plugin= {"pretty",
		                   "html:target/cucumberreport.html"},
                 monochrome = true,//console output will be in more readable format
                //tags = "@login"
                 tags="@functional"
                 )
public class TestRunner1 {

	
}
