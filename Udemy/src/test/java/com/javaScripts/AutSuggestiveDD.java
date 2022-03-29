package com.javaScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutSuggestiveDD {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		/*WebElement ele=driver.findElement(By.xpath("//input[@id='autosuggest']"));
		Actions a=new Actions(driver);
		a.sendKeys(ele,"INDIA").perform();
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.sendKeys(Keys.ENTER).perform();*/
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		/*
		 * List<WebElement>
		 * options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		 * System.out.println(options.size()); for(WebElement option:options) {
		 * if(option.getText().equalsIgnoreCase("Indonesia")) { option.click(); } }
		 */
		
	}

}
