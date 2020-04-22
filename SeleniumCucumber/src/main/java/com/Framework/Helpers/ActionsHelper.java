package com.Framework.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {

	private static ActionsHelper actionshelper;
	protected WebDriver Driver;

	private ActionsHelper(WebDriver driver) {
		Driver = driver;
	}

	public static ActionsHelper getInstance(WebDriver driver) {
		actionshelper = new ActionsHelper(driver);
		return actionshelper;
	}

	public void performMouseHover(By locator) {
		Actions action = new Actions(Driver);
		action.moveToElement(Driver.findElement(locator)).build().perform();
	}

	public void performDoubleClick(By locator) {
		Actions action = new Actions(Driver);
		action.doubleClick(Driver.findElement(locator)).build().perform();
	}

	public void performRightClick(By locator) {
		Actions action = new Actions(Driver);
		action.contextClick(Driver.findElement(locator)).build().perform();
	}

	public void performKeyboardAction(By locator, String value) {
		Actions action = new Actions(Driver);
		action.keyDown(Driver.findElement(locator), Keys.LEFT_SHIFT).sendKeys(value).keyUp(Keys.LEFT_SHIFT).build()
				.perform();
	}

}
