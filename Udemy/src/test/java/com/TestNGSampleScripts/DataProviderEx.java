package com.TestNGSampleScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

	@Test(dataProvider="getTestData")
	public void providerExample(String username,String password,String category)
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println(category);
	}
	
	@DataProvider(name="getTestData")
	public Object[][] getTestData()
	{
		Object[][] data={{"shivakamini","Anusurya","female"},{"Shiva","amma","F"}};
		return data;
	}
	
}
