package com.Framework.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ReadConfigProperties implements IReader {
	
	private Properties properties;
	
	//constructor to read the default property file
	public ReadConfigProperties() {
		readPropertiesFile("");
	}
	
	//constructor to read the users own property file
	public ReadConfigProperties(String filename) {
		readPropertiesFile(filename);
	}
	
	//this will read the data from properties file
	private void readPropertiesFile(String filename) {
		if(isDefaultPropertiesFile(filename)) {
			properties = getDataFromPropertiesFile("config.properties");
		} else {
			properties = getDataFromPropertiesFile(filename);
		}
	}
	
	//check if user has provided his own property file, or else read from the default config.property file
	private boolean isDefaultPropertiesFile(String filename) {
		if("".equals(filename))
			return true;  // read from default
		return false;  //read from the specified file
	}
	
	//this will fetch the data from properties file
	private Properties getDataFromPropertiesFile(String filename) {
		String path = ResourceUtils.getResourcePath(filename);   //this will get the absolute path of the file
		Properties prop = new Properties();
		try {
			InputStream stream = new FileInputStream(new File(path));
			prop.load(stream);
		} catch (IOException e) {
		}
		return prop;
	}

	@Override
	public String getUrl() {
		return properties.getProperty("Url");
	}

	@Override
	public String getUsername() {
		return properties.getProperty("Username");
	}

	@Override
	public String getPassword() {
		return properties.getProperty("Password");
	}

	@Override
	public int getExplicitWait() {
		return Integer.parseInt(properties.getProperty("Explicitwait"));
	}

	@Override
	public String getBrowserType() {
		return properties.getProperty("BrowserType");
	}

}
