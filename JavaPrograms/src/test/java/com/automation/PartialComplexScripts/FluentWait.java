package com.automation.PartialComplexScripts;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();

		
		/*
		 * Wait<WebDriver> wait = new
		 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
		 * .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		 * 
		 * WebElement ele = wait.until(new Function<WebDriver, WebElement>() { public
		 * WebElement apply(WebDriver driver) { if
		 * (driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed()) {
		 * return driver.findElement(By.xpath("//h4[text()='Hello World!']")); } else
		 * return null; }
		 * 
		 * }); driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
		 */
		 	
		/*
		 * FluentWait F=new
		 * FluentWait(driver).withTimeout(Duration.ofSeconds(45)).pollingEvery(Duration.
		 * ofSeconds(15)) .ignoring(NoSuchElementException.class);
		 */
	    
				 
		 
	}
}
