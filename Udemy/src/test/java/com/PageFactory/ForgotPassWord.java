package com.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassWord {

private WebDriver driver;
	
	By user=By.xpath("//input[@id='userName']");
	By sbtn=By.xpath("//input[@class='submitBtn']");
	
	public ForgotPassWord(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void frgtPWD()
	{
		driver.findElement(user).sendKeys("Shivakamini");
		driver.findElement(sbtn).click();
	}
}
