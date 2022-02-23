package com.Hybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BrowserLaunch.LaunchBrowser;
import com.ExcelReader.ExcelDataReader;

import com.PageFactoryHybridpages.LoginPage;
import com.PageFactoryHybridpages.Logout;
import com.PageFactoryHybridpages.SearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HybridScript extends LaunchBrowser {

	@Test(dataProvider="getTestData")
	public void CHYDtoChn(String name,String pwd,String stplace,String reachPlace,String stdate,String reachDate) throws InterruptedException
	{
	   
	driver.get("https://www.apsrtconline.in/oprs-web/");
	driver.manage().window().maximize();
	
	LoginPage login=new LoginPage(driver);
	login.loginPage(name, pwd);
	
	SearchPage searchaction=new SearchPage(driver);
	searchaction.searchBus(stplace,reachPlace,stdate,reachDate);
	
	Logout logoutpage=new Logout(driver);
	logoutpage.logout();
	  
	}
	
	@DataProvider(name="getTestData")
	public Object[][] getTestData()
	{
		Object[][] data=null;
		try
		{
			data=ExcelDataReader.getTestData("F:\\Practice\\TestData.xlsx", "Sheet1");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	   return data;	 
}
}


