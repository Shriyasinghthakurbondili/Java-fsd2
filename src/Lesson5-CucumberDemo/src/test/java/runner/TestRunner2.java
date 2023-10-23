package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\lokes\\eclipse-workspace\\Lesson5-CucumberDemo\\src\\test\\java\\features\\HooksDemo.feature",
                 glue = {"steps"},
                 dryRun=false,
                 plugin= {"pretty",
                		 "html:target/cucumberreport.html",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
 						"timeline:test-output-thread/"	
},
      monochrome = true,
      tags="@login"
                 )
public class TestRunner2 {
  
}
