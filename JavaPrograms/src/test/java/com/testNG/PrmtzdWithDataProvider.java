package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrmtzdWithDataProvider {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeTest
	public void openbrowser(@Optional("chrome") String browserName)
	{
		  switch(browserName.toUpperCase()) {
		  case "CHROME":
		      WebDriverManager.chromedriver().setup();
		      driver=new ChromeDriver();
		      break;
		  case "FIREFOX":
		      WebDriverManager.firefoxdriver().setup();
		      driver=new FirefoxDriver();
		      break;
		  case "EDGE":
		      WebDriverManager.edgedriver().setup();
		      driver=new EdgeDriver();
		      break;
		  }
		   
	}
	
	@BeforeMethod
	public void clickonlogin()
	{
		driver.get("https://www.apsrtconline.in/oprs-web/");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("eTicket Login")).click();
	}

	@Test(dataProvider="getTestData")
	public void Prmtzddataprovider(String username,String password) throws InterruptedException
	   {
       driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	   driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
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
	  public void logout() 
	  {
		  driver.findElement(By.linkText("Logout")).click();
	  }

	  @AfterTest
	  public void close() throws InterruptedException
	  {
		  Thread.sleep(3000);
		   driver.close();
	  }
	  
	  @DataProvider(name="getTestData")
	  public Object[][] getTestData()
	  {
		  Object[][] data= {{"Shivakamini5","Anusurya@14"},{"Shivakamini","Amma@14"}};
		  return data;
	  }
	   
}


