package com.javaScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,300)");
		WebElement ele=driver.findElement(By.xpath("//div[@class='tableFixHead']/table[@id='product']"));
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		//List<WebElement> columnValues=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		//List<WebElement> columnValues=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		List<WebElement> columnValues=driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody//td[4]"));
		System.out.println(columnValues.size());
		int sum=0;
		for(int i=0;i<columnValues.size();i++)
		{
			int values=Integer.parseInt(columnValues.get(i).getText());
			sum=sum+values;
		}
		System.out.println(sum);
		
		String totalstring=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		System.out.println(totalstring.split(":")[1].trim());
		int total=Integer.parseInt(totalstring.split(":")[1].trim());
		Assert.assertEquals(sum, total);

	}

}
