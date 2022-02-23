package com.automation.SeleniumInterview;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textHighightUnderLine {

	public static void main(String[] args)  {
       
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.ebay.com");
			driver.manage().window().maximize();
			String colour=driver.findElement(By.linkText("Advanced")).getCssValue("color");
			String backgroundcolour=driver.findElement(By.linkText("Advanced")).getCssValue("background-color");
			if(!colour.equals(backgroundcolour))
			{
				System.out.println("text is highlighted");
			}
			else
			{
				System.out.println("text is not highlighted");
			}
			
			String value=driver.findElement(By.linkText("Sign in")).getCssValue("text-decoration");
			System.out.println(value);
	}

}
