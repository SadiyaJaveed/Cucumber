package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CountryPage extends BasePage {

	public CountryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "label-england")
	public WebElement EnglandCheckbox;
	@FindBy(how = How.ID, using = "label-wales")
	public WebElement WalesCheckbox;
	@FindBy(how = How.ID, using = "label-scotland")
	public WebElement ScotlandCheckbox;
	@FindBy(how = How.ID, using = "label-nire")
	public WebElement IrelandCheckbox;
	@FindBy(how = How.ID, using = "next-button")
	public WebElement NextButton;
	@FindBy(how = How.ID, using = "error-summary-heading")
	public WebElement ErrorHeading;

	public DatePage selectWales() {
		WalesCheckbox.click();
		NextButton.click();
		return new DatePage(driver);
	}

	public NoServicePage selectIreland() {
		IrelandCheckbox.click();
		NextButton.click();
		return new NoServicePage(driver);
	}

	public void countryNotSelected() {
		NextButton.click();
	}

	public String getError() {
		return ErrorHeading.getText();
	}
}
