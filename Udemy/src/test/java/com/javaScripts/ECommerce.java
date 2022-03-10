package com.javaScripts;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ECommerce {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		System.out.println(products.size());

//=====================other way of iterate
		/*
		 * for(WebElement product:products) { System.out.println(product.getText()); }
		 */

//=====================selecting individual products
		/*
		 * //selecting cucumber 
		 * for (int i = 0; i < products.size(); i++) 
		 * {
		 * 
		 * // System.out.println(products.get(i).getText());
		 * 
		 * if(products.get(i).getText().contains("Cucumber")) {
		 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(
		 * ); }
		 * 
		 * }
		 * 
		 * //selecting Brocolli 
		 * for(int i=0;i<products.size();i++) {
		 * if(products.get(i).getText().contains("Brocolli")) {
		 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(
		 * ); } }
		 * 
		 */

//==============================Selecting multiple items
		
		String[] productsNeed = { "Cucumber", "Brocolli","Beetroot" };
		List<String> productsRequired = Arrays.asList(productsNeed);
		System.out.println(productsRequired.size());

		for (int i = 0; i < products.size(); i++) {
			
			/*
			 * String veggieName=products.get(i).getText(); String[]
			 * veggie=veggieName.split("-"); String formattedname=veggie[0].trim();
			 */

			String formattedname = products.get(i).getText().split("-")[0].trim();
			int j = 0;
			if (productsRequired.contains(formattedname)) 
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == productsRequired.size()) 
				{
					break;
				}
			}

		}

//========================proceed to checkout
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulsheetyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Select s=new Select(ele);
		s.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		

	}

	
}
