package com.javaScripts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubDriverChildWindows {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int linksSize=allLinks.size();
		System.out.println(linksSize);
		WebElement footerDriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		List<WebElement> footerLinks=footerDriver.findElements(By.tagName("a"));
		int footerLinksSize=footerLinks.size();
		System.out.println(footerLinksSize);
		WebElement subFooter=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> subFooterLinks=subFooter.findElements(By.tagName("a"));
		System.out.println("sub footer links: "+subFooterLinks.size());
		
		for(int i=1;i<subFooterLinks.size();i++)
		{
			String clickall=Keys.chord(Keys.CONTROL,Keys.ENTER);
			//subFooterLinks.get(i).click();-------------fails as subwindow becomes main window
			subFooterLinks.get(i).sendKeys(clickall);
			Thread.sleep(5000);			
		}
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}
	
}
