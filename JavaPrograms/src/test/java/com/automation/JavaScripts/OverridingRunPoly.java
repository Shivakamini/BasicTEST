package com.automation.JavaScripts;


class pinni
{
void m1()
{
	System.out.println("m1");
}
void m2()
{
	System.out.println("m2");
}
}
class Aunty extends pinni
{
	void m1()
	{
		System.out.println("m1");
		super.m1();
	}
	void m3()
	{
		System.out.println("m3");
	}
}
class Babai extends Aunty
{
	static void m4()
	{
		System.out.println("m4");
	}
}

public class OverridingRunPoly {

	public static void main(String[] args) {
		Babai an=new Babai();
		an.m1();
		an.m3();
		an.m2();
		Babai.m4();
	}

}
