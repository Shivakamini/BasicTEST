package com.KeywordDriven;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BrowserLaunch.LaunchBrowser;
import com.ExcelReader.ExcelDataReader;
import com.ExcelReader.KeywordExcelReader;

public class KeywordScript extends LaunchBrowser {

	
	@Test(dataProvider="getTestData")
	public void KeywordDriven(String tcName,String step,String action,String Prroperties,String data)
	{
			
		WebElement element=null;
		
		element=KeywordExcelReader.GetElement(driver, Prroperties);
		KeywordExcelReader.ExecuteAction(driver, action, element, data);
	}
	
	@DataProvider(name="getTestData")
	public Object[][] getTestData()
	{
		Object[][] data=null;
		
		try {
			data=ExcelDataReader.getTestData("F:\\Practice\\Keyword.xlsx", "Sheet1");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return data;
	}
}
