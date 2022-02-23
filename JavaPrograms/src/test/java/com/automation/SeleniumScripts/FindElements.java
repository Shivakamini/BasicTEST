package com.automation.SeleniumScripts;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
		/*WebDriver driver=new ChromeDriver();
		System.out.print("enter link");
		Scanner sc=new Scanner(System.in);
		String Link=sc.nextLine();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		WebElement w=driver.findElement(By.xpath("//input[@id='gh-ac']"));
		w.sendKeys("HP Laptops");
		System.out.println(w.getText());
		WebElement s=driver.findElement(By.cssSelector("input[id='gh-btn']"));
		s.click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());*/
        Scanner S=new Scanner(System.in);
		System.out.println("enter link to be selected");
		String SLink=S.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no.of links opened"+"=>"+links.size());
		boolean isExists=false;
		for(WebElement l:links)
		{
			System.out.println(l.getText());//to dispaly all links texts;
			isExists=l.getText().equalsIgnoreCase(SLink);
            if(isExists==true)
			{
				l.click();
				System.out.println("SHIVA");
				break;
			}
            if(isExists==false)
			{
			System.out.println("Mismatch");	
			}

		}
		}
		

}
