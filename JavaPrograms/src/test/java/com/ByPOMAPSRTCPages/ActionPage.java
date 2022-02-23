package com.ByPOMAPSRTCPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionPage {

	private WebDriver driver;
	By start=By.xpath("//input[@id='fromPlaceName']");
	By end=By.xpath("//input[@id='toPlaceName']");
	By onjrnydate=By.xpath("//input[@id='txtJourneyDate']");
	By onretrndate=By.xpath("//input[@id='txtReturnJourneyDate']");
	By serch=By.xpath("//input[@id='searchBtn']");
	
	public ActionPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void actiontask(String startplace,String endplace,String ondate,String onretrn) throws InterruptedException 
	{
		  Thread.sleep(3000);
		   Actions a=new Actions(driver);
		   a.sendKeys(driver.findElement(start),startplace).build().perform();
		   a.sendKeys(Keys.ARROW_DOWN).build().perform();
		   a.sendKeys(Keys.ENTER).build().perform();
		   a.sendKeys(driver.findElement(end),endplace).build().perform();
		   a.sendKeys(Keys.ARROW_DOWN).build().perform();
		   a.sendKeys(Keys.ENTER).build().perform();
		   a.moveToElement(driver.findElement(onjrnydate)).sendKeys(ondate);
		   a.moveToElement(driver.findElement(onretrndate)).sendKeys(onretrn);
		   driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}
}
