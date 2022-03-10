package com.javaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registeraccount {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/#/index");
		driver.findElement(By.xpath("(//a[@class='theme-btn'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Shivakamini");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kamini.amma@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anusurya@14");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='Sign up']")).click();
		

	}

}
