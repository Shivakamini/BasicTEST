package com.CoreJavaScripts;

class start
{
	
	void m1()
	{
		System.out.println("kannayya");
	}
	void m3()
	{
		System.out.println("kannayya3");
	}
	static void m2()
	{
		System.out.println("shivayya");
	}
}

public class MethodOverriding extends start{
	
	void m1()
	{
		System.out.println("kannayya2");
	}
	void m4()
	{
		System.out.println("kannayya4");
	}
	
	  static void m2() { System.out.println("shivayya2"); }
	 

	public static void main(String[] args) {

		
		  MethodOverriding ob=new MethodOverriding();
		  ob.m1(); 
		  MethodOverriding.m2(); 
		  ob.m3();
		  ob.m4();
		  m2();
		 
		  System.out.println("break");
		  
		  start ab=new start();
	      ab.m1();
	      ab.m3();
	      start.m2();
	      
	      System.out.println("break");
	      
	      start bc=new MethodOverriding();
	      bc.m1();
	      bc.m3();
	      start.m2();
	

	}

}
