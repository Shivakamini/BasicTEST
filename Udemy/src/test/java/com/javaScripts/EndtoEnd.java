package com.javaScripts;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://corporate.spicejet.com/Default.aspx");
		driver.manage().window().maximize();
		
		//select currency
		WebElement currency=driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(currency);
		s.selectByValue("INR");
		
		//Select passenger types
		driver.findElement(By.cssSelector(".paxinfo")).click();
		System.out.println("how many adults");
		Scanner sc=new Scanner(System.in);
		String adults=sc.nextLine();
		System.out.println("how many childs");
		String childs=sc.nextLine();
		WebElement adulttype=driver.findElement(By.cssSelector("select[name='ctl00$mainContent$ddl_Adult']"));
		Select s2=new Select(adulttype);
		List<WebElement> adultcount=s2.getOptions();
		for(WebElement e:adultcount)
		{
		   if(e.getText().equalsIgnoreCase(adults))
		   {
			   s2.selectByVisibleText(e.getText());
		   }
		}
		
		WebElement childtype=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
		Select s3=new Select(childtype);
		List<WebElement> childcount=s2.getOptions();
		for(WebElement e:childcount)
		{
		   if(e.getText().equalsIgnoreCase(childs))
		   {
			   s3.selectByVisibleText(e.getText());
		   }
		}
		driver.findElement(By.cssSelector(".paxinfo")).click();
		
		//select locations
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#glsctl00_mainContent_ddl_destinationStation1_CTNR a[value='HYD']")).click();
		
		//select on date
	    System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).isEnabled());
		driver.findElement(By.cssSelector(".ui-state-active")).click();
		
		Thread.sleep(3000);
		
		//check if return date is enabled
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
		System.out.println("its disabled");
		Assert.assertTrue(true);
		}
		else
		{
		System.out.println("its enabled");
		Assert.assertTrue(false);
		}
        
        //select checkbox
        List<WebElement> checkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(checkboxes.size());
        checkboxes.get(2).click();
        
        //click on Search
        driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
