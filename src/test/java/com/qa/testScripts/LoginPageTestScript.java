package com.qa.testScripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.pageObjects.LoginPage;
import com.qa.utilitys.TestNGListeners;

 @Listeners(TestNGListeners.class)
public class LoginPageTestScript extends BaseClass {

	LoginPage hob;
	
	 
	 
	//@Test
	public void logodisplayed() throws IOException {
		hob=new LoginPage(driverFactory);
		            
		System.out.println("script object "+driver);
		Assert.assertTrue(hob.logiIsDisplayed());
	  
	}
	//@Test
	public void logoLocation() {
		hob=new LoginPage(driverFactory);
		hob.logoIsdisplayedAtTopLeftcorner();
	}
	//@Test
	public void logoCaptured() throws IOException {
		hob=new LoginPage(driverFactory);
		hob.logoImageComparision();
	}
	//@Test
	public void navbardimensions() {
		hob=new LoginPage(driverFactory);
		hob.navbar();
	}
	@Test
	public void navbarmodules() {
		hob=new LoginPage(driverFactory);
		List<String> names=hob.navbaraModules();
		System.out.println(names);
		List<String> expected_names=new ArrayList<String>(List.of("Home", "Sign Up", "Pricing", "Features", "Customers", "Contact"));
		Assert.assertEquals(names, expected_names);
	}

}
