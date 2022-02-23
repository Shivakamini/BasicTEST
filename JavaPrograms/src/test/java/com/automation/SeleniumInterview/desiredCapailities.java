package com.automation.SeleniumInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCapailities {

	public static void main(String[] args) {

      DesiredCapabilities cap=new DesiredCapabilities();
      cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
      System.setProperty("webdriver.chrome.driver","ChromeDriver path");
      WebDriver driver=new ChromeDriver(cap);

	}

}
