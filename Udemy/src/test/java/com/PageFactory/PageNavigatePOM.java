package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageNavigatePOM {

	@Test
	public void navigatePOM()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		APSRTCLogin ap=new APSRTCLogin(driver);
		ForgotPassWord fp=ap.login();
		fp.frgtPWD();
	
	}
}
