package com.qa.baseClass;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.driverInstance.DriverFactory;
import com.qa.utilitys.PropertiesLoader;

public class BaseClass {
	protected WebDriver driver;
	protected DriverFactory driverFactory;
	private Properties prop;
	 // Initialize driverFactory and prop, either through constructor or setters
    public BaseClass() {
        driverFactory = DriverFactory.getInstance();
        prop = PropertiesLoader.getProperties(); // Use PropertiesLoader to load properties
    }
  

	@BeforeMethod
	public void setup() {
		  try {
	            driver = driverFactory.initDriver(prop.getProperty("browser"), prop);
	        } catch (Exception e) {
	            e.printStackTrace(); // Handle the exception according to your requirements
	        }

	}
	@AfterMethod
	public void teardown() {
		 try {
	            driverFactory.quitDriver();
	        } catch (Exception e) {
	            e.printStackTrace(); // Handle the exception according to your requirements
	        }
	}


}
