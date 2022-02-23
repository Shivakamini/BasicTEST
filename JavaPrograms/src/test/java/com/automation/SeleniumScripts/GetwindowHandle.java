package com.automation.SeleniumScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetwindowHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//Syste.setProperty("webdriver.chrome.driver","path of chromedriver.exe file");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		String s=driver.getTitle();
		System.out.println(s);
		String fwinid=driver.getWindowHandle();
		System.out.println(fwinid);
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.close();*/
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(driver.getTitle());
		String winID=driver.getWindowHandle();
		System.out.println(winID);
		
//=====================wait till 3 windows opened============================
		/*WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));*/
		
		Set<String> WinIDs=driver.getWindowHandles();
		System.out.println(WinIDs);
		System.out.println(WinIDs.size());
//========================iterator to iterate set=========================
		/*Iterator<String> it=WinIDs.iterator();
		while(it.hasNext())
		{
			it.next().toString();
			driver.switchTo().newWindow(5);
		}*/
		
		for(String w:WinIDs)
		{
			System.out.println(w+"==>"+driver.getTitle());
			System.out.println(w+"==>"+driver.getWindowHandle());
			boolean isExists=false;
			isExists=driver.getTitle().equalsIgnoreCase("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
			if(isExists==true)
			{
				System.out.println(driver.getPageSource());
				System.out.println(driver.getCurrentUrl());
				driver.navigate().to("https://www.zomato.com");		
			}
			else
			{
				driver.close();
			}
			driver.switchTo().window(winID);
			System.out.println(winID+"=="+driver.getTitle());
		}
		
		}

}
