package com.TestNGSampleScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {

	@Test(enabled=false)
	public void MSRTest2()
	{
		System.out.println("MSRTest2");
	}
	
	@Test
	public void MBRTest2()
	{
		System.out.println("MBRTest2");
	}
	
	@BeforeTest
	public void Start()
	{
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void Start2()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void Start6()
	{
		System.out.println("AfterClass");
	}

	@BeforeMethod
	public void Start7()
	{
		System.out.println("BeforeMethod1");
	}
	
	@AfterMethod
	public void Start8()
	{
		System.out.println("AfterMethod1");
	}
	
	@Test(groups= {"sanity"})
	public void MBRTestOverride()
	{
		System.out.println("MBRTest4");
	}
	
	@AfterSuite
	public void Suite()
	{
		System.out.println("AfterSuite");
	}
	
	@Test
	public void MBLTest2()
	{
		System.out.println("MBLTest2");
	}
	
}
