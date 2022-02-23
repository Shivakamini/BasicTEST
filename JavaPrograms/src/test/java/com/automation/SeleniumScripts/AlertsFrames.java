package com.automation.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsFrames {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");
		driver.manage().window().maximize();
		driver.switchTo().frame("result1");
		driver.findElement(By.cssSelector("input[type='button']")).click();
		String S=driver.switchTo().alert().getText();
		System.out.println(S);
		driver.switchTo().alert().accept();
		
	}

}
