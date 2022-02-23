package com.automation.PartialComplexScripts;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fetchCoupon {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		String Url=driver.findElement(By.xpath("")).getAttribute("src");
		URL url=new URL(Url);
		Image image=ImageIO.read(url);
		//String S=new OCR().recognizeCharacters((RenderedImage)image);
        //sSystem.out.println(S);
	}

}
