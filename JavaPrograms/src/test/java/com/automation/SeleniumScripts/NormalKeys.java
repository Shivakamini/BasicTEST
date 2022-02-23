package com.automation.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NormalKeys {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("HP");
		Actions a = new Actions(driver);
       // WebElement btn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		//a.click(btn).build().perform();// left click of mouse
		a.moveToElement(driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))).click().build().perform();
		a.sendKeys(Keys.ENTER);//keyboard enter,normal keys
		a.sendKeys(Keys.PAGE_DOWN).moveToElement(driver.findElement(By.className("a-size-medium a-color-base a-text-normal"))).click();
		

	}

}
