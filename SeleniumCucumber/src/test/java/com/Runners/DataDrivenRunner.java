package com.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src/test/java/com/Features/CucumberDataDriven.feature" }, 
		glue = { "com.Steps", "com.Hooks" }, 
		tags = {"@DataTable"},
		plugin = {"json:target/datadriven.json" },
		dryRun = false, monochrome = true)

public class DataDrivenRunner extends AbstractTestNGCucumberTests {

}
