package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Framework.Drivers.CustomChromeDriver;
import com.Framework.Helpers.BrowserHelper;
import com.Framework.Helpers.ButtonHelper;

public class WorkingWithFrames {

	protected static WebDriver driver;
	private static CustomChromeDriver customChromeDriver;
	private static BrowserHelper browserHelper;
	private static ButtonHelper buttonHelper;

	public static void main(String[] args) throws InterruptedException {

		customChromeDriver = new CustomChromeDriver();
		driver = customChromeDriver.getChromeDriver();

		browserHelper = BrowserHelper.getInstance(driver);
		browserHelper.navigateTo("https://www.selenium.dev/selenium/docs/api/java/index.html");
		browserHelper.maximize();
		System.out.println(driver.getTitle());

		driver.switchTo().frame("classFrame");
		System.out.println(driver.getTitle());

		buttonHelper = ButtonHelper.getInstance(driver);
		buttonHelper.performClick(By.xpath("/html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a"));

		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());

		driver.switchTo().frame("packageFrame");
		System.out.println(driver.getTitle());
		buttonHelper.performClick(By.xpath("/html/body/div/ul/li[12]/a"));

		browserHelper.closebrowser();

	}

}
