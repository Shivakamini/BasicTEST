package com.Java8;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableSortingGettingPrice {

	public WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
		driver.manage().window().maximize();

		// click on header first column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// storing all items into list
		List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> itemNames = items.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> SortedItemNames = items.stream().sorted().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = itemNames.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(itemNames.equals(SortedItemNames));
		Assert.assertTrue(itemNames.equals(sortedList));

		List<String> prices;

		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			prices = rows.stream().filter(s -> s.getText().contains("beans")).map(s -> getPrice(s))
					.collect(Collectors.toList());

			prices.forEach(a -> System.out.println(a));

			if (prices.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (prices.size() < 1);
	}

	public static String getPrice(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;

	}
	
	public void filer()
	{
	 driver.findElement(By.id("search-field")).sendKeys("Rice");
     List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
     List<WebElement> veggieCount=veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
     Assert.assertEquals(veggies.size(), veggieCount.size());
	}

}
