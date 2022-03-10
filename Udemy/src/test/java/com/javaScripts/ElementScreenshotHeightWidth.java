package com.javaScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshotHeightWidth
{

	public static void main(String[] args) throws IOException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.xpath("//a[@id='opentab']"));
		
		File fsrc=ele1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fsrc, new File("elecapture.png"));
		
		System.out.println(ele1.getRect().getDimension().getHeight());
		System.out.println(ele1.getRect().getDimension().getWidth());
		

	}

}
