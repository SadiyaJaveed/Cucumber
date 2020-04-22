package com.Framework.Helpers;

import org.openqa.selenium.WebDriver;

public class BrowserHelper {

	private static BrowserHelper browserHelper;
	protected WebDriver Driver;

	private BrowserHelper(WebDriver driver) {
		Driver = driver;
	}

	public static BrowserHelper getInstance(WebDriver driver) {
		browserHelper = new BrowserHelper(driver);
		return browserHelper;
	}

	public void navigateTo(String url) {
		Driver.navigate().to(url);
	}

	public String fetchTitle() {
		String title = Driver.getTitle();
		return title;
	}

	public void moveForward() {
		Driver.navigate().forward();
	}

	public void moveBackward() {
		Driver.navigate().back();
	}

	public void refresh() {
		Driver.navigate().refresh();
	}

	public void maximize() {
		Driver.manage().window().maximize();
	}

	public void closebrowser() {
		Driver.close();
	}

}
