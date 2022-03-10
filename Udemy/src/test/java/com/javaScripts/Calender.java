package com.javaScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://corporate.spicejet.com/Default.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXB']"))
				.click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).isDisplayed());

		while (!driver.findElement(By.cssSelector(".ui-datepicker-title")).getText().contains("Sept")) {
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}

		Thread.sleep(3000);
		List<WebElement> dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for (int i = 0; i < dates.size(); i++) {
			if (dates.get(i).getText().contains("20")) {
				dates.get(i).click();
				break;
			}
		}

		System.out.println(driver.findElement(By.cssSelector(".picker-second")).getAttribute("style").contains("0.5"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();
		
		while (!driver.findElement(By.cssSelector(".ui-datepicker-title")).getText().contains("Nov")) {
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}

		Thread.sleep(5000);
		List<WebElement> returndates = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for (int i = 0; i < returndates.size(); i++) {
			if (returndates.get(i).getText().contains("12")) {
				Thread.sleep(3000);
//				driver.navigate().refresh();
				returndates.get(i).click();
				break;
			}
		}

	}

}
