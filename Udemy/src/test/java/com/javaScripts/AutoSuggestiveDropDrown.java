package com.javaScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropDrown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		
		/*
		 * ele.sendKeys("uni"); Thread.sleep(3000); ele.sendKeys(Keys.ARROW_DOWN);
		 * ele.sendKeys(Keys.ENTER);
		 */
		
		/*
		 * Actions a=new Actions(driver); a.sendKeys(ele,"ind").perform();
		 * Thread.sleep(3000);
		 * a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 */
		
		String str1=ele.getText();
		System.out.println("before:"+str1);
		ele.sendKeys("uni");
		Thread.sleep(4000);
		List<WebElement> values=driver.findElements(By.cssSelector(".ui-menu-item div[class='ui-menu-item-wrapper']"));
		System.out.println(values.size());
		for(int i=0;i<values.size();i++)
		{
			if(values.get(i).getText().contains("Kingdom"))
			{
				values.get(i).click();
			}
		}
		Thread.sleep(3000);
		String str2=ele.getAttribute("value");
		System.out.println("after"+str2);
		
	}

}
