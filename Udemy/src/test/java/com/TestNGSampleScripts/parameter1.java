package com.TestNGSampleScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class parameter1 {

	@Parameters({"browser","URL"})
	@Test
	public void Demo1(String browserName,String urlName)
	{
		System.out.println("parameter1");
		System.out.println(browserName);
		System.out.println(urlName);
		/*
		 * System.out.println(url); WebDriverManager.chromedriver().setup(); WebDriver
		 * driver=new ChromeDriver(); driver.get(url);
		 */
	}
}
