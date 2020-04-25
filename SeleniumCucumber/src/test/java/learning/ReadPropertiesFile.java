package learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		String path = "C:\\Users\\sadiy\\git\\Cucumber\\SeleniumCucumber\\src\\test\\resources\\config.properties";
		InputStream stream = new FileInputStream(new File(path));
		prop.load(stream);
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Url"));
	}

}
