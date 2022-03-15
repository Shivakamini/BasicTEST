package com.PageFactory;



import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ByFirstPage {

	private WebDriver driver;
	
	private static Logger log=LogManager.getLogger(ByFirstPage.class.getName());
	
	By enterText=By.xpath("//input[@id='gh-ac']");
	By search=By.xpath("//input[@type='submit']");
	
	public ByFirstPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void serachPage(String item)
	{
		log.debug("item searching");
		driver.findElement(enterText).sendKeys(item);
		driver.findElement(search).click();
		log.info("item searched");
		driver.close();
	}
}
