package com.javaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/angularpractice/");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("(//input[@name='name' and @type='text'])[1]")).sendKeys("User");
      driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xxxx.gmail.com");
      driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("practice");
      driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
      WebElement ele=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
      Select s=new Select(ele);
      s.selectByVisibleText("Female");
      driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
      driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("13/03/1992");
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      System.out.println(driver.findElement(By.xpath("div.alert")).getText());
      
     

	}

}
