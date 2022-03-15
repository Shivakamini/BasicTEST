package com.TestNGSampleScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {

	@AfterTest
	public void Start3()
	{
		System.out.println("AfterTest");
	}
	
	@Test
	public void MSRTest3()
	{
		System.out.println("MSRTest3");
	}
	
	@AfterClass
	public void Start4()
	{
		System.out.println("AfterClass");
	}
	
	@BeforeMethod
	public void Start8()
	{
		System.out.println("BeforeMethod2");
	}
	
	@AfterMethod
	public void Start9()
	{
		System.out.println("AfterMethod2");
	}
	
	@BeforeClass
	public void Start5()
	{
		System.out.println("BeforeClass");
	}
	
	@Test(groups= {"sanity"})
	public void MSRTestOverride()
	{
		System.out.println("MSRTest4");
	}
	
	@Test(groups= {"sanity","regression"})
	public void MBRTest3()
	{
		System.out.println("MBRTest3");
	}
	
	@Test
	public void MBLTest3()
	{
		System.out.println("MBLTest3");
	}
}
