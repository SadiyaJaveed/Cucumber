package com.Steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Framework.Pages.CountryPage;
import com.Framework.Pages.DatePage;
import com.Framework.Pages.NoServicePage;
import com.Framework.Pages.PartnerPage;
import com.Framework.Pages.StartPage;
import com.Framework.Pages.TeenagerResultPage;
import com.Framework.Services.DriverService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckerToolSteps {

	protected WebDriver driver;
	private DriverService service;
	StartPage startPage;
	CountryPage countryPage;
	DatePage datePage;
	PartnerPage partnerPage;
	TeenagerResultPage teenagerResultPage;
	NoServicePage noServicePage;

	public CheckerToolSteps(DriverService service) {
		this.service = service;
		this.driver = service.getDriver();
	}

	@Given("I have opened the NHS Cost Checker Tool")
	public void i_have_opened_the_NHS_Cost_Checker_Tool() {
		service.getBrowserHelper().navigateTo("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
	}

	@Given("click the Start button")
	public void click_the_Start_button() {
		startPage = new StartPage(driver);
		countryPage = startPage.start();
	}

	@Then("I successfully land in the Country page")
	public void i_successfully_land_in_the_Country_page() {
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Which country do you live in?"));
		service.getScreenshotHelper().takeScreenshot("target\\CheckerScreens", "LandedCountry.png");
	}

	@When("I select the Country as Wales and click Next button")
	public void i_select_the_Country_as_Wales_and_click_Next_button() {
		datePage = countryPage.selectWales();
	}

	@When("I provide the date as {string} month as {string} and year as {string}")
	public void i_provide_the_date_as_month_as_and_year_as(String date, String month, String year) {
		datePage.selectDOB(date, month, year);
		service.getScreenshotHelper().takeScreenshot("target\\CheckerScreens", "Date2018.png");
	}

	@When("click Next button")
	public void click_Next_button() {
		teenagerResultPage = datePage.teenagerDOBSelected();
	}

	@Then("I receive information regarding the help I would get with the NHS costs")
	public void i_receive_information_regarding_the_help_I_would_get_with_the_NHS_costs() {
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Because you're under 16 you get help paying NHS costs"));
		service.getScreenshotHelper().takeScreenshot("target\\CheckerScreens", "TeenagerResult.png");
	}

	@When("I select Country as Northern Ireland and click Next button")
	public void i_select_Country_as_Northern_Ireland_and_click_Next_button() {
		noServicePage = countryPage.selectIreland();
	}

	@Then("I receive a message that I cannot use the service")
	public void i_receive_a_message_that_I_cannot_use_the_service() {
		Assert.assertTrue(
				driver.getTitle().equalsIgnoreCase("You cannot use this service because you live in Northern Ireland"));
		service.getScreenshotHelper().takeScreenshot("target\\CheckerScreens", "CannotUse.png");
	}

	@When("I click on Next button without selecting the country")
	public void i_click_on_Next_button_without_selecting_the_country() {
		countryPage.countryNotSelected();
	}

	@Then("I receive an error")
	public void i_receive_an_error() {
		Assert.assertTrue(countryPage.getError().equalsIgnoreCase("There is a problem"));
		service.getScreenshotHelper().takeScreenshot("target\\CheckerScreens", "NotSelected.png");
	}

	@When("click on Next button")
	public void click_on_Next_button() {
		datePage.invalidDOBSelected();
	}

	@Then("I receive an error message")
	public void i_receive_an_error_message() {
		Assert.assertTrue(datePage.getError().equalsIgnoreCase("There is a problem"));
		service.getScreenshotHelper().takeScreenshot("target\\CheckerScreens", "InvalidDOB.png");
	}

	@When("I click on Back button")
	public void i_click_on_Back_button() {
		countryPage = datePage.returnBack();
	}

}
