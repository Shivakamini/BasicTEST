package com.TestNGSampleScripts;

import org.testng.annotations.Test;

public class Demo1 {

	@Test(priority=2)
	public void MSRTest()
	{
		System.out.println("MSRTest");
	}
	
	@Test(priority=3)
	public void MBRTest()
	{
		System.out.println("MBRTest");
	}
	
	@Test(dependsOnMethods="MSRTest")
	public void MBLTest()
	{
		System.out.println("MBLTest");
	}
	
	
}
