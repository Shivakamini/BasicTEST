package com.DataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.BrowserLaunch.LaunchBrowser;
import com.ExcelReader.ExcelDataReader;

public class ExcelDataDriven extends LaunchBrowser {
	
	@Test(dataProvider="getTestData")
	public void dataDriven(String username,String password,String startplace,String endplace,String jrnydate,String retrndate) throws InterruptedException {
		
		//open URL
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.linkText("eTicket Login")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='submitBtn']")).click();

		Thread.sleep(3000);
		Actions a = new Actions(driver);
		WebElement start = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		a.sendKeys(start, startplace).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		WebElement end = driver.findElement(By.xpath("//input[@id='toPlaceName']"));
		a.sendKeys(end, endplace).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		a.moveToElement(driver.findElement(By.xpath("//input[@id='txtJourneyDate']"))).sendKeys(jrnydate);
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']"))).sendKeys(retrndate);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();

		// logout
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@DataProvider(name = "getTestData")
	public Object[][] getTestData() {
		Object[][] data = null;
		try {
			data = ExcelDataReader.getTestData("F:\\Practice\\TestData.xlsx", "Sheet1");
		} catch (Exception exception) {
			System.out.println(exception.toString());
		}
		return data;
	}
	
}



