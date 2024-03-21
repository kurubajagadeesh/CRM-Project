package com.qa.testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.driverInstance.DriverFactory;
import com.qa.pageObjects.HomePageObject;

public class HomePageTestScript extends BaseClass {
	HomePageObject home_p;
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=DriverFactory.getDriver();
		home_p=new HomePageObject(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void teardown() {
		 try {
	            driver.quit();
	        } catch (Exception e) {
	            e.printStackTrace(); // Handle the exception according to your requirements
	        }
	}
	
	@Test
	public void userNameVerify() {
		 
		String user=home_p.user();
		System.out.println(user);
		  
	}

}
