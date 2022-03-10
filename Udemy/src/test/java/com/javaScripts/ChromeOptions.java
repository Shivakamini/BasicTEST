package com.javaScripts;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptions {

	public static void main(String[] args) throws IOException {
		
	  
		ChromeOptions options=new ChromeOptions();
		
		
		/* ==============================================SSL accept========================================
		 * options.setAcceptInsecureCerts(true);
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new
		 * ChromeDriver(options);
		 */
		
		//===============================================adding extnsions
		
		/* options.addExtension(path); */
	   
		//============================================proxy settings
		
		/*
		 * Proxy proxy=new Proxy(); 
		 * proxy.setHTTPProxy("ipaddress:portnum");
		 * options.setCapability("proxy", proxy);
		 */
		
		//======================================set preferences
		
		/*
		 * Map<String,String> prefs=new HashMap<String,String>();
		 * prefs.put("download.default_directory","path");
		 * options.setExperimentalOption("Prefs", prefs);
		 */
		
		
		WebDriverManager.chromedriver().setup(); 
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	    WebDriver driver=new ChromeDriver(cap);
	    driver.get("https://expired.badssl.com/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
		/*
		 * driver.manage().deleteCookieNamed(""); driver.manage().deleteCookie("");
		 * driver.manage().addCookie("");
		 */
	    System.out.println(driver.getTitle());
	    
		File fsrc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fdest=new File("F:\\Practice\\screenshot1.png");
		FileUtils.copyFile(fsrc, fdest);
		Shutterbug.shootPage(driver,Capture.FULL).save("F:\\\\Practice\\\\screenshot2.png");

	}

}
