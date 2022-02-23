package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03_HYDtoBanglore {

	@Test
	public void BHYdtoBngl() throws InterruptedException
	   {
		//open browser	   
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.apsrtconline.in/oprs-web/");
		   driver.manage().window().maximize();
		   
		   //login
		   driver.findElement(By.linkText("eTicket Login")).click();
	       driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Shivakamini5");
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Anusurya@14");
		   driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
		   
		   Thread.sleep(3000);
		   Actions a=new Actions(driver);
		   WebElement start=driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		   a.sendKeys(start,"HYDERABAD").build().perform();
		   a.sendKeys(Keys.ARROW_DOWN).build().perform();
		   a.sendKeys(Keys.ENTER).build().perform();
		   WebElement end=driver.findElement(By.xpath("//input[@id='toPlaceName']"));
		   a.sendKeys(end,"BANGALORE").build().perform();
		   a.sendKeys(Keys.ARROW_DOWN).build().perform();
		   a.sendKeys(Keys.ENTER).build().perform();
		   a.moveToElement(driver.findElement(By.xpath("//input[@id='txtJourneyDate']"))).sendKeys("24/02/2022");
		   a.moveToElement(driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']"))).sendKeys("25/02/2022");
		   driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		   
		   //logout
		   driver.findElement(By.linkText("Logout")).click();
		   
		   //close browser
		   Thread.sleep(3000);
		   driver.close();

	   }
}
