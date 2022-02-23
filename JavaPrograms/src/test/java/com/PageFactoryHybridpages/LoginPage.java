package com.PageFactoryHybridpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	
	@FindBy(linkText="eTicket Login")
	private WebElement link=null;
	@FindBy(xpath="//input[@id='userName']")
	private WebElement uName=null;
	@FindBy(xpath="//input[@id='password']")
	private WebElement PWD=null;
	@FindBy(xpath="//input[@id='submitBtn']")
	private WebElement submit=null;
		
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginPage(String uname,String upwd)
	{
        link.click();
	    uName.sendKeys(uname);
	    PWD.sendKeys(upwd);
        submit.click();       
	}

}
