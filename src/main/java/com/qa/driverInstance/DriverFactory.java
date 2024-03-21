package com.qa.driverInstance;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	private static DriverFactory instance;
    private static  WebDriver driver;

    private DriverFactory() {
        // Private constructor to prevent instantiation outside of the class
    }
    public static DriverFactory getInstance() {
        if (instance == null) {
            instance = new DriverFactory();
        }
        return instance;
    }
    public static WebDriver getDriver() {
        return driver;
    }


    public WebDriver initDriver(String browserName, Properties prop) {
        if (driver == null) {
            System.out.println("BrowserName is " + browserName);
            switch (browserName.toLowerCase()) {
                case "chrome":

                    driver = new ChromeDriver();
                    break;
                case "firefox":

                    driver = new FirefoxDriver();
                    break;
                case "edge":

                    driver = new EdgeDriver();
                    break;
                default:
                    System.out.println("Please pass the right browser: " + browserName);
                    break;
            }

             
        }

        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
