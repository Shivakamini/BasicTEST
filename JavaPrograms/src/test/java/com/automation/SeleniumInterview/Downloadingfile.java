package com.automation.SeleniumInterview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloadingfile {

	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
		driver.findElement(By.linkText("4.1.2")).click();
		Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_LEFT);
	    r.keyRelease(KeyEvent.VK_LEFT);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    File src=new File(System.getProperty("user.home")+"\\Downloads\\selenium-server-4.1.2");
	    if(src.exists())
	    {
	    	System.out.println("successfully downloaded");    	
	    }
	    else
	    {
	    	System.out.println("not downloaded");
	    }
		

	}

}
