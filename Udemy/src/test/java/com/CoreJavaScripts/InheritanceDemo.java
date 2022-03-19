package com.CoreJavaScripts;


class beta
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
class alpha extends beta
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
}

public class InheritanceDemo {
	
	public static void main(String[] args) {

		alpha al=new alpha();
		System.out.println(al.x);
		al.m1();
		al.m2();
		al.m3();
		al.m4();
		al.override();
		alpha.override1();
		alpha.override3();

		System.out.println("break");
		
		beta bt=new beta();
		System.out.println(bt.x);
		bt.m1();
		bt.m3();
		bt.override();
		beta.override1();
		beta.override3();
		
		System.out.println("break");
		
		beta bn=new alpha();
		System.out.println(bt.x);
		bn.m1();
		bn.m3();
		bt.override();
		beta.override1();
		beta.override3();
	
	}
	

}
