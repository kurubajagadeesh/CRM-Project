package com.qa.pageObjects;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.driverInstance.DriverFactory;

public class HomePageObject {
	@FindBy (xpath="//img[@src='https://classic.freecrm.c/img/logo.png']")
	private WebElement logoElement;
	private WebDriver driver;
	private DriverFactory driverFactory;

	public HomePageObject(DriverFactory driverFactory) {
		this.driver=driverFactory.getDriver();
		PageFactory.initElements(this.driver,this);

	}
	public boolean logiIsDisplayed() throws IOException {
		//System.out.println("homePage"+driver);
		//return logoElement.isDisplayed();
		 
		 String logo_link = logoElement.getAttribute("src");
		//System.out.println(logo_link);
		 driver.get(logo_link);
		TakesScreenshot logo= (TakesScreenshot)driver;
		File logo_png = logo.getScreenshotAs(OutputType.FILE);
		File file=new File("./Logo/logo.png");
		FileUtils.copyFile(logo_png, file);
		return logoElement.isDisplayed();
		
	}
	 

}
