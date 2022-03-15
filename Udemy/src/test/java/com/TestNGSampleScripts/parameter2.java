package com.TestNGSampleScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter2 {

	@Parameters({"browser","URL"})
	@Test
	public void Demo2(String browserName2,String urlName)
	{
		System.out.println("parameter2");
		System.out.println(browserName2);
		System.out.println(urlName);
	}
}
