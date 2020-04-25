package com.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Framework.Services.DriverService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivenParametersSteps {

	protected WebDriver driver;
	private DriverService service;

	public DataDrivenParametersSteps(DriverService service) {
		this.service = service;
		this.driver = service.getDriver();
	}

	@Given("I have launched the PHP travels website {string}")
	public void i_have_launched_the_PHP_travels_website(String url) {
		service.getBrowserHelper().navigateTo(url);
	}

	@When("I enter the emailAddress as {string}")
	public void i_enter_the_emailAddress_as(String username) {
		service.getTextboxHelper().setText(By.id("inputEmail"), username);
	}

	@When("enter the password as {string}")
	public void enter_the_password_as(String password) {
		service.getTextboxHelper().setText(By.id("inputPassword"), password);
	}

	@When("I click on Login button after entering the details")
	public void i_click_on_Login_button_after_entering_the_details() {
		service.getButtonHelper().performClick(By.id("login"));
	}

	@Then("I capture the screenshot of the page")
	public void i_capture_the_screenshot_of_the_page() {
		int random = (int) (Math.random() * 1000);
		service.getScreenshotHelper().takeScreenshot("target\\Screenshots", "Parameters" + random + ".png");
	}

}
