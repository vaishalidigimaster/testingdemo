package com.sb.baseclass;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class extentreports extends Baseclass{

 public ExtentReports extent;
 public ExtentHtmlReporter htmlReporter;
 public ExtentTest test;
 
 @BeforeTest
 public void setextent() {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/myReport.html");
        htmlReporter.config().setDocumentTitle("Automation Testing");
        htmlReporter.config().setReportName("Test for Registration of Seller Module");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Projectname", "Seller module of singlebag");
        extent.setSystemInfo("OS", "Windows10");
        extent.setSystemInfo("Browser", "chrome");
    }
 
 
 @AfterTest
 public void end_report() {
	 extent.flush();
 }
 @AfterMethod
 public void reportwithclose(ITestResult result) {
 	if (result.getStatus()==ITestResult.FAILURE) {
         test.log(Status.FAIL, "Test Case Failed: " + result.getName());
         test.log(Status.FAIL, "Failure Details: " + result.getThrowable());
     } else if (result.getStatus() == ITestResult.SKIP) {
         test.log(Status.SKIP, "Test Case Skipped: " + result.getName());
     } else {
     	test.log(Status.PASS, "Test Case Passed: " + result.getName());
     }
 	 teardown();
 }
}
