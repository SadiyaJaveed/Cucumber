package com.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Framework.Services.DriverService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WorkingWithAlerts {

	protected WebDriver driver;
	private DriverService service;

	public WorkingWithAlerts(DriverService service) {
		this.service = service;
		this.driver = service.getDriver();
	}

	@Given("I have launched the chrome browser and navigate to {string}")
	public void i_have_launched_the_chrome_browser_and_navigate_to(String url) {
		service.getBrowserHelper().navigateTo(url);
	}

	@When("I click on the Alert")
	public void i_click_on_the_Alert() throws InterruptedException {
		service.getButtonHelper().performClick(By.name("alert"));
		Thread.sleep(4000);
	}

	@Then("I switch the control to alert and accept the alert")
	public void i_switch_the_control_to_alert_and_accept_the_alert() {
		service.getAlertHelper().acceptAlert();
	}

	@When("I click on the Confirmation Box")
	public void i_click_on_the_Confirmation_Box() throws InterruptedException {
		service.getButtonHelper().performClick(By.name("confirmation"));
		Thread.sleep(4000);
	}

	@Then("I switch the control to alert and dismiss the alert")
	public void i_switch_the_control_to_alert_and_dismiss_the_alert() {
		service.getAlertHelper().dismissAlert();
	}

	@When("I click on the Prompt")
	public void i_click_on_the_Prompt() throws InterruptedException {
		service.getButtonHelper().performClick(By.name("prompt"));
		Thread.sleep(4000);
	}

	@Then("I switch the control to alert and type in the alert and accept the alert")
	public void i_switch_the_control_to_alert_and_type_in_the_alert_and_accept_the_alert() {
		service.getAlertHelper().setAlertText("Hurray!!!");
	}

}
