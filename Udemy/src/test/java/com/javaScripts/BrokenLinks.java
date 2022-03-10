package com.javaScripts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.URL;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement footerdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		List<WebElement> links=footerdriver.findElements(By.tagName("a"));
		System.out.println(links.size());
		/*
		 * Iterator<WebElement> it=links.iterator(); System.out.println(it.next());
		 * String url=it.next().getAttribute("href"); System.out.println(url);
		 */
		 SoftAssert a=new SoftAssert();
		 
		for(WebElement e:links)
		{
		String url=e.getAttribute("href");		
		HttpURLConnection huc=(HttpURLConnection)new URL(url).openConnection();
		huc.setRequestMethod("HEAD");
		huc.connect();
		int respcode=huc.getResponseCode();
		System.out.println(respcode);
		
		/*
		 * if(respcode>400) {
		 * System.out.println("broken link is "+e.getText()+" "+respcode);
		 * Assert.assertTrue(false); } else {
		 * System.out.println("not broken link is "+e.getText()+" "+respcode); }
		 */
		
		 a.assertTrue(respcode<400,"broken link is "+e.getText()+" "+respcode);
		 
		}
		
		a.assertAll();
		
	}

}
