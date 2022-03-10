package com.javaScripts;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		Assert.assertNull(driver);
		driver=new ChromeDriver();
		Assert.assertNotNull(driver);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(checkboxes.size());
        Thread.sleep(3000);
        int total=checkboxes.size();
        Assert.assertEquals(6, 6);
        Thread.sleep(3000);
        Assert.assertFalse(checkboxes.get(1).isSelected());
        checkboxes.get(1).click();
        Assert.assertTrue(checkboxes.get(1).isSelected());
        driver.close();
	}

}
