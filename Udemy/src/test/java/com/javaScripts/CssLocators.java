package com.javaScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssLocators {

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
		driver.findElement(By.cssSelector("input[id*='input']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("Anusurya");
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
		driver.findElement(By.cssSelector("button.submit")).click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.cssSelector("div[class='forgot-pwd-container'] a")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("kamini.amma@gmail.com");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("8309460804");
        System.out.println(driver.findElement(By.cssSelector("div[class='forgot-pwd-btn-conainer'] button[class='go-to-login-btn']:nth-child(1)")).getText());      
        System.out.println(driver.findElement(By.cssSelector("div button:nth-child(2)")).getText());
        driver.findElement(By.cssSelector("div button:nth-child(2)")).click();
        System.out.println(driver.findElement(By.cssSelector("div form p.infoMsg")).getText());
        String pwdText=driver.findElement(By.cssSelector("div form p.infoMsg")).getText();
        String[] pwd=pwdText.split("'");
        String password=pwd[1];
        System.out.println("first part password is: "+pwd[0]);
        System.out.println("2nd part password is: "+pwd[1]);
        driver.findElement(By.cssSelector("div button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("input[id*='input']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(password);		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
		driver.findElement(By.cssSelector("button.submit")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("div p")).getText());
		String str=driver.findElement(By.cssSelector("h2")).getText();
		Assert.assertEquals(str, "Hello "+ name+",");
		System.out.println("success");
		System.out.println(driver.findElement(By.cssSelector("div.login-container")).getText());
		driver.findElement(By.cssSelector("button[class='logout-btn']")).click();
		driver.close();
		
	  }
	}
