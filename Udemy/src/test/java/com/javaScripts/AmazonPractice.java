package com.javaScripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPractice {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector(".nav-right a[href*='signin']"))).build().perform();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.cssSelector("#nav-al-signin span[class='nav-action-inner']"));
		a.click(element).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("9493269055");
	    driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Anusurya@14");
		driver.findElement(By.cssSelector("#signInSubmit")).click();
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[text()='Hello, Shivakamini']")));
		List<WebElement> ele=driver.findElements(By.xpath("//div[@data-a-card-type='basic']"));
		System.out.println(ele.size());
		List<WebElement> options=driver.findElements(By.xpath("//div //span[@class='a-size-small a-color-base truncate-2line']"));
		System.out.println(options.size());
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			if(options.get(i).getText().contains("Kitchen essentials"))
			{
				options.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Home & Kitchen']")).click();
		WebElement type=driver.findElement(By.xpath("//span[text()='Prestige']"));
		//driver.findElement(with(By.tagName("i")).toLeftOf(type)).click();
		Thread.sleep(3000);
		//driver.findElement(with(By.tagName("i")).toLeftOf(type)).click();
		List<WebElement> items=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		System.out.println(items.size());
		for(int i=0;i<items.size();i++)
		{
			if(items.get(i).getText().contains("Storage Box"))
			{
				Thread.sleep(3000);
				items.get(i).click();
			}
		}
		
		List<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='a-box-inner'] //select[@name='quantity']")));
		WebElement qty=driver.findElement(By.xpath("//div[@class='a-box-inner'] //select[@name='quantity']"));
		Select s=new Select(qty);
		s.selectByVisibleText("2");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		/*
		 * driver.navigate().back(); Thread.sleep(3000); List<WebElement>
		 * headers=driver.findElements(By.
		 * xpath("//div[@data-a-card-type='basic']  //div[@class='a-cardui-header']"));
		 * System.out.println(headers.size()); for(int i=0;i<headers.size();i++) {
		 * driver.navigate().refresh();
		 * if(headers.get(i).getText().contains("Styles for Women"))
		 * driver.navigate().refresh(); { driver.findElements(By.
		 * xpath("//a[@class='a-link-normal see-more truncate-1line']")).get(i).click();
		 * } }
		 * 
		 * List<WebElement>
		 * womens=driver.findElements(By.xpath("img[src*='SBC-womens-clothing']"));
		 * for(int i=0;i<womens.size();i++) {
		 * System.out.println(womens.get(i).getText()); }
		 */
		
		
		
		
		
		
		
	}

}
