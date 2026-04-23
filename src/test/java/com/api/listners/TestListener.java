package com.api.listners;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {


    private static final Logger logger = LogManager.getLogger(TestListener.class);

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test Passed: {} - {}",
                result.getMethod().getMethodName(),
                result.getMethod().getDescription());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("Test Got Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.fatal("Test Got Skipped");
    }

    @Override
    public void onStart(ITestContext context) {
        logger.info("Test started successfully");
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("Test Has Been Completed successfully");
    }
}
