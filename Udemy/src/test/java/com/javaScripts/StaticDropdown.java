package com.javaScripts;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement currency=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		System.out.println(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).getAttribute("value"));
	    Select s=new Select(currency);
	    List<WebElement> options=s.getOptions();
	    System.out.println(options.size());
	    for(WebElement a:options)
	    {
	    	System.out.println(a.getText());
	    }
	    s.selectByValue("USD");
	    System.out.println(s.getFirstSelectedOption());
	    
	    driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	    System.out.println("num of adults required");
	    Scanner sc=new Scanner(System.in);
	    int adults=sc.nextInt();
	    for(int i=1;i<adults;i++)
	    {
	    driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	    }
	    driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
	    driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
	}

}
