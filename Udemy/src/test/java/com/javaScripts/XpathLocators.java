package com.javaScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocators {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		action("Shivakamini", driver);		
	}
	  public static void action(String name,WebDriver driver) throws InterruptedException
	  {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Anusurya");
		driver.findElement(By.xpath("//div/span[1]/input")).click();
		driver.findElement(By.xpath("//div[@class='checkbox-container']/span[2]/input")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.xpath("//form/p")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@placeholder='Name']/following-sibling::input[1]")).sendKeys("kamini.amma@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Name']/following-sibling::input[1]/following-sibling::input[@placeholder='Phone Number']")).sendKeys("8309460804");
		
		  System.out.println(driver.findElement(By.xpath(
		  "//div[@class='forgot-pwd-btn-conainer']/button[@class='go-to-login-btn']")).
		  getText());
		  System.out.println(driver.findElement(By.xpath("//div/button[2]")).getText())
		  ; driver.findElement(By.xpath("//div/button[2]")).click();
		  System.out.println(driver.findElement(By.xpath(
		  "//p[contains(text(),'rahulshettyacademy')]")).getText()); String
		  pwdText=driver.findElement(By.xpath(
		  "//p[contains(text(),'rahulshettyacademy')]")).getText(); String[]
		  pwd=pwdText.split("'"); String password=pwd[1];
		  System.out.println("first part password is: "+pwd[0]);
		  System.out.println("2nd part password is: "+pwd[1]);
		  driver.findElement(By.xpath("//div/button[text()='Go to Login']")).click();
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(
		  name);
		  driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(
		  password); Thread.sleep(3000);
		  driver.findElement(By.xpath("//div/span[1]/input")).click();
		  driver.findElement(By.xpath(
		  "//div[@class='checkbox-container']/span[2]/input")).click();
		  driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		  Thread.sleep(3000);
		  System.out.println(driver.findElement(By.xpath("//div/p")).getText()); String
		  str=driver.findElement(By.xpath("//h2")).getText(); System.out.println(str);
		  Assert.assertEquals(str, "Hello "+ name+","); System.out.println("success");
		  System.out.println(driver.findElement(By.xpath("//div/p/parent::div")).
		  getText());
		  //driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		  //driver.close();
		 		
	  }
	}


