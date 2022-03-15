package com.TestNGSampleScripts;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo5 {

	@Test
	public void MSRTest6()
	{
		System.out.println("MSRTest6");
	}
	
	@BeforeSuite
	public void Suite()
	{
		System.out.println("BeforeSuite");
	}
	
	@Test(groups= {"smoke"})
	public void MBRTest6()
	{
		System.out.println("MBRTest6");
	}
	
	@Test(dependsOnMethods="MSRTest6")
	public void MBLTest6()
	{
		System.out.println("MBLTest6");
	}
	
}
