package com.qa.testScripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.driverInstance.DriverFactory;
import com.qa.pageObjects.HomePageObject;
import com.qa.utilitys.TestNGListeners;

 @Listeners(TestNGListeners.class)
public class HomePageTestScript extends BaseClass {

	HomePageObject hob;
	 
	 
	@Test
	public void logodisplayed() {
		hob=new HomePageObject(driverFactory);
		 
		            
		System.out.println("script object "+driver);
		Assert.assertTrue(hob.logiIsDisplayed());
	}

}
