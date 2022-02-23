package com.automation.JavaScripts;


interface I1
{
	void m1();
}
class Air implements I1
{
	public void m1()
	{
		System.out.println("1st impl of interface method");
	}
}
class Beta implements I1
{
	public void m1()
	{
		System.out.println("2nd impl of interface method");
	}
}

public class Interface {

	public static void main(String[] args) {
      Air ar=new Air();
      ar.m1();
      Beta bt=new Beta();
      bt.m1();

	}

}
