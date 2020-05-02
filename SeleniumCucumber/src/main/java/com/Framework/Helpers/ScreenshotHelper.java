package com.Framework.Helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotHelper {

	private static ScreenshotHelper screenshotHelper;
	protected WebDriver Driver;

	private ScreenshotHelper(WebDriver driver) {
		Driver = driver;
	}

	public static ScreenshotHelper getInstance(WebDriver driver) {
		screenshotHelper = new ScreenshotHelper(driver);
		return screenshotHelper;
	}

	public void takeScreenshot(String targetDirectory, String targetFilename) {
		/*
		 * taking screenshots is done using an Interface 
		 * typecast driver instance to the interface and then call the method 
		 * to work with files and directories, we need to use File class
		 */
		File screenshot = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
		/*
		 * then we need to save the file in local system 
		 * If directory is present then saves the screenshot file in specified directory 
		 * If not, then creates new directory, takes screenshot and saves in the created directory 
		 * add try catch block to catch the IOException
		 */
		try {
			FileUtils.copyFile(screenshot, new File(targetDirectory + File.separator + targetFilename));
		} catch (IOException e) {
		}
	}

	// this method is to use in the @After hook for the purpose of attaching screenshot to report
	public byte[] takeScreenshot() {
		byte[] screenshot = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.BYTES);
		return screenshot;
	}
}
