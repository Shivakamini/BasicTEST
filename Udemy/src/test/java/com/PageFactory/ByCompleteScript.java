package com.PageFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByCompleteScript {

	private static Logger log=LogManager.getLogger(ByCompleteScript.class.getName());
	@Test
	public void FactoryScript()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		log.info(driver.getTitle());
		
		ByFirstPage login=new ByFirstPage(driver);
		login.serachPage("HP LapTops");
		
	}
}
