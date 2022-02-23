package com.automation.SeleniumInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().window().maximize();
		List<WebElement> tables=driver.findElements(By.xpath("//table"));//total tables in page
		System.out.println(tables.size());		
		WebElement table=driver.findElement(By.xpath("//table[@id='example']"));//required table
		System.out.println(table.getText());
		System.out.println(table.getSize());
		List<WebElement> totalrows=driver.findElements(By.xpath("//table[@id='example']//tr"));
		System.out.println(totalrows.size());
		List<WebElement> bodyrows=driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
		System.out.println(bodyrows.size());
		List<WebElement> totalcols=driver.findElements(By.xpath("//table[@id='example']//thead//th"));
		System.out.println(totalcols.size());
		for(WebElement col:totalcols)
		{
			System.out.println(col.getText());
		}
		List<WebElement> rowcols=driver.findElements(By.xpath("(//table[@id='example']//tr)[1]//th"));
		System.out.println(rowcols.size());
		for(WebElement rowcol:rowcols)
		{
			System.out.println(rowcol.getText());
		}
		WebElement row=driver.findElement(By.xpath("(//table[@id='example']//tbody//tr)[1]"));
		System.out.println(row.getText());
		List<WebElement> columns=driver.findElements(By.xpath("//table[@id='example']//tbody//td[5]"));
		for(WebElement column:columns)
		{
			System.out.println(column.getText());
		}
		WebElement spfccell=driver.findElement(By.xpath("(((//table[@id='example']//tbody//tr)[1])//td)[4]"));
		System.out.println(spfccell.getText());
		
		
	}

}
