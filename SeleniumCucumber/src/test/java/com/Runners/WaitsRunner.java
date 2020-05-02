package com.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src/test/java/com/Features/WorkingWithWaits.feature" },
		tags = {"@ExplicitWait"},
		glue = { "com.Steps", "com.Hooks" }, 
		plugin = {"json:target/waits.json" },
		dryRun = false, monochrome = true)

public class WaitsRunner extends AbstractTestNGCucumberTests{
	

}
