package com.automation.JavaScripts;

class amma
{
	int a=10;
	
	public amma()
	{
		
	}	
	public void m1()
	{
		System.out.println("Give best");
	}
	void m2()
	{
		System.out.println("Be confident");
		this.m1();
		System.out.println(this.a);
	}
}
class Cat extends amma
{
	public void m1()
	{
		System.out.println("Give best2");
		super.m1();
	}
	void m4()
	{
		System.out.println("tataiah");	
	}
}
class Bata extends Cat
{
	int a=20;
	public Bata()
	{
		super();
	}
	void m3()
	{
		System.out.println("Be more");
		System.out.println(a);
		System.out.println(super.a);
		super.m2();
	}
}

public class Inheritance {
	
	public static void main(String[] args) {

		Bata c=new Bata();
		c.m4();
		c.m3();
		//c.m2();
		//c.m1();
	}

}
