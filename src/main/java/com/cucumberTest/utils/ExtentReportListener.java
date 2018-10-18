package com.cucumberTest.utils;


//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportListener implements ITestListener {

    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest logger;

    public void onTestStart(ITestResult result) {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
        extent = new ExtentReports ();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
        extent.setSystemInfo("Environment", "Automation Testing");
        extent.setSystemInfo("User Name", "Rajkumar SM");

        htmlReporter.config().setDocumentTitle("Title of the Report Comes here");
        htmlReporter.config().setReportName("Name of the Report Comes here");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
    }
    public void onTestSuccess(ITestResult result) {
        logger = extent.createTest("passTest");
        Assert.assertTrue(true);
        logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is passTest", ExtentColor.GREEN));

    }
    public void onTestFailure(ITestResult result) {
        logger = extent.createTest("failTest");
        Assert.assertTrue(false);
        logger.log(Status.PASS, "Test Case (failTest) Status is passed");
        logger.log(Status.PASS, MarkupHelper.createLabel("Test Case (failTest) Status is passed", ExtentColor.GREEN));
    }
    public void onTestSkipped(ITestResult result) {
        logger = extent.createTest("skipTest");
        throw new SkipException("Skipping - This is not ready for testing ");

    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("on test success within percentage");
    }
//    public void onStart(ITestContext context) {
//        System.out.println("on start");
////        driver = new ChromeDriver(); // Set the drivers path in environment variables to avoid code(System.setProperty())
//        reports = new ExtentReports("extent_report/" + new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()) + "reports.html");
//    }
    public void onFinish(ITestContext context) {
        System.out.println("on finish");
//        driver.close();
//        reports.endTest(test);
//        reports.flush();
    }

}
