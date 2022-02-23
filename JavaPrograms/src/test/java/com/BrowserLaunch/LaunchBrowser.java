package com.BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	protected WebDriver driver;
	
	@Parameters({"Browser"})
	@BeforeTest
	public void openBrowser(@Optional("chrome") String browserName)
	{
		switch(browserName.toUpperCase())
		{
		case "CHROME":
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    break;
		case "EDGE":
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
		    break;
		case "FF":
			WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
		    break;
	}
		
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.close();
	}

}
