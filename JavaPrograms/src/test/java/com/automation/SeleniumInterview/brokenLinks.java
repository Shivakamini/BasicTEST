package com.automation.SeleniumInterview;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		Iterator<WebElement> it=links.iterator();
		String url = it.next().getAttribute("href");
		if(url==null || url.isEmpty())
		{
			System.out.println("URL is not configured");
		}
		String homePage="";
		if(!url.startsWith(homePage))
		{
			System.out.println("url is in another domain");
		}
		HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
		huc.setRequestMethod("HEAD");
		huc.connect();
		int respCode = huc.getResponseCode();
		if(respCode>=400)
		{
			System.out.println("broken");
		}
		else
		{
			System.out.println("valid");
		}
	}

}
