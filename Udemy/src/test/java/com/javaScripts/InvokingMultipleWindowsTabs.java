package com.javaScripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokingMultipleWindowsTabs {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		List<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		String str=driver.findElement(By.xpath("//label[text()='Name']")).getText();
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys(str);
		

	}

}
