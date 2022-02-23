package com.POMwithoutFactory;

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
import com.ByPOMAPSRTCPages.ActionPage;
import com.ByPOMAPSRTCPages.LoginAPSRTC;
import com.ByPOMAPSRTCPages.Logout;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POMScript extends LaunchBrowser {
	
	@Test(dataProvider="getTestData")
	public void apsrtc(String uname,String upwd,String onplace,String toplace,String ondate,String todate) throws InterruptedException
	{
         LoginAPSRTC loginsite=new LoginAPSRTC(driver);
         loginsite.login(uname,upwd);
         
		 ActionPage actionpage=new ActionPage(driver);
		 actionpage.actiontask(onplace,toplace,toplace,todate);
		   
		 Logout logoutsite=new Logout(driver);
		 logoutsite.logout();	 
	   }
	
	@DataProvider(name="getTestData")
	public Object[][] getTestData()
	{
		Object[][] data=null;
		try {
			data=ExcelDataReader.getTestData("F:\\Practice\\TestData.xlsx", "Sheet1");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return data;
	}
	}


