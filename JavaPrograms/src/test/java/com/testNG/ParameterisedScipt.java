package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterisedScipt {

	WebDriver driver;
	
	   @Parameters({"browser"})
	   @BeforeTest
	   public void openBrowser(@Optional("edge") String browserName)
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
		   case "FIREFOX":
			   WebDriverManager.firefoxdriver().setup();
		       driver=new FirefoxDriver(); 
		       break;	
		   }
	   }
	   	 
	   @BeforeClass
	   public void Enter()
	   {
		   System.out.println("URL opened");
	   }
	   
	   @BeforeMethod
	   public void Login()
	   {
		   driver.get("https://www.apsrtconline.in/oprs-web/");
	       driver.manage().window().maximize(); 
		   driver.findElement(By.linkText("eTicket Login")).click();
	       driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Shivakamini5");
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Anusurya@14");
		   driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
	   }
	   	   
	  @Test()
	   public void AHYDtoVJY() throws InterruptedException
	   {		   
		   Thread.sleep(3000);
		   Actions a=new Actions(driver);
		   WebElement start=driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		   a.sendKeys(start,"HYDERABAD").build().perform();
		   a.sendKeys(Keys.ARROW_DOWN).build().perform();
		   a.sendKeys(Keys.ENTER).build().perform();
		   WebElement end=driver.findElement(By.xpath("//input[@id='toPlaceName']"));
		   a.sendKeys(end,"VIJAYAWADA").build().perform();
		   a.sendKeys(Keys.ARROW_DOWN).build().perform();
		   a.sendKeys(Keys.ENTER).build().perform();
		   a.moveToElement(driver.findElement(By.xpath("//input[@id='txtJourneyDate']"))).sendKeys("24/02/2022");
		   a.moveToElement(driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']"))).sendKeys("25/02/2022");
		   driver.findElement(By.xpath("//input[@id='searchBtn']")).click();	   
	   }

			@Test()
			public void CHYDtoChn() throws InterruptedException
			   {
			   Thread.sleep(3000);
			   Actions a=new Actions(driver);
			   WebElement start=driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
			   a.sendKeys(start,"HYDERABAD").build().perform();
			   a.sendKeys(Keys.ARROW_DOWN).build().perform();
			   a.sendKeys(Keys.ENTER).build().perform();
			   WebElement end=driver.findElement(By.xpath("//input[@id='toPlaceName']"));
			   a.sendKeys(end,"CHENNAI").build().perform();
			   a.sendKeys(Keys.ARROW_DOWN).build().perform();
			   a.sendKeys(Keys.ENTER).build().perform();
			   a.moveToElement(driver.findElement(By.xpath("//input[@id='txtJourneyDate']"))).sendKeys("24/02/2022");
			   a.moveToElement(driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']"))).sendKeys("25/02/2022");
			   driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		}
						
		@AfterMethod
		public void Logout()
		{		
			driver.findElement(By.linkText("Logout")).click();
		}
		
		@AfterClass
	    public void close()
		   {
			   System.out.println("URL closed");
		   }
				
		@AfterTest
		public void closeBrowser() throws InterruptedException
		{
			Thread.sleep(3000);
			   driver.close();
		}
		   
}


