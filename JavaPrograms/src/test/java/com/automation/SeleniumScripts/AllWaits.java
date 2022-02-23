package com.automation.SeleniumScripts;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllWaits {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);//implicit wait
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Biryani");
	  
	    FluentWait F=new FluentWait(driver).withTimeout(Duration.ofSeconds(45)).pollingEvery(Duration.ofSeconds(15))
        		.ignoring(NoSuchElementException.class);
	    
	    F.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='nav-search-submit-button']")));
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    
		

	}

}
