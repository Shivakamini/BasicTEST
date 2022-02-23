package com.automation.SeleniumScripts;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectgetOptions {

	public static void main(String[] args) {
		System.out.println("Enter Cat");
		Scanner sc=new Scanner(System.in);
		String Cat=sc.nextLine();
		System.out.println("Enter prod");
		String prod=sc.nextLine();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.id("gh-cat"));
		Select S=new Select(s);
		System.out.println(S.isMultiple());
		S.selectByIndex(2);
		S.selectByValue("550");
		S.selectByVisibleText("Books");
		List<WebElement> items=S.getOptions();
		System.out.println(items.size());
		boolean isExists=false;
		for(WebElement l:items)
		{
			System.out.println(l.getText());//to print all values if we keep only this line
			//isExists=l.getText().equalsIgnoreCase(Cat);
			if(isExists=l.getText().equalsIgnoreCase(Cat))
			{
				S.selectByVisibleText(l.getText());
				driver.findElement(By.id("gh-ac")).sendKeys(prod);
				driver.findElement(By.id("gh-btn")).click();
				break;
			}
			else
			{
				System.out.println("mismatch");
			}
		}

	}

}
