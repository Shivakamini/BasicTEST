package com.CoreJavaScripts;

public class SuperThisChild extends SuperThis {

	int x = 20;

	public SuperThisChild() {
		
		System.out.println("child costructor");
	}

	void m1() {
		/*
		 * int x = 15; System.out.println("child method1"); System.out.println(x);
		 * System.out.println(this.x);
		 */
		super.m1();
	}

	void m2() {
		System.out.println("child method2");
		System.out.println(x);
		System.out.println(super.x);
		this.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperThisChild sp = new SuperThisChild();
		sp.m1();
		sp.m2();
	}

}
