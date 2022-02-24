package com.ExcelReader;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

import com.ExcelReader.ExcelDataReader;

public class KeywordExcelReader {

	public static WebElement GetElement(WebDriver driver, String properties) {
		WebElement element = null;

		if (ObjectUtils.isNotEmpty(properties)) {
			String propertyName = properties.split("=")[0];
			String propertyValue = properties.split("=")[1];

			switch (propertyName.toUpperCase()) {
			case "ID":
				element = driver.findElement(By.id(propertyValue));
				break;
			case "XPATH":
				element = driver.findElement(By.xpath(propertyValue));
				break;
			case "NAME":
				element = driver.findElement(By.name(propertyValue));
				break;
			case "CLASSNAME":
				element = driver.findElement(By.className(propertyValue));
				break;
			case "CSSSELECTOR":
				element = driver.findElement(By.cssSelector(propertyValue));
				break;
			case "LINKTEXT":
				element = driver.findElement(By.linkText(propertyValue));
				break;
			case "PARTIALLINKTEXT":
				element = driver.findElement(By.partialLinkText(propertyValue));
				break;
			case "TAGNAME":
				element = driver.findElement(By.tagName(propertyValue));
				break;
			}
		}
		return element;
	}

	public static void ExecuteAction(WebDriver driver, String action, WebElement element, String data) {
		switch (action) {
		case "visit":
			driver.get(data);
			break;
		case "click":
			element.click();
			break;
		case "setText":
			element.sendKeys(data);
			break;
		case "setdropText":
			Actions a = new Actions(driver);
			a.sendKeys(element, data).build().perform();
			a.sendKeys(Keys.ARROW_DOWN).build().perform();
			a.sendKeys(Keys.ENTER);
			break;
		}
	}

}
