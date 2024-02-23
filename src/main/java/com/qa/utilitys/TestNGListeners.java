package com.qa.utilitys;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.driverInstance.DriverFactory;



public class TestNGListeners implements ITestListener {
	 private DriverFactory driverFactory;
	 // Constructor to receive DriverFactory instance
	    public TestNGListeners(DriverFactory driverFactory) {
	        this.driverFactory = driverFactory;
	    }

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
            Elementutils.captureScreenshot(driverFactory.getDriver(), result.getMethod().getMethodName());
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
