package com.automation.SeleniumInterview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Readfromproperties {
 

	
 	public static void main(String[] args) throws IOException {


	File src=new File("paath of properties file");
	FileInputStream fis=new FileInputStream(src);
	Properties prop=new Properties();
	prop.load(fis);
	
	//System.out.println(prop.getProperty("username"));//to read username 
	//driver.findElement(By.xpath(prop.getProperty("usaername"))).sendKeys("shiva");//to enter username value

	}

}
