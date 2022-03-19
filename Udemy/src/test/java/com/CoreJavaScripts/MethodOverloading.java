package com.CoreJavaScripts;

public class MethodOverloading {

	int x,y,z;
	
	public MethodOverloading() {
		x=45;
		y=27;
		z=12;
	}
	
	public MethodOverloading(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void m1()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);	
	}
	
	void m1(int x,int y)
	{
	this.x=x;
	this.y=y;
	}
	
	void m1(int a,int b,int c)
	{
	x=a;
	y=b;
	z=c;
	}
	
	void m1(int z)
	{
		this.z=z;
	}
	
	void print()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);	
	}
	
	public static void main(String[] args) {
		
		MethodOverloading ob=new MethodOverloading();
		ob.m1();
		ob.m1(10,20);
		ob.print();
		ob.m1(30);
		ob.print();
		ob.m1(1,2,3);
		ob.print();
		ob.x=5;
		ob.y=8;
		ob.z=4;
		ob.m1();
		
		MethodOverloading ob2=new MethodOverloading(67,89,43);
		ob2.print();
		ob2.x=57;
		ob2.y=83;
		ob2.z=42;
		ob2.print();

	}

}
