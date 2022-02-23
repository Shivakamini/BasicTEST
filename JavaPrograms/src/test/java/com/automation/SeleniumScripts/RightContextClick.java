package com.automation.SeleniumScripts;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightContextClick {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
StringSelection str=new StringSelection("Selenium");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
WebElement C=driver.findElement(By.xpath("//input[@name='q']"));
Actions a=new Actions(driver);
a.contextClick(C).build().perform();
a.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN)
    .sendKeys(Keys.ENTER).click().build().perform();
	}

}
