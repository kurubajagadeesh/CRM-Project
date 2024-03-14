package com.qa.pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.driverInstance.DriverFactory;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class LoginPage {
	@FindBy (xpath="//img[@src='https://classic.freecrm.com/img/logo.png']")
	private WebElement logoElement;
	@FindBy (xpath="//div[@id='navbar-collapse']")
	private WebElement navbar;
	
	
	By modules= By.xpath("//ul[@class='nav navbar-nav navbar-right']//li");
	  
	 
	private WebDriver driver;
	private DriverFactory driverFactory;

	public LoginPage(DriverFactory driverFactory) {
		this.driver=driverFactory.getDriver();
		PageFactory.initElements(this.driver,this);

	}
	public boolean logiIsDisplayed() throws IOException {
		System.out.println("homePage"+driver);
		return logoElement.isDisplayed();
		 
//		 String logo_link = logoElement.getAttribute("src");
//		//System.out.println(logo_link);
//		 driver.get(logo_link);
//		TakesScreenshot logo= (TakesScreenshot)driver;
//		File logo_png = logo.getScreenshotAs(OutputType.FILE);
//		File file=new File("./Logo/logo.png");
//		FileUtils.copyFile(logo_png, file);
		//return logoElement.isDisplayed();
		
	}
	public void logoIsdisplayedAtTopLeftcorner() {
//		Point point = logoElement.getLocation();
//		System.out.println(point);
		Rectangle rec = logoElement.getRect();
		 
		System.out.println(rec.getX());
		System.out.println(rec.getY());
		System.out.println(rec.getHeight());
		System.out.println(rec.getWidth());
		 
	}
	 public void logoImageComparision() throws IOException {
		Screenshot logoImageScreenShot = new  AShot().takeScreenshot(driver, logoElement);
		ImageIO.write(logoImageScreenShot.getImage(),"png",new File("./Logo/logoImage.png"));
		
//		File f=new File("./Logo/logoImage.png");
//		if(f.exists()) {
//			System.out.println("image file caputured");
//		}else {
//			System.out.println("image not captured");
//		}
	 }
	 //navbar
	 public void navbar() {
		 
		 navbar.isDisplayed();
		 navbar.click();
		System.out.println( "navbar_x points "+navbar.getRect().getX());
		System.err.println( "navbar_y points "+navbar.getRect().getY());
	 }
	 //navbar modules
	 public List<String> navbaraModules() {
		 List<String> l_elements=new ArrayList<String>();
		 List<WebElement> nav_modules = driver.findElements( modules);
		 for(WebElement feature:nav_modules) {
			  l_elements.add(feature.getText());
		 }
		 return l_elements;
		
	 }

}
