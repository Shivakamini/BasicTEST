package com.PageFactoryHybridpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='fromPlaceName']")
	private WebElement HomePlace=null;
	@FindBy(xpath="//input[@id='toPlaceName']")
	private WebElement DestPlace=null;
	@FindBy(xpath="//input[@id='txtJourneyDate']")
	private WebElement OnJrnyDate=null;
	@FindBy(xpath="//input[@id='txtReturnJourneyDate']")
	private WebElement OnRetrnDate=null;
	@FindBy(xpath="//input[@id='searchBtn']")
	private WebElement onSearch=null;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void searchBus(String startplace,String endplace,String ondate,String onretrn) throws InterruptedException 
	{
		  Thread.sleep(3000);
		   Actions a=new Actions(driver);
		   a.sendKeys(HomePlace,startplace).build().perform();
		   a.sendKeys(Keys.ARROW_DOWN).build().perform();
		   a.sendKeys(Keys.ENTER).build().perform();
		   a.sendKeys(DestPlace,endplace).build().perform();
		   a.sendKeys(Keys.ARROW_DOWN).build().perform();
		   a.sendKeys(Keys.ENTER).build().perform();
		   a.moveToElement(OnJrnyDate).sendKeys(ondate);
		   a.moveToElement(OnRetrnDate).sendKeys(onretrn);
		  onSearch.click();
	}
}
