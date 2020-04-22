package com.Framework.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameHelper {

	private static FrameHelper frameHelper;
	protected WebDriver Driver;

	private FrameHelper(WebDriver driver) {
		Driver = driver;
	}

	public static FrameHelper getInstance(WebDriver driver) {
		frameHelper = new FrameHelper(driver);
		return frameHelper;
	}

	public void switchToFrame(By locator) {
		Driver.switchTo().frame(Driver.findElement(locator));
	}

	public void switchToDefault() {
		Driver.switchTo().defaultContent();
	}

}
