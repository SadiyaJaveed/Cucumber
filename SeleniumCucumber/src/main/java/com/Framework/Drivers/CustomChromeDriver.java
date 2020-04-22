package com.Framework.Drivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomChromeDriver {

	@SuppressWarnings("unused")
	private void setDriverExecutable() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\IBM_ADMIN\\Selenium\\Chrome Driver\\chromedriver_win32\\chromedriver.exe\\");
	}

	private void setWebDriverManager() {
		WebDriverManager.chromedriver().setup();
	}

	private ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.setHeadless(false);
		return options;
	}

	public ChromeDriver getChromeDriver() {
		ChromeOptions options = getChromeOptions();
		setWebDriverManager();
		ChromeDriver driver = new ChromeDriver(options);
		return driver;

	}

}
