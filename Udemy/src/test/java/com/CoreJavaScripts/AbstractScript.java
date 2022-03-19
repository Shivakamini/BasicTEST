package com.CoreJavaScripts;


abstract class A
{
	public int x=1;
	public void m1()
	{
		System.out.println("shivayya");
	}
	abstract void m2();
	static void m3()
	{
		System.out.println("kannayya");
	}
	final void m4()
	{
		System.out.println("SHRIRAM");
	}
	private void m5()
	{
		System.out.println("shivayya5");
	}
	void m6()
	{
		System.out.println("shivayya6");
	}
}

public class AbstractScript extends A {

	void m2()
	{
		System.out.println("Krishna");
	}
	
	public static void main(String[] args) {

		AbstractScript a=new AbstractScript();
		a.m2();
		a.m1();
		a.m3();
		a.m4();
		a.m6();
		System.out.println(a.x);
		//a.m5() not possible as it is private method
 	}

}
