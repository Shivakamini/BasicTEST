package com.automation.SeleniumScripts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelect {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement item=driver.findElement(By.id("cars"));
		Select s=new Select(item);
		System.out.println(s.isMultiple());
		List<WebElement> items=s.getOptions();
		System.out.println(items.size());
		for(WebElement l:items)
		{
			System.out.println(l.getText());
			s.selectByVisibleText(l.getText());//to select all at a time
		}
		//s.selectByIndex(1);
		//s.selectByValue("opel");//to select one by one
		//s.selectByVisibleText("Audi");
		WebElement fitem=s.getFirstSelectedOption();
		System.out.println(fitem);
		List<WebElement> list=s.getAllSelectedOptions();
		System.out.println(list.size());	
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}

	}

}
