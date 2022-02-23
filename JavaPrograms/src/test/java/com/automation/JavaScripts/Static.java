package com.automation.JavaScripts;

public class Static {

	int f=10;
	static int g=35;
	public static void main(String[] args) {
		System.out.println(Static.g);
		System.out.println(g);
		Static s=new Static();
		System.out.println(s.f);
	}

}
