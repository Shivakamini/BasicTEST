package com.CoreJavaScripts;

interface I1
{
    void m1();
	void m2();
}

public class InterfaceScript implements I1{
	
	 public void m1()
     {
  	 System.out.println("shiva");
     }
     public void m2()
     {
  	   System.out.println("kannayya");
     }

	public static void main(String[] args) {

		I1 a=new InterfaceScript();
		a.m1();
		a.m2();
	}

}
