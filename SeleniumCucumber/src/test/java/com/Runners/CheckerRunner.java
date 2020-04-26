package com.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src/test/java/com/Features/CheckerTool.feature" }, 
		glue = { "com.Steps", "com.Hooks" }, 
		plugin = {"json:target/checker.json" },
		dryRun = false, monochrome = true)

public class CheckerRunner extends AbstractTestNGCucumberTests {

}
