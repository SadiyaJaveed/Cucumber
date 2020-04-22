package com.Framework.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHelper {

	private static DropdownHelper dropdownHelper;
	protected WebDriver Driver;

	private DropdownHelper(WebDriver driver) {
		Driver = driver;
	}

	public static DropdownHelper getInstance(WebDriver driver) {
		dropdownHelper = new DropdownHelper(driver);
		return dropdownHelper;
	}

	// can be used in stepdfn without POM
	public void selectUsingIndex(By locator, int value) {
		Select select = new Select(Driver.findElement(locator));
		select.selectByIndex(value);
	}

	// can be used in stepdfn with POM
	public void selectUsingIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}

	public void selectUsingVisibletext(By locator, String value) {
		Select select = new Select(Driver.findElement(locator));
		select.selectByVisibleText(value);
	}

	public void selectUsingValue(By locator, String value) {
		Select select = new Select(Driver.findElement(locator));
		select.selectByValue(value);
	}

	public String getAttribute(By locator, String value) {
		String attribute = Driver.findElement(locator).getAttribute(value);
		return attribute;
	}

}
