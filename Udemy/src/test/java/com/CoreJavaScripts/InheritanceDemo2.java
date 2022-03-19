package com.CoreJavaScripts;

class Big
{
	int x=10;
	
	void m1()
	{
		System.out.println("p1");
	}
	void m3()
	{
		System.out.println("p2");
	}
	void override()
	{
		System.out.println("parent override");
	}
	static void override1()
	{
		System.out.println("satic parent override");
	}
	static void override3()
	{
		System.out.println("satic parent override2");
	}
}
public class InheritanceDemo2 extends Big
{
	int x=20;
	
	void m2()
	{
		System.out.println("c1");
	}
	void m4()
	{
		System.out.println("c2");
	}
	void override()
	{
		System.out.println("child override");
	}
	static void override1()
	{
		System.out.println("satic child override");
	}
	
	public static void main(String[] args) {

		InheritanceDemo2 al=new InheritanceDemo2();
		System.out.println(al.x);
		
		al.m1();
		al.m2();
		al.m3();
		al.m4();
		al.override();
		InheritanceDemo2.override1();
		InheritanceDemo2.override3();
		
		System.out.println("break");
		
		Big bt=new Big();
		System.out.println(bt.x);
		bt.m1();
		bt.m3();
		bt.override();
		Big.override1();
		Big.override3();
		
		System.out.println("break");
		
		Big bn=new InheritanceDemo2();
		System.out.println(bt.x);
		bn.m1();
		bn.m3();
		bn.override();
		Big.override1();
		Big.override3();
		
	}
	

}
