package com.Framework.Drivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomChromeDriver {

	@SuppressWarnings("unused")
	private void setDriverExecutable() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadiy\\Selenium\\chromedriver.exe");
	}

	private void setWebDriverManager() {
		WebDriverManager.chromedriver().setup();
	}

	private ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		options.setHeadless(false);
		return options;
	}

	public ChromeDriver getChromeDriver() {
		setWebDriverManager();
		ChromeOptions options = getChromeOptions();
		ChromeDriver driver = new ChromeDriver(options);
		return driver;
	}

}
