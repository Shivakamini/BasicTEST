package com.automation.SeleniumInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POMExample {

	public static void main(String args[])
			{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.annauniv.edu/department/index.php#");
		driver.manage().window().maximize();
		String title=driver.getWindowHandle();
		System.out.println(title);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Departments")).click();
		Actions a=new Actions(driver);
		a.clickAndHold(driver.findElement(By.linkText("Faculty of Civil Engineering"))).moveToElement(driver.findElement(By.id("menuItemText33"))).click().build().perform();
		System.out.println(driver.getTitle());
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
			
}
}
