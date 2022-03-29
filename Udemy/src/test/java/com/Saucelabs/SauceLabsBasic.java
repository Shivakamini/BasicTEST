package com.Saucelabs;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;

public class SauceLabsBasic {

	public static final String USERNAME = "oauth-bharathashivakamini-4a233";
	public static final String ACCESS_KEY = "a4a7ffc2-8da5-422b-b311-9531a3462ebe";
	public static final String URL = "https://USERNAME:ACCESS_KEY@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

	//public static final String URL = "https://oauth-bharathashivakamini-4a233:a4a7ffc2-8da5-422b-b311-9531a3462ebe@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws MalformedURLException {

		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * caps.setCapability("browser","chrome"); caps.setCapability("platform",
		 * "Windows 7"); caps.setCapability("version", "51.0");
		 */
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 7");
		browserOptions.setBrowserVersion("85");

		WebDriver driver = new RemoteWebDriver(new URL(URL), browserOptions);
		driver.get("https://www.google.cpm");
		System.out.println(driver.getTitle());

	}

}
