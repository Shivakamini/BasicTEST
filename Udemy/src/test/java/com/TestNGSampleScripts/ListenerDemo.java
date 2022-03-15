package com.TestNGSampleScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemo  {

	@Test
	public void A()
	{
		System.out.println("Listeners Demo1");
	}
	
	@Test
	public void B()
	{
		System.out.println("Listeners Demo2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void C()
	{
		System.out.println("Listeners Demo3");
	}

}
