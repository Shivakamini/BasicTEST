package com.PageFactoryHybridpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	private WebDriver driver;
	
	@FindBy(linkText="Logout")
	private WebElement logoutsite=null;
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	  
	public void logout()
	{
		logoutsite.click();
	}
}
