package com.qa.testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		hob.navbaraModules();
	}

}
