package com.ByPOMAPSRTCPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

	private WebDriver driver;
	
	By logout=By.linkText("Logout");
	
	
	public Logout(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void logout()
	{
		 driver.findElement(logout).click();
	}
}
