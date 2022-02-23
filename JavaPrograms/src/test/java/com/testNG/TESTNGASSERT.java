package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTNGASSERT {
	
	WebDriver driver;
	
	@BeforeTest
	public void openbrowser()
	{
		WebDriverManager.chromedriver().setup();
		   Assert.assertNull(driver);
		   driver=new ChromeDriver();
		   Assert.assertNotNull(driver);
		   driver.get("https://www.apsrtconline.in/oprs-web/");
		   driver.manage().window().maximize();	
	}
	
	@BeforeMethod
	public void login()
	{
		 WebElement login=driver.findElement(By.linkText("eTicket Login"));
		   Assert.assertTrue(login.isEnabled());
		   login.click();
	       driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Shivakamini5");
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Anusurya@14");
		   driver.findElement(By.xpath("//input[@id='submitBtn']")).click();		   
	}
	
	@Test
	public void testngassert() throws InterruptedException
	{
	   Thread.sleep(3000);
	   Actions a=new Actions(driver);
	   WebElement start=driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
	   Assert.assertFalse(start.isSelected());
	   a.sendKeys(start,"HYDERABAD").build().perform();
	   a.sendKeys(Keys.ARROW_DOWN).build().perform();
	   a.sendKeys(Keys.ENTER).build().perform();
	   String place=start.getAttribute("value");
	   System.out.println(place);
	   Assert.assertEquals(place, "HYDERABAD");
	   WebElement end=driver.findElement(By.xpath("//input[@id='toPlaceName']"));
	   a.sendKeys(end,"VIJAYAWADA").build().perform();
	   a.sendKeys(Keys.ARROW_DOWN).build().perform();
	   a.sendKeys(Keys.ENTER).build().perform();
	   a.moveToElement(driver.findElement(By.xpath("//input[@id='txtJourneyDate']"))).sendKeys("24/02/2022");
	   a.moveToElement(driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']"))).sendKeys("25/02/2022");
	   driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}
	
	   @AfterMethod
	   public void logout() throws InterruptedException
	   {
	   driver.findElement(By.linkText("Logout")).click();
	   }
	   
	   @AfterTest
	   public void close() throws InterruptedException
	   {
	   Thread.sleep(3000);
	   driver.close();
	   Reporter.log(driver.toString());
	   }
}
  
