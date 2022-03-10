package com.automation.BasicJavaConcepts;

import java.util.Scanner;

public class OnedimArray {

	public static void main(String[] args) {
		
//================================================one dime array===================================		
		/*Scanner s=new Scanner(System.in);
		System.out.println("Array size");
		int size=s.nextInt();
		int a[]= new int[size];
		System.out.println("input array elements");
		for(int i=0;i<a.length;i++)
	    a[i]=s.nextInt();
		System.out.println(a);
		System.out.println(a.length);
		System.out.println("array elements");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	for(int e:a) {
		System.out.println(e);
	}*/
	
		/*int a[]=new int[2];
		System.out.println("elements input");
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		System.out.println("elements are");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		for (int e:a)
		{
			System.out.println(e);
		}*/
		
		/*int a[]= {10,20};
		System.out.println("elements are");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		for (int e:a)
		{
			System.out.println(e);
		}*/

//================================================two dime array===================================			
		
	/*System.out.println("enter rows size");
	int row=s.nextInt();
	System.out.println("enter cols size");
	int col=s.nextInt();
	int a[][]=new int[row][col];
	System.out.println("element enter");
	for(int i=0;i<a.length;i++)
		for(int j=0;j<a.length;j++)
		{
			a[i][j]=s.nextInt();
		}
	System.out.println(a);
	System.out.println(a.length);
	System.out.println(a[0].length);
	System.out.println(a[1].length);
	for(int x[]:a)
	{
		for(int e:x)
		{
System.out.println(e);
}
	}*/
		
	    int a[][]= {{10,20},{30,40,60}};
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		}
}

		
		
		
		
	
