package com.automation.SeleniumScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com");
    driver.manage().window().maximize();
	File fsource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File fdest=new File("F:\\Second\\print.png");
	FileUtils.copyFile(fsource, fdest);
	Shutterbug.shootPage(driver,Capture.FULL).save("F:\\Sreensht\\Screen.png");
	}

}
