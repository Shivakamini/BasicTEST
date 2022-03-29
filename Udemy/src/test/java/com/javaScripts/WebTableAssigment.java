package com.javaScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableAssigment {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//table[@name='courses']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		List<WebElement> rowscount=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		//List<WebElement> rowscount=driver.findElements(By.xpath("//table[@name='courses']//tbody//tr"));
		System.out.println("number of rows are: "+rowscount.size());
		for(int i=0;i<rowscount.size();i++)
		{
			System.out.println(rowscount.get(i).getText());
		}
		List<WebElement> columnValues=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/td[3]"));
		//List<WebElement> columnValues=driver.findElements(By.xpath("//table[@class='table-display']//tbody//td[3]"));
		int sum=0;
		for(int i=0;i<columnValues.size();i++)
		{
			System.out.println(columnValues.get(i).getText());
			sum=sum+Integer.parseInt(columnValues.get(i).getText());
		}
		System.out.println(sum);
        WebElement rowContent=driver.findElement(By.xpath("//table[@name='courses']//tbody//tr[3]"));
        System.out.println(rowContent.getText());
	}

}
