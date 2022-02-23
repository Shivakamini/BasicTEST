package com.automation.SeleniumInterview;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class encryptPassword {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String password="simpletesters123";
		byte[] encryptedPassword = Base64.getDecoder().decode(password.getBytes());
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hello");
		driver.findElement(By.id("pass")).sendKeys("encryptedPassword");
	}
	}


