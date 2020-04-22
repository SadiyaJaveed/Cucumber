package com.Framework.Drivers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomFirefoxDriver {

	@SuppressWarnings("unused")
	private void setDriverExecutable() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\IBM_ADMIN\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe\\");
	}

	private void setWebDriverManager() {
		WebDriverManager.firefoxdriver().setup();
	}

	private FirefoxOptions getFirefoxOptions() {
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("marionette", true);
		options.setAcceptInsecureCerts(true);
		return options;
	}

	public FirefoxDriver getFirefoxDriver() {
		FirefoxOptions options = getFirefoxOptions();
		setWebDriverManager();
		FirefoxDriver driver = new FirefoxDriver(options);
		return driver;
	}

}
