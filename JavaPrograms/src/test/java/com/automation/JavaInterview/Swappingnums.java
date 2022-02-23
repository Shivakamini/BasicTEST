package com.automation.JavaInterview;

import java.util.Scanner;

public class Swappingnums {

	public static void main(String[] args) {
		
		System.out.println("Welcome to java");
		
		//swapinng 2 numbers using 3rd variable
		/*int a=10;
		int b=30;
		int temp=0;	
		temp=a;
		a=b;	
        System.out.println("addition:"+(temp+b));*/
		
		//swapinng 2 numbers without using 3rd variable
		int a=10;
		int b=30;
		a=a+b;//40
		b=a-b;//10
		a=a-b;//30     			
		System.out.println(a);
		System.out.println(b);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String name=sc.next();
		System.out.println(name);		
		
	}

}
