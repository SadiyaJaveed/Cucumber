package com.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Framework.Services.DriverService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WorkingWithDropdown {

	protected WebDriver driver;
	private DriverService service;

	public WorkingWithDropdown(DriverService service) {
		this.service = service;
		this.driver = service.getDriver();
	}

	@Given("I navigate to {string}")
	public void i_navigate_to(String url) {
		service.getBrowserHelper().navigateTo(url);
	}

	@When("I click on the {string} dropdown and select {string}")
	public void i_click_on_the_dropdown_and_select(String element, String value) {
		service.getDropdownHelper().selectUsingValue(By.id(element), value);
	}

	@Then("I print the values selected")
	public void i_print_the_values_selected() {
		System.out.println(service.getDropdownHelper().getAttribute(By.id("day"), "value"));
		System.out.println(service.getDropdownHelper().getAttribute(By.id("month"), "value"));
		System.out.println(service.getDropdownHelper().getAttribute(By.id("year"), "value"));
	}

}
