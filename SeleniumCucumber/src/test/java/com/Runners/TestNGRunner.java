package com.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src/test/java/com/Features/WorkingWithDropdown.feature" ,  "src/test/java/com/Features/WorkingWithAlerts.feature"}, 
		glue = { "com.Steps", "com.Hooks" },
		tags = {"@Dropdown"},
		// tags = {"@Parameters or @ExampleTable" and (not @DataTable)"},
		plugin = {"json:target/dropdown.json" },
		//plugin = { "pretty", "json:target/Reports/AutomationReport.json" },
		// plugin = {"pretty", "junit:target/Reports/ExecutionReport.xml" },
		dryRun = false, monochrome = true)

public class TestNGRunner extends AbstractTestNGCucumberTests {

}