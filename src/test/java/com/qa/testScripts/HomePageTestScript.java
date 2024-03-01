package com.qa.testScripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.pageObjects.HomePageObject;
import com.qa.utilitys.TestNGListeners;

@Listeners(TestNGListeners.class)
public class HomePageTestScript extends BaseClass {

	HomePageObject hob;
	TestNGListeners listeners;
	@Test
	public void logodisplayed() {
		hob=new HomePageObject(driverFactory);
		listeners=new TestNGListeners(driverFactory);
		            
		System.out.println(driver);
		Assert.assertTrue(hob.logiIsDisplayed());
	}

}
