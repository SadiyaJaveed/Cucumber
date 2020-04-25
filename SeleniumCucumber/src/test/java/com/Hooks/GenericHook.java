package com.Hooks;

import org.openqa.selenium.WebDriver;

import com.Framework.Services.DriverService;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class GenericHook {

	private DriverService service;
	protected WebDriver driver;

	public GenericHook(DriverService service) {
		this.service = service;
		this.driver = service.getDriver();
	}

	@Before
	public void setUp() {

	}

	/*
	 * To take screenshot on failure, we need to inject Scenario object (from io.cucumber.java) in @After hook 
	 * this scenario object will hold the runtime info about the scenario
	 */
	@After
	public void tearDown(Scenario runtimeInfo) {
		// to generate unique filename for every screenshot, we use Math.random() method and typecast it into int
		int random = (int) (Math.random() * 1000); // everytime it will generate a random number between 0 to 1000

		if (runtimeInfo.isFailed()) {
			service.getScreenshotHelper().takeScreenshot("target\\Screenshots", "FailedScreen " + random + ".png"); 
			// this will take screenshot and save in the directory
			runtimeInfo.embed(service.getScreenshotHelper().takeScreenshot(), "image/png", "Failed Screen"); 
			// this is to embed screenshot to the report
		}
		
		driver.quit();
	}

}
