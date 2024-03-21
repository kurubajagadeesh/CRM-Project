package com.qa.baseClass;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.qa.driverInstance.DriverFactory;
import com.qa.pageObjects.LoginPage;
import com.qa.utilitys.PropertiesLoader;

public class BaseClass {
	protected WebDriver driver;
	protected DriverFactory driverFactory;
	protected Properties prop;
	 
	 // Initialize driverFactory and prop, either through constructor or setters
    public BaseClass() {
        driverFactory = DriverFactory.getInstance();
        prop = PropertiesLoader.getProperties(); // Use PropertiesLoader to load properties
    }
  

	@BeforeSuite
	public void loadConfig() {
		  try {
	            driver = driverFactory.initDriver(prop.getProperty("browser"), prop);
	        } catch (Exception e) {
	            e.printStackTrace(); // Handle the exception according to your requirements
	        }
		   
		     

	}
	@AfterSuite
	public void teardown() {
		  
	}


}
