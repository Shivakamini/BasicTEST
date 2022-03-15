package com.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SampleEdgeScript {
	
	@Test
	public void GridExample() throws MalformedURLException
	{
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("MicrosoftEdge");
		//caps.setCapability(CapabilityType.BROWSER_NAME, "MicrosoftEdge");
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.43.239:4444"),caps);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println("EdgeTest");
		driver.close();
	}

}
