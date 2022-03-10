package com.automation.JavaScripts;

class pinni {
	void m1() {
		System.out.println("m1");
	}

	void m2() {
		System.out.println("m2");
	}

	static void check() {
		System.out.println("static method");
	}

	void A() {
		System.out.println("non static method");
	}
}

class Aunty extends pinni {
	void m1() {
		System.out.println("m1");
		super.m1();
	}

	void m3() {
		System.out.println("m3");
	}

	static void check() {
		System.out.println("static override1");
	}

	void A() {
		System.out.println("non static override1");
	}
}

class Babai extends Aunty {
	static void m4() {
		System.out.println("m4");
	}

	static void check() {
		System.out.println("static override2");
	}

	void A() {
		System.out.println("non static override2");
	}
}

public class OverridingRunPoly {

	public static void main(String[] args) {
		Babai an = new Babai();
		an.m1();
		an.m3();
		an.m2();
		Babai.m4();
		an.A();
		Aunty.check();
		Aunty ant=new Aunty();
		ant.A();
	}

}
