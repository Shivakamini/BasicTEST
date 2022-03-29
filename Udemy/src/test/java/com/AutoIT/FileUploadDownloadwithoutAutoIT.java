package com.AutoIT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDownloadwithoutAutoIT {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adobe.com/acrobat/online/pdf-to-word.html?");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//button[@id='lifecycle-nativebutton']"));
		ele.click();
		Thread.sleep(3000);
		StringSelection str = new StringSelection("C:\\Users\\Shiva\\Documents\\AutoIt\\visit.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@class,'downloadButton')]")));

		driver.findElement(By.xpath("//button[contains(@class,'downloadButton')]")).click();

		File src = new File("C:\\Users\\Shiva\\Downloads\\visit.docx");

		if (src.exists()) {
			System.out.println("file downloaded successfully");
		} else {
			System.out.println("file not downloaded");
		}

	}

}
