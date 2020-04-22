package learning;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Framework.Drivers.CustomChromeDriver;
import com.Framework.Helpers.ActionsHelper;
import com.Framework.Helpers.AlertHelper;
import com.Framework.Helpers.BrowserHelper;
import com.Framework.Helpers.ButtonHelper;

public class MouseKeyboardActions {

	protected static WebDriver driver;
	private static CustomChromeDriver customChromeDriver;
	private static BrowserHelper browserHelper;
	private static ButtonHelper buttonHelper;
	private static ActionsHelper actionHelper;
	private static AlertHelper alertHelper;

	public static void main(String[] args) throws InterruptedException, IOException {

		customChromeDriver = new CustomChromeDriver();
		driver = customChromeDriver.getChromeDriver();

		browserHelper = BrowserHelper.getInstance(driver);
		browserHelper.navigateTo("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		actionHelper = ActionsHelper.getInstance(driver);
		actionHelper.performDoubleClick(By.id("double-click"));
		alertHelper = AlertHelper.getInstance(driver);
		alertHelper.acceptAlert();

		actionHelper.performRightClick(By.id("double-click"));

		actionHelper.performMouseHover(By.id("sub-menu"));
		// to take screenshot
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("target/Screenshots/firstscreen.png"));

		buttonHelper = ButtonHelper.getInstance(driver);
		buttonHelper.performClick(By.linkText("Google"));

		browserHelper.moveBackward();

		browserHelper.closebrowser();
	}

}
