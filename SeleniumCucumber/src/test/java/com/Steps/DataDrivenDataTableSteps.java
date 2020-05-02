package com.Steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Framework.Services.DriverService;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class DataDrivenDataTableSteps {
	
	protected WebDriver driver;
	private DriverService service;

	public DataDrivenDataTableSteps(DriverService service) {
		this.service = service;
		this.driver = service.getDriver();
	}
	
	@When("enter the following details in the register page")
	public void enter_the_following_details_in_the_register_page(DataTable table) {
		/*
		 * DataTable to List Data Structure:
		 * Cucumber converts the table into a list of lists by treating each row as a list of the column values. 
		 * We use the asLists method — supplying a String.class argument — to convert the DataTable argument to a List<List<String>>
		 * This Class argument informs the asLists method what data type we expect each element to be.
		 * In our case, we want the user details to be String values. Thus, we supply String.class 
		 */
		
		/*List<List<String>> row = table.asLists(String.class);

	    for (List<String> column : row) {
	    	service.getTextboxHelper().setText(By.name("firstname"), column.get(0));
	    	service.getTextboxHelper().setText(By.name("lastname"), column.get(1));
	    }*/
	    
	    /*
	     * DataTable to Map Data Structure:
	     * Similar to the above, Cucumber creates a list containing each row but instead maps the column heading to each column value. 
	     * Cucumber repeats this process for each subsequent row
	     * We use the asMaps method — supplying two String.class arguments — to convert the DataTable argument to a List<Map<String, String>> 
	     * The first argument denotes the data type of the key (header) and second indicates the data type of each column value. 
	     * Thus, we supply two String.class arguments because our headers (key) and user details (values) are all Strings.
	     */
		
	    List<Map<String, String>> rows = table.asMaps(String.class, String.class);
	     
	    for (Map<String, String> columns : rows) {
	    	service.getTextboxHelper().setText(By.name("firstname"), columns.get("FirstName"));
	    	service.getTextboxHelper().setText(By.name("lastname"), columns.get("LastName"));
	    }
	    
	}


}
