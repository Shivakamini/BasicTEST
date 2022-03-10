package com.javaScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s=new Select(ele);
		s.selectByVisibleText("Consultant");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("ProtoCommerce Home")));
		List<WebElement> items=driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int item=0;item<items.size();item++) 
		{ 
			items.get(item).click(); 
		}
		 
		/*
		 * for(WebElement i:items) { i.click(); }
		 */
        driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
        driver.findElement(By.cssSelector(".btn.btn-success")).click();
	}

}
