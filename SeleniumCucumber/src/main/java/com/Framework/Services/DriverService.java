package com.Framework.Services;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

import com.Framework.Drivers.CustomChromeDriver;
import com.Framework.Drivers.CustomEdgeDriver;
import com.Framework.Drivers.CustomFirefoxDriver;
import com.Framework.Drivers.CustomIEDriver;
import com.Framework.Helpers.ActionsHelper;
import com.Framework.Helpers.AlertHelper;
import com.Framework.Helpers.BrowserHelper;
import com.Framework.Helpers.ButtonHelper;
import com.Framework.Helpers.DropdownHelper;
import com.Framework.Helpers.WindowHelper;
import com.Framework.Helpers.ScreenshotHelper;
import com.Framework.Helpers.TextBoxHelper;
import com.Framework.Utilities.IReader;
import com.Framework.Utilities.ReadConfigProperties;

public class DriverService {

	protected WebDriver driver;
	private IReader reader;
	private CustomChromeDriver customChromeDriver;
	private CustomFirefoxDriver customFirefoxDriver;
	private CustomIEDriver customIEDriver;
	private CustomEdgeDriver customEdgeDriver;
	private BrowserHelper browserHelper;
	private TextBoxHelper textboxHelper;
	private ButtonHelper buttonHelper;
	private ActionsHelper actionHelper;
	private DropdownHelper dropdownHelper;
	private AlertHelper alertHelper;
	private ScreenshotHelper screenshotHelper;
	private WindowHelper frameHelper;

	// getter methods to return the instance of individual helper classes
	public WebDriver getDriver() {
		return driver;
	}
	
	public IReader getReader() {
		return reader;
	}

	public CustomChromeDriver getChromeDriver() {
		return customChromeDriver;
	}

	public CustomFirefoxDriver getFirefoxDriver() {
		return customFirefoxDriver;
	}
	
	public CustomIEDriver getCustomIEDriver() {
		return customIEDriver;
	}

	public CustomEdgeDriver getCustomEdgeDriver() {
		return customEdgeDriver;
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

	public WindowHelper getFrameHelper() {
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
		reader = new ReadConfigProperties();
		//reader = new ReadConfigProperties("abc.properties");
		
		driver = getBrowserDriver();
		driver.manage().timeouts().pageLoadTimeout(reader.getExplicitWait(), TimeUnit.SECONDS);
		
		browserHelper = BrowserHelper.getInstance(driver);
		textboxHelper = TextBoxHelper.getInstance(driver);
		buttonHelper = ButtonHelper.getInstance(driver);
		actionHelper = ActionsHelper.getInstance(driver);
		dropdownHelper = DropdownHelper.getInstance(driver);
		alertHelper = AlertHelper.getInstance(driver);
		frameHelper = WindowHelper.getInstance(driver);
		screenshotHelper = ScreenshotHelper.getInstance(driver);
		browserHelper.maximize();
	}

	//based on the browsertype specified in config.properties, launch the corresponding browser
	private WebDriver getBrowserDriver() {
		switch (reader.getBrowserType()) {
		case BrowserType.CHROME:
			customChromeDriver = new CustomChromeDriver();
			return customChromeDriver.getChromeDriver();
		case BrowserType.FIREFOX:
			customFirefoxDriver = new CustomFirefoxDriver();
			return customFirefoxDriver.getFirefoxDriver();
		case BrowserType.IE:
			customIEDriver = new CustomIEDriver();
			return customIEDriver.getIEDriver();
		case BrowserType.EDGE:
			customEdgeDriver = new CustomEdgeDriver();
			return customEdgeDriver.getEdgeDriver();
		default:
			throw new RuntimeException("Invalid browser type: " +reader.getBrowserType());
		}
	}

}
