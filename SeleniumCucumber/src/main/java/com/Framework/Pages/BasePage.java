package com.Framework.Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/* this class will hold the common code for all the pages ie., initElements() , explicitWait methods etc...
 * other pages need to extend from this class to utilize its objects */

public class BasePage {

	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	protected WebDriverWait getWait() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.ignoring(NoSuchElementException.class);
		return wait;
	}
}
