package com.valuesByFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PaasingByFile {

	public WebDriver driver = null;

	@Before
	public void openbrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
	}
	
	@When("Click on eticketLogin, enter {string},{string} and click on login button")
	public void Loginaccount(String str1,String str2) 
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.linkText("eTicket Login")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(str1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(str2);
		driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
	}
	

	@And("Enter details HYDtoCHN and click on Search")
	public void searchCHN() 
	{
		Actions a = new Actions(driver);
		WebElement start = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		a.sendKeys(start, "HYDERABAD").build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		WebElement end = driver.findElement(By.xpath("//input[@id='toPlaceName']"));
		a.sendKeys(end, "CHENNAI").build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@id='txtJourneyDate']"))).sendKeys("24/02/2022");
		a.moveToElement(driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']"))).sendKeys("25/02/2022");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}

	@And("Enter details HYDtoBnglr and click on Search")
	public void searchBnglr() 
	{
		Actions a = new Actions(driver);
		WebElement start = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		a.sendKeys(start, "HYDERABAD").build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		WebElement end = driver.findElement(By.xpath("//input[@id='toPlaceName']"));
		a.sendKeys(end, "BANGALORE").build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@id='txtJourneyDate']"))).sendKeys("24/02/2022");
		a.moveToElement(driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']"))).sendKeys("25/02/2022");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}

	@And("Enter details HYDtoVJY and click on Search")
	public void searchVJY() 
	{
		Actions a = new Actions(driver);
		WebElement start = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		a.sendKeys(start, "HYDERABAD").build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		WebElement end = driver.findElement(By.xpath("//input[@id='toPlaceName']"));
		a.sendKeys(end, "VIJAYAWADA").build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@id='txtJourneyDate']"))).sendKeys("24/02/2022");
		a.moveToElement(driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']"))).sendKeys("25/02/2022");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}

	@When("Click on logout")
	public void logout() 
	{
		driver.findElement(By.linkText("Logout")).click();
	}

	@After
	public void closebrowser() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.close();
	}

}

