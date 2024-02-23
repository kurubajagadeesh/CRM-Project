package com.qa.utilitys;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
	 private static final String CONFIG_FILE_PATH = "src/main/resources/data.properties";
	 private static Properties properties;

	 static {
	        properties = loadProperties();
	    }
	 private PropertiesLoader() {
	        // Private constructor to prevent instantiation
	    }
	 private static Properties loadProperties() {
		 Properties prop = new Properties();
	        try (FileInputStream input = new FileInputStream(CONFIG_FILE_PATH)) {
	            prop.load(input);
	        } catch (IOException e) {
	            e.printStackTrace();
	            // Handle the exception or throw it as needed
	        }
	        return prop;
	    }
	 public static String getProperty(String key) {
	        return properties.getProperty(key);
	    }
	 public static Properties getProperties() {
	        return properties;
	    }



}
