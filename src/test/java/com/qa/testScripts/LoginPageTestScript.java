package com.qa.testScripts;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.driverInstance.DriverFactory;
import com.qa.pageObjects.LoginPage;
import com.qa.utilitys.PropertiesLoader;
import com.qa.utilitys.TestNGListeners;

 @Listeners(TestNGListeners.class)
public class LoginPageTestScript extends BaseClass {

	LoginPage hob;
	private WebDriver driver;
	 
	
	@BeforeMethod
	public void setup() {
		driver=DriverFactory.getDriver();
		hob=new LoginPage(driver);
		if (driver != null) {
            driver.get(prop.getProperty("url"));
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        }
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	 
	//@Test
	public void logodisplayed() throws IOException {
		 
		            
		System.out.println("script object "+driver);
		Assert.assertTrue(hob.logiIsDisplayed());
	  
	}
	//@Test
	public void logoLocation() {
		 
		hob.logoIsdisplayedAtTopLeftcorner();
	}
	//@Test
	public void logoCaptured() throws IOException {
		 
		hob.logoImageComparision();
	}
	//@Test
	public void navbardimensions() {
		 
		hob.navbar();
	}
	//@Test
	public void navbarmodules() {
		 
		List<String> names=hob.navbaraModules();
		System.out.println(names);
		List<String> expected_names=new ArrayList<String>(List.of("Home", "Sign Up", "Pricing", "Features", "Customers", "Contact"));
		Assert.assertEquals(names, expected_names);
	}
	@Test
	public void login() {
	  
		 
		hob.user_loginPageObject(PropertiesLoader.getProperty("userName"), PropertiesLoader.getProperty("password"));
		String actival_title=driver.getTitle();
		System.out.println(actival_title);
		String excepted_title="CRMPRO";
		Assert.assertEquals(actival_title, excepted_title);
		
	}
}
