package com.Steps;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Framework.Services.DriverService;
import com.Framework.Utilities.IReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WorkingWithWaits {

	protected WebDriver driver;
	private DriverService service;
	private IReader readconfig;

	public WorkingWithWaits(DriverService service) {
		this.service = service;
		this.driver = service.getDriver();
		this.readconfig = service.getReader();
		}

	@Given("I navigate to the website {string}")
	public void i_navigate_to_the_website(String url) {
		service.getBrowserHelper().navigateTo(readconfig.getUrl());
	}

	@When("I provide the username as {string} and click Next button")
	public void i_provide_the_username_as_and_click_Next_button(String username) {
		service.getTextboxHelper().setText(By.id("login-username"), readconfig.getUsername());
		service.getButtonHelper().performClick(By.id("login-signin"));
	}

	@And("I capture the screenshot")
	public void i_capture_the_screenshot() {
		int random = (int) (Math.random() * 1000);
		service.getScreenshotHelper().takeScreenshot("target\\Screenshots", "Yahoo" + random + ".png");
	}

	@When("I wait for {int} milliseconds")
	public void i_wait_for_milliseconds(Integer delay) throws InterruptedException {
		Thread.sleep(delay);
	}

	@When("I set the implicit wait to {int} seconds")
	public void i_set_the_implicit_wait_to_seconds(Integer timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	@When("I set the explicit wait to {int} seconds")
	public void i_set_the_explicit_wait_to_seconds(Integer timeout) {
		/*
		 * Create the instance of WebDriverWait class by passing driver and maxduration
		 * Provide the exception that we want to ignore Call the until() method with
		 * wait logic
		 * 
		 * Can use already present wait logic by using ExpectedConditions Can create
		 * custom wait logic and call the method
		 */
		WebDriverWait wait = new WebDriverWait(driver, readconfig.getExplicitWait());
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-passwd")));
	}

	@When("provide the password as {string} and click SignIn button")
	public void provide_the_password_as_and_click_SignIn_button(String password) {
		service.getTextboxHelper().setText(By.id("login-passwd"), readconfig.getPassword());
		service.getButtonHelper().performClick(By.id("login-signin"));
	}

	@Then("I land in the homepage of {string}")
	public void i_land_in_the_homepage_of(String myIDname) {
		Assert.assertTrue(service.getBrowserHelper().fetchTitle().contains(myIDname));

		service.getButtonHelper().performClick(By.cssSelector("button[title='Tickbox, not ticked']"));

		service.getButtonHelper().performClick(By.cssSelector("button[title='Select messages']"));
		service.getButtonHelper().performClick(By.linkText("Starred"));

		service.getButtonHelper().performClick(By.cssSelector("button[data-test-id = 'toolbar-sort-menu-button']"));
		service.getButtonHelper().performClick(By.cssSelector("button[data-test-id = 'sort-by-date_asc']"));

		service.getActionHelper().performKeyboardAction(By.cssSelector("input[role = 'combobox']"), "Sadiya");

		service.getButtonHelper().performClick(By.cssSelector("button[data-test-id = 'search-basic-btn']"));
	}

}
