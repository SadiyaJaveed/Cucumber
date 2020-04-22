package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/* create a public WebElement
 * use the @FindBy annotation with the web element
 * Use the PageFactory.initElement() within the constructor to initialize the web element
 * within the constructor because when we create object of this class, the webelements will be initialized */

public class StartPage extends BasePage {

	public StartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "next-button")
	public WebElement StartButton;

	public CountryPage start() {
		StartButton.click();
		return new CountryPage(driver);
	}

}
