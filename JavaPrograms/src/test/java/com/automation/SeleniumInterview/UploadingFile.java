package com.automation.SeleniumInterview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadingFile {

public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		WebElement ele=driver.findElement(By.id("file-upload"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	    Thread.sleep(3000);
		StringSelection str=new StringSelection("F:\\Practice\\selenium.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB); 
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB); 
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}

}
