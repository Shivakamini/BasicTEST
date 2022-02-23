package com.automation.SeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
            
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//===================================================enter value===========================================
		
		WebElement enterbtn=driver.findElement(By.xpath("//input[@id='gh-ac']"));
		js.executeScript("arguments[0].value='HP'", enterbtn);//using both JS & selenium
		//js.executeScript("document.getElementById('gh-ac').value='HP'");//using only JS
		
//=============================================Click on====================================================
		
		WebElement srchbtn=driver.findElement(By.xpath("//input[@id='gh-btn']"));
		js.executeScript("arguments[0].click()", srchbtn);//using both JS & selenium
		//js.executeScript("document.getElementById('gh-btn').click()");//using only JS
		
//================================================Scroll into view=========================================
		
		WebElement newchkbx=driver.findElement(By.xpath("//input[contains(@aria-label,'New')]"));
		js.executeScript("arguments[0].scrollIntoView()", newchkbx);
		js.executeScript("arguments[0].click()", newchkbx);
		
//=============================================Page Scroll==================================================
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,-document.body.scrollheight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(document.body.scrollWight,0)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0, 1000)");
		
//================================================highlighting==================================================
		
		WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'asus')]"));
		Thread.sleep(3000);
		//js.executeScript("arguments[0].style.border='2px solid Red'", ele);
		//js.executeScript("arguments[0].style.background='green'", ele);
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid Red')", ele);
//js.executeScript("arguments[0].setAttribute('style','visibilty:visibile')",ele);//to make hidden element visible at runtime
			
//=======================================By diff methods========================================================


		js.executeScript("document.getElementsByName('_nkw')[0].scollIntoView");
		js.executeScript("document.getElementsByName('_nkw')[0].style.border='2px solid red'");
		js.executeScript("document.getElementsByName('_nkw')[0].style.background='green'");
		
//==============================================get text=========================================================
		
	    WebElement link=driver.findElement(By.linkText("Sign in"));
	    String txt=(String)js.executeScript("return arguments[0].text", link);
	    System.out.println(txt);
		String txt1=(js.executeScript("return document.getElementById('gh-ug-flex')")).toString();		
		System.out.println(txt1);
		
	}

}
