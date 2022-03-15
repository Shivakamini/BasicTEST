package com.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Factorypage {

	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='gh-ac']")
	private WebElement enterText=null;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search=null;
	
	public Factorypage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void homePage() throws InterruptedException
	{
		enterText.sendKeys("HP");
		search.click();
	}
}
