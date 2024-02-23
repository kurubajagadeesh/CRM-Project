package com.qa.testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.pageObjects.HomePageObject;

public class HomePageTestScript extends BaseClass {

	HomePageObject hob=new HomePageObject(driverFactory);
	@Test
	public void logodisplayed() {
		System.out.println(driver);
		Assert.assertTrue(hob.logiIsDisplayed());
	}

}
