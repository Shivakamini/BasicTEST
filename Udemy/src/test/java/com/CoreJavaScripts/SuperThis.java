package com.CoreJavaScripts;

public class SuperThis {

	int x=10;
	
	public SuperThis()
	{
		System.out.println("parent costructor");
	}
	void m1()
	{
		int x=5;
		System.out.println("parent method1");
		System.out.println(x);
		System.out.println(this.x);
	}
	
	void m2()
	{
		System.out.println("parent method2");
		System.out.println(x);
		this.m1();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperThis pob=new SuperThis();
		pob.m1();
		pob.m2();
	}

}
