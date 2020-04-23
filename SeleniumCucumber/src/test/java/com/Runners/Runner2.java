package com.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src/test/java/com/Features/WorkingWithWaits.feature" }, 
		glue = { "com.Steps", "com.Hooks" }, 
		//tags = {"@ExampleTable" },
		//tags = {"not @DataTable"},
		// tags = {"@Parameters or @ExampleTable" and (not @DataTable)"},
		plugin = {"pretty", "html:target/Reports/TestNGxml2Report" },
		//plugin = { "pretty", "json:target/Reports/AutomationReport.json" },
		// plugin = {"pretty", "junit:target/Reports/ExecutionReport.xml" },
		dryRun = false, monochrome = true)

public class Runner2 extends AbstractTestNGCucumberTests{
	

}
