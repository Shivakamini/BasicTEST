package com.automation.JavaScripts;

class amma
{
	void m1()
	{
		System.out.println("Give best");
	}
	void m2()
	{
		System.out.println("Be confident");
	}
}
class Cat extends amma
{
	void m4()
	{
		System.out.println("tataiah");
	}
}
class Bata extends Cat
{
	void m3()
	{
		System.out.println("Be more");
	}
}

public class Inheritance {
	
	public static void main(String[] args) {

		Bata c=new Bata();
		c.m4();
		c.m3();
		c.m2();
		c.m1();
	}

}
