package com.Framework.Services;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Framework.Drivers.CustomChromeDriver;
import com.Framework.Drivers.CustomFirefoxDriver;
import com.Framework.Helpers.ActionsHelper;
import com.Framework.Helpers.AlertHelper;
import com.Framework.Helpers.BrowserHelper;
import com.Framework.Helpers.ButtonHelper;
import com.Framework.Helpers.DropdownHelper;
import com.Framework.Helpers.FrameHelper;
import com.Framework.Helpers.ScreenshotHelper;
import com.Framework.Helpers.TextBoxHelper;

public class DriverService {

	protected WebDriver driver;
	private CustomChromeDriver customChromeDriver;
	private CustomFirefoxDriver customFirefoxDriver;
	private BrowserHelper browserHelper;
	private TextBoxHelper textboxHelper;
	private ButtonHelper buttonHelper;
	private ActionsHelper actionHelper;
	private DropdownHelper dropdownHelper;
	private AlertHelper alertHelper;
	private ScreenshotHelper screenshotHelper;
	private FrameHelper frameHelper;

	// getter methods to return the instance of individual helper classes
	public WebDriver getDriver() {
		return driver;
	}

	public CustomChromeDriver getChromeDriver() {
		return customChromeDriver;
	}

	public CustomFirefoxDriver getFirefoxDriver() {
		return customFirefoxDriver;
	}

	public BrowserHelper getBrowserHelper() {
		return browserHelper;
	}

	public TextBoxHelper getTextboxHelper() {
		return textboxHelper;
	}

	public ButtonHelper getButtonHelper() {
		return buttonHelper;
	}

	public ActionsHelper getActionHelper() {
		return actionHelper;
	}

	public DropdownHelper getDropdownHelper() {
		return dropdownHelper;
	}

	public AlertHelper getAlertHelper() {
		return alertHelper;
	}

	public FrameHelper getFrameHelper() {
		return frameHelper;
	}

	public ScreenshotHelper getScreenshotHelper() {
		return screenshotHelper;
	}

	// Constructor to call the launchBrowser() method
	public DriverService() {
		launchBrowser();
	}

	// method to launch the browser as well as create the instance of helper classes
	public void launchBrowser() {
		customChromeDriver = new CustomChromeDriver();
		driver = customChromeDriver.getChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		browserHelper = BrowserHelper.getInstance(driver);
		textboxHelper = TextBoxHelper.getInstance(driver);
		buttonHelper = ButtonHelper.getInstance(driver);
		actionHelper = ActionsHelper.getInstance(driver);
		dropdownHelper = DropdownHelper.getInstance(driver);
		alertHelper = AlertHelper.getInstance(driver);
		frameHelper = FrameHelper.getInstance(driver);
		screenshotHelper = ScreenshotHelper.getInstance(driver);
		browserHelper.maximize();
	}

}
