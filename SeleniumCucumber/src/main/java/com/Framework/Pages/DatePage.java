package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DatePage extends BasePage {

	public DatePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "dob-day")
	public WebElement DayTextbox;
	@FindBy(how = How.ID, using = "dob-month")
	public WebElement MonthTextbox;
	@FindBy(how = How.ID, using = "dob-year")
	public WebElement YearTextbox;
	@FindBy(how = How.ID, using = "next-button")
	public WebElement NextButton;
	@FindBy(how = How.ID, using = "back-button")
	public WebElement BackButton;
	@FindBy(how = How.ID, using = "error-summary-heading")
	public WebElement ErrorHeading;

	public void selectDOB(String date, String month, String year) {
		DayTextbox.sendKeys(date);
		MonthTextbox.sendKeys(month);
		YearTextbox.sendKeys(year);
	}

	public PartnerPage validDOBSelected() {
		NextButton.click();
		return new PartnerPage(driver);
	}

	public TeenagerResultPage teenagerDOBSelected() {
		NextButton.click();
		return new TeenagerResultPage(driver);
	}

	public void invalidDOBSelected() {
		NextButton.click();
	}

	public CountryPage returnBack() {
		BackButton.click();
		return new CountryPage(driver);
	}

	public String getError() {
		return ErrorHeading.getText();
	}
}
