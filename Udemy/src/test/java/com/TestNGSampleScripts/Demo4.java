package com.TestNGSampleScripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4 {

	
	@Test(timeOut=2000)
	public void MSRTest5()
	{
		System.out.println("MSRTest5");
	}
	
	@Test(enabled=false)
	public void MBRTest5()
	{
		System.out.println("MBRTest5");
	}
	
	@BeforeTest
	public void End()
	{
		System.out.println("Beforetest2");
	}

	
	@Test(groups= {"smoke","regression"})
	public void MBLTest5()
	{
		System.out.println("MBLTest5");
	}
	
}
