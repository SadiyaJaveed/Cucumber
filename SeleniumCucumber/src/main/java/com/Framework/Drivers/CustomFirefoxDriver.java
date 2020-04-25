package com.Framework.Drivers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomFirefoxDriver {

	@SuppressWarnings("unused")
	private void setDriverExecutable() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sadiy\\Selenium\\geckodriver.exe");
	}

	private void setWebDriverManager() {
		WebDriverManager.firefoxdriver().setup();
	}

	private FirefoxOptions getFirefoxOptions() {
		FirefoxOptions options = new FirefoxOptions();
		//options.addPreference("marionette", true);
		//options.setAcceptInsecureCerts(true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		return options;
	}

	public FirefoxDriver getFirefoxDriver() {
		setWebDriverManager();
		FirefoxOptions options = getFirefoxOptions();
		FirefoxDriver driver = new FirefoxDriver(options);
		return driver;
	}

}
