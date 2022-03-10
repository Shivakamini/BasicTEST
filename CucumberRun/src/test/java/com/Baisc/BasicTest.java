package com.Baisc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {

	private WebDriver driver=null;
    
    @Given("Open browser and enter url")
    public void open_browser_and_enter_url() {
    	WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(); 
    }
    @When("Enter URL")
    public void enter_url() {
    	driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
    }
    @Then("close browser")
    public void close_browser() {
    	driver.close();	
    }
    
}

