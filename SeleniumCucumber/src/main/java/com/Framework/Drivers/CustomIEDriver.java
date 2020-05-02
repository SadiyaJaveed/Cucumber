package com.Framework.Drivers;

import org.openqa.selenium.ie.ElementScrollBehavior;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomIEDriver {
	
	private void setWebDriverManager() {
		WebDriverManager.iedriver().setup();
	}
	
	private InternetExplorerOptions getInternetExplorerOptions() {
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.destructivelyEnsureCleanSession();
		options.ignoreZoomSettings();
		options.introduceFlakinessByIgnoringSecurityDomains();
		options.elementScrollTo(ElementScrollBehavior.BOTTOM);
		return options;
	}
	
	public InternetExplorerDriver getIEDriver() {
		setWebDriverManager();
		InternetExplorerOptions options = getInternetExplorerOptions();
		InternetExplorerDriver driver = new InternetExplorerDriver(options);
		return driver;
	}

}
