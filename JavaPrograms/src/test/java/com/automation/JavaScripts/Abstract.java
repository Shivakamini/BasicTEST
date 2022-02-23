package com.automation.JavaScripts;

abstract class abs {

		protected String name;
		void set(String name)
		{
			this.name=name;
		}
		abstract void cal();
	}
class A extends abs{
	void cal()
	{
		System.out.println("1st impl of abstract method in derived class");
		//super(name);//must be declred in constructor only, not in method
		super.set("Shiva");
		System.out.println(name);
	}
}
class B extends abs
{
	void cal()
	{
		System.out.println("2nd impl of abstract method in derived class");
		//super(name);//must be declred in constructor only, not in method
		super.set("Shiva");
		System.out.println(name);
}
}
public class Abstract
{
	public static void main(String args[])
	{
		B b=new B();
		b.cal();
		A a=new A();
		a.cal();
		}
}