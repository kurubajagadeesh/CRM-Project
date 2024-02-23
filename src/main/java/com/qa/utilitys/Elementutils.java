package com.qa.utilitys;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.driverInstance.DriverFactory;

public class Elementutils {
	private DriverFactory driverFactory;
	  public Elementutils(DriverFactory driverFactory) {
	        this.driverFactory = driverFactory;
	    }
	  // Method to find a web element by a given selector
	    public WebElement getElement(String selectorType, String selectorValue) {
	        By by = getBy(selectorType, selectorValue);
	        return driverFactory.getDriver().findElement(by);
	    }
	 // Method to find a web elements by a given selector
	    public WebElement getElements(String selectorType, String selectorValue) {
	        By by = getBy(selectorType, selectorValue);
	        return driverFactory.getDriver().findElement(by);
	    }

	    public WebElement getElement(By locator) {
	    	return driverFactory.getDriver().findElement(locator);
	    }
	    // Private method to convert selectorType and selectorValue into a By object
	    private By getBy(String selectorType, String selectorValue) {
	        switch (selectorType.toLowerCase()) {
	            case "id":
	                return By.id(selectorValue);
	            case "name":
	                return By.name(selectorValue);
	            case "xpath":
	                return By.xpath(selectorValue);
	            // Add more cases for other selector types as needed
	            default:
	                throw new IllegalArgumentException("Unsupported selector type: " + selectorType);
	        }
	    }
	    public static void captureScreenshot(WebDriver driver, String testName) {
	        try {
	            if (driver instanceof TakesScreenshot) {
	                TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
	                File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);

	                String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	                String screenshotName = testName + "_" + timestamp + ".png";

	                Path destinationPath = Path.of("screenshots", screenshotName);
	                Files.copy(screenshotFile.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);

	                System.out.println("Screenshot captured: " + destinationPath.toAbsolutePath());
	                // Log the screenshot file path for reference in test reports
	            } else {
	                System.out.println("Screenshot not supported by this WebDriver");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	            // Log or handle the exception as needed
	        }
	}
}


