package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.driverInstance.DriverFactory;

public class HomePageObject {
	@FindBy (xpath="//a[@href='https://classic.freecrm.com/index.html']")
	private WebElement logoElement;
	private WebDriver driver;
	private DriverFactory driverFactory;

	public HomePageObject(DriverFactory driverFactory) {
		this.driver=driverFactory.getDriver();
		PageFactory.initElements(this.driver,this);

	}
	public boolean logiIsDisplayed() {
		System.out.println("homePage"+driver);
		return logoElement.isDisplayed();
	}

}
