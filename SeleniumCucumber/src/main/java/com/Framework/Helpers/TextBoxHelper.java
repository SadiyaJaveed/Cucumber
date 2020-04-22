package com.Framework.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxHelper {

	private static TextBoxHelper textboxHelper;
	protected WebDriver Driver;

	private TextBoxHelper(WebDriver driver) {
		Driver = driver;
	}

	public static TextBoxHelper getInstance(WebDriver driver) {
		textboxHelper = new TextBoxHelper(driver);
		return textboxHelper;
	}

	public void setText(By locator, String value) {
		Driver.findElement(locator).sendKeys(value);
	}

	public void clearText(By locator) {
		Driver.findElement(locator).clear();
	}

	public String fetchText(By locator, String value) {
		String text = Driver.findElement(locator).getAttribute(value);
		return text;
	}
}
