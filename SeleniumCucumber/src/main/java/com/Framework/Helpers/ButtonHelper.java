package com.Framework.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonHelper {

	private static ButtonHelper buttonHelper;
	protected WebDriver Driver;

	private ButtonHelper(WebDriver driver) {
		Driver = driver;
	}

	public static ButtonHelper getInstance(WebDriver driver) {
		buttonHelper = new ButtonHelper(driver);
		return buttonHelper;
	}

	public void performClick(By locator) {
		Driver.findElement(locator).click();
	}

}
