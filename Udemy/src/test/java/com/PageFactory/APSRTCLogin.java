package com.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class APSRTCLogin {

	private WebDriver driver;
	
	By button=By.linkText("eTicket Login");
	By username=By.xpath("//input[@id='userName']");
	By password=By.xpath("//input[@id='password']");
	By submit=By.xpath("//input[@id='submitBtn']");
	By Frgtpwd=By.linkText("Forgot Password");
	
	public APSRTCLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public ForgotPassWord login()
	{
		driver.findElement(button).click();
		driver.findElement(username).sendKeys("Shivakamini");
		driver.findElement(password).click();
		driver.findElement(Frgtpwd).click();
		
		ForgotPassWord FP=new ForgotPassWord(driver);
		return FP;
		
	}

	
}
