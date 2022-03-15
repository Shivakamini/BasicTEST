package com.TestNGSampleScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {
	
	ExtentReports reports;
	
	@BeforeTest
	public void reportsDemo()
	{
		String path=System.getProperty("user.dir")+"\\ExtentReports\\ExtentReportsLogs\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("TestNG Results");
		reporter.config().setDocumentTitle("Extent Reports");
		

        reports=new ExtentReports();
        reports.attachReporter(reporter);	
        
	}
	
	@Test
	public void InitialDemo()
	{
		ExtentTest test=reports.createTest("InitialDemo");
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        test.fail("Iam failed");
        reports.flush();
		
	}

}
