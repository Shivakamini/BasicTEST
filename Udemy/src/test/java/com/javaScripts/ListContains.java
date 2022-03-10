package com.javaScripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListContains {

	public static void main(String[] args) {

		List<String> lt = new ArrayList<String>();
		lt.add("Mamaiah");
		lt.add("Aunty");
		lt.add("ammamma");
		lt.add("amma");
		lt.add("Pinni");
		System.out.println(lt.size());
		System.out.println(lt);
		System.out.println(lt.contains("Aunty"));

		int count = 0;
		for (String e : lt) {
			if (e.startsWith("a")) {
				count++;
				if (count == lt.size()) {
					break;
				}
			}
		}
		System.out.println(count);

	}

}
