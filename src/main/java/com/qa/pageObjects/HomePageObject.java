package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.driverInstance.DriverFactory;

public class HomePageObject {
	@FindBy (xpath="(//td[@class='headertext'])[1]")
	private WebElement userName;
	
	private WebDriver driver;
	 
	public HomePageObject(WebDriver driver){
		this.driver=DriverFactory.getDriver();
		PageFactory.initElements(this.driver,this);
		
	}
	
	public String user() {
		
		return userName.getText();
	}

}
