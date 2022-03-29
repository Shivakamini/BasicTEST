package com.AutoIT;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadingdownload {

	public static void main(String[] args) throws InterruptedException, IOException {

   
		String path=System.getProperty("user.dir")+"\\AutoIT reports";
		WebDriverManager.chromedriver().setup();
		Map<String,Object> ChromePrefs=new HashMap<String,Object>();
		ChromePrefs.put("profile.default_content_settings.popups", 0);
		ChromePrefs.put("download.default_directory", path);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", ChromePrefs);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.adobe.com/acrobat/online/pdf-to-word.html?");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//button[@id='lifecycle-nativebutton']"));
		ele.click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Shiva\\Documents\\AutoIt\\FileUpload.exe");
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@class,'downloadButton')]")));

		driver.findElement(By.xpath("//button[contains(@class,'downloadButton')]")).click();

		File src = new File(path+"\\visit.docx");
		Thread.sleep(6000);
		if (src.exists()) {
			System.out.println("file downloaded successfully");
			if(src.delete())
			{
				System.out.println("file deleted successfully");
			}
		} else {
			System.out.println("file not downloaded");
		}


	}

}
