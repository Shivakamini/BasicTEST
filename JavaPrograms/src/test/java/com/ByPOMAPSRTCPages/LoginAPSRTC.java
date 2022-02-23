package com.ByPOMAPSRTCPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAPSRTC {
    

	private WebDriver driver;
	
	By username=By.xpath("//input[@id='userName']");
	By password=By.xpath("//input[@id='password']");
	By submit=By.xpath("//input[@id='submitBtn']");

	public LoginAPSRTC(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login(String name,String pwd)
	{
		 //login
		   driver.get("https://www.apsrtconline.in/oprs-web/");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("eTicket Login")).click();
	       driver.findElement(username).sendKeys(name);
		   driver.findElement(password).sendKeys(pwd);
		   driver.findElement(submit).click();
	}
}
