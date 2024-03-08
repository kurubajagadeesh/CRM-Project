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
import com.qa.pageObjects.HomePageObject;
import com.qa.utilitys.TestNGListeners;

 @Listeners(TestNGListeners.class)
public class HomePageTestScript extends BaseClass {

	HomePageObject hob;
	 
	 
	@Test
	public void logodisplayed() throws IOException {
		hob=new HomePageObject(driverFactory);
		 
		            
		System.out.println("script object "+driver);
		Assert.assertTrue(hob.logiIsDisplayed());
		
		 
	}

}
