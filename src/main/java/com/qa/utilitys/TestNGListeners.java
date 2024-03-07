package com.qa.utilitys;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.driverInstance.DriverFactory;



public class TestNGListeners implements ITestListener {
	 private DriverFactory driverFactory;
	 private WebDriver driver;
//	 public TestNGListeners() {
//		 
//	 }
	 // Constructor to receive DriverFactory instance
//	 public TestNGListeners(DriverFactory driverFactory) {
//	        this.driverFactory =DriverFactory.getInstance();
//	        this.driver = driverFactory.getDriver();
//	        System.out.println("listeners driver "+ driver);
//	    }
	

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 
     System.out.println("statuscode "+result.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			this.driverFactory =DriverFactory.getInstance();
            Elementutils.captureScreenshot(driverFactory.getDriver(), result.getMethod().getMethodName());
			System.out.println("test case failed");
			
        }
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		 	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
