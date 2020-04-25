package com.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src/test/java/com/Features" }, 
		glue = { "com.Steps", "com.Hooks" }, 
		tags = {"@DataTable" },
		//tags = {"not @DataTable"},
		// tags = {"@Parameters or @ExampleTable" and (not @DataTable)"},
		plugin = {"pretty", "html:target/Reports/FreshReport" },
		//plugin = { "pretty", "json:target/Reports/AutomationReport.json" },
		// plugin = {"pretty", "junit:target/Reports/ExecutionReport.xml" },
		dryRun = false, monochrome = true)

public class TestNGRunner extends AbstractTestNGCucumberTests {

}