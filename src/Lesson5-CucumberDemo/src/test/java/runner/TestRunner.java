package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\lokes\\eclipse-workspace\\Lesson5-CucumberDemo\\src\\test\\java\\features\\HooksDemo.feature",
                 glue = {"steps"},
                 dryRun=true,
                 plugin= {"pretty",
                		 "html:target/cucumberreport.html"},
             //tags="@all"
              // tags="@login"
             tags="@all"
		
		
		
		
		)
public class TestRunner {
  // A cucumber runner file is used to build a communication between your file feature and step definition 
	//Whenever we have to run multiple features or multiple steps, then we have to use Cucumber runner file
	//Whenever have to generate 
	/* - cucumber reports
	 *  -Extend Reports
	 *  -Cucumber reports in PDF format 
	 *  -HTML format 
	 *  -TestNG reports
	 */
	//Whenever you want to generate console output in a different format, a readable format we wil use cucumber runner file will give you options
	//if  we have to set want to set strict conditions for step mapping in feature file and step definition file, we use cucumber runner file
	/*
	 * > set strict conditions for set mapping in feature file and step definition
	 * file > execute few test steps > ignore or exclude few test steps (tagging or grouping)  
	 */
}
