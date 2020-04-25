package com.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Framework.Services.DriverService;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivenExampleTableSteps {

	protected WebDriver driver;
	private DriverService service;

	public DataDrivenExampleTableSteps(DriverService service) {
		this.service = service;
		this.driver = service.getDriver();
	}

	@When("I click on Register button in login page")
	public void i_click_on_Register_button_in_login_page() {
		service.getButtonHelper().performClick(By.xpath("//*[@id=\"header\"]/div/ul/li[3]/a"));
	}

	@When("enter the {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} in the register page")
	public void enter_the_in_the_register_page(String FirstName, String LastName, String EmailAddress,
			String PhoneNumber, String HouseNumber, String StreetAddress, String City, String State, String Postcode,
			String Country, String FindUs, String Mobile, String Password, String ConfirmPassword) {
		service.getTextboxHelper().setText(By.name("firstname"), FirstName);
		service.getTextboxHelper().setText(By.name("lastname"), LastName);
		service.getTextboxHelper().setText(By.name("email"), EmailAddress);
		service.getTextboxHelper().setText(By.id("inputPhone"), PhoneNumber);
		service.getTextboxHelper().setText(By.name("address1"), HouseNumber);
		service.getTextboxHelper().setText(By.name("address2"), StreetAddress);
		service.getTextboxHelper().setText(By.name("city"), City);
		service.getTextboxHelper().setText(By.name("state"), State);
		service.getTextboxHelper().setText(By.name("postcode"), Postcode);
		service.getDropdownHelper().selectUsingVisibletext(By.id("inputCountry"), Country);
		service.getDropdownHelper().selectUsingValue(By.id("customfield1"), FindUs);
		service.getTextboxHelper().setText(By.id("customfield2"), Mobile);
		service.getTextboxHelper().setText(By.id("inputNewPassword1"), Password);
		service.getTextboxHelper().setText(By.id("inputNewPassword2"), ConfirmPassword);
	}

	@When("click on im not a robot")
	public void click_on_im_not_a_robot() {
		service.getFrameHelper().switchToFrame(By.xpath("//*[@id=\"divDynamicRecaptcha\"]/div/div/iframe"));
		service.getButtonHelper().performClick(By.xpath("//*[@id=\"recaptcha-anchor\"]"));
	}

	@When("I click on Register button after entering the details")
	public void i_click_on_Register_button_after_entering_the_details() {
		service.getFrameHelper().switchToDefault();
		service.getButtonHelper().performClick(By.xpath("//*[@id=\"frmCheckout\"]/p/input"));
	}

	@Then("I successfully land in the dashboard page")
	public void i_successfully_land_in_the_dashboard_page() {
		System.out.println(service.getBrowserHelper().fetchTitle());
	}

}
