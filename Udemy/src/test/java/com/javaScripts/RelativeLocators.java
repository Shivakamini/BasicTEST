package com.javaScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.*;



public class RelativeLocators {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.xpath("//a[@id='opentab']"));
		System.out.println(driver.findElement(with(By.tagName("legend")).above(ele1)).getText());
		WebElement ele2=driver.findElement(By.xpath("//legend[contains(text(),'Switch To Alert Example')]"));
		driver.findElement(with(By.tagName("input")).below(ele2)).sendKeys("SHIVA");
		driver.navigate().to("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement ele3=driver.findElement(By.xpath("//label[@class='form-check-label']"));
	    driver.findElement(with(By.tagName("input")).toLeftOf(ele3)).click();
	    WebElement ele4=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(ele4)).getText());
	}

}
