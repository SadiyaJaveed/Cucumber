package com.Framework.Utilities;

public interface IReader {
	
	/* Reasons for adding the interface:
	 * 1. Our test requires some basic configurations that can be enforced using the Interface
	 * 2. We will define some methods in the interface that are must needed for the configuration
	 * 3. This interface will be implemented by a class that will read data from properties file
	 * 4. That class will provide the implementation for the must have methods
	 */
	
	public String getUrl();
	public String getUsername();
	public String getPassword();
	public int getExplicitWait();
	public String getBrowserType();

}
