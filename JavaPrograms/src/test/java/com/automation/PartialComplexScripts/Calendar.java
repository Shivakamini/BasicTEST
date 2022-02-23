package com.automation.PartialComplexScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
		List<WebElement> dates=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']"));
		for(WebElement a:dates)
		{
			System.out.println(a.getText());
			if(a.getText().equalsIgnoreCase("24"))				
			{
				a.click();
				break;
			}
		}

}
}
