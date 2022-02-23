package com.automation.SeleniumInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBoxPresent {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("HP LAPTOPS");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//===============to check if 2nd checkbox is selected or not=======================================================
		
		/*WebElement ele=driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]"));
		
		if(!ele.isSelected())
		{
			ele.click();
		}
		else
		{
			System.out.println("element not visible");
		}*/

//===============to check last but one checkbox in a page=======================================================
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
		int total=checkboxes.size();
		System.out.println(total);
		checkboxes.get(total-1).click();
		

	}

}
