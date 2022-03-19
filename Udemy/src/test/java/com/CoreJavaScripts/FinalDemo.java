package com.CoreJavaScripts;

class Demo{
	
	final int i=10;
	
	final void m1()
	{
		//i=57;--not possible
	   System.out.println("a");	
	}
}

public class FinalDemo extends Demo{

	final int i=20;
	
	/*----override not possible
	 * final void m1() { System.out.println("a"); }
	 */
	
	public static void main(String[] args) {

    FinalDemo fd=new FinalDemo();
    fd.m1();
	System.out.println(fd.i);

	}

}
