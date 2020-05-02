package com.Framework.Helpers;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class WindowHelper {

	private static WindowHelper windowHelper;
	protected WebDriver Driver;

	private WindowHelper(WebDriver driver) {
		Driver = driver;
	}

	public static WindowHelper getInstance(WebDriver driver) {
		windowHelper = new WindowHelper(driver);
		return windowHelper;
	}

	private ArrayList<String> getWindowIds() {
		ArrayList<String> windowIds = new ArrayList<String> (Driver.getWindowHandles());
		return windowIds;
	}
	
	public void switchToWindow(int index) {
		ArrayList<String> windowIds = getWindowIds();
		
		if(index < 0 || index > windowIds.size())    //not mandatory, just a check
			throw new IllegalArgumentException("index is not valid " +index);
			
		Driver.switchTo().window(windowIds.get(index));
	}
	
	public void switchToParent(int index) {
		ArrayList<String> windowIds = getWindowIds();
		Driver.switchTo().window(windowIds.get(0));   //because parent window is always index 0
	}

}
