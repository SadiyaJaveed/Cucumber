package com.Framework.Helpers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHelper {

	private static AlertHelper alertHelper;
	protected WebDriver Driver;

	private AlertHelper(WebDriver driver) {
		Driver = driver;
	}

	public static AlertHelper getInstance(WebDriver driver) {
		alertHelper = new AlertHelper(driver);
		return alertHelper;
	}

	private WebDriverWait getWait() {
		WebDriverWait wait = new WebDriverWait(Driver, 60);
		wait.ignoring(NoAlertPresentException.class);
		return wait;
	}

	public void acceptAlert() {
		WebDriverWait wait = getWait();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent()); // this will wait until alert is present and switch the control to alert
		alert.accept();
	}

	public void dismissAlert() {
		WebDriverWait wait = getWait();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.dismiss();
	}

	public void setAlertText(String text) {
		WebDriverWait wait = getWait();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.sendKeys(text);
		alert.accept();
	}

}
