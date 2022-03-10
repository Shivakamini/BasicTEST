package com.javaScripts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {

       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       driver.manage().window().maximize();
       driver.findElement(By.cssSelector("#checkBoxOption3")).click();
       String name=driver.findElement(By.xpath("//input[@id='checkBoxOption3']/parent::label")).getText();
       System.out.println(name);
       WebElement ele=driver.findElement(By.cssSelector("#dropdown-class-example"));
       Select s=new Select(ele);
       List<WebElement> options=s.getOptions();
       for(WebElement e:options)
       {
    	   if(e.getText().equalsIgnoreCase(name))
    	   {
    		   s.selectByVisibleText(e.getText());
    	   }
       }
       driver.findElement(By.cssSelector("#name")).sendKeys(name);
       Thread.sleep(3000);
       driver.findElement(By.cssSelector("#alertbtn")).click();
       String alerttext=driver.switchTo().alert().getText();
       Assert.assertTrue(driver.switchTo().alert().getText().contains(name));
       System.out.println(driver.switchTo().alert().getText().contains(name));
       driver.switchTo().alert().accept();
	}

}
