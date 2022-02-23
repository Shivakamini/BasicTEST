package com.automation.SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ModifierKeyDownUp {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
driver.manage().window().maximize();
driver.switchTo().frame("iframeResult");
WebElement K=driver.findElement(By.id("cars"));
Select s=new Select(K);
List<WebElement> list=s.getOptions();
System.out.println(list.size());
Actions a=new Actions(driver);
//a.sendKeys(Keys.CONTROL).click(list.get(0)).click(list.get(1)).build().perform();
a.keyDown(Keys.CONTROL).perform();
a.click(driver.findElement(By.xpath("//option[text()='Volvo']"))).perform();
a.click(driver.findElement(By.xpath("//option[text()='Opel']"))).perform();
a.click(driver.findElement(By.xpath("//option[text()='Audi']"))).perform();
	}

}
