package com.CoreJavaScripts;

import java.util.Scanner;

public class SingleDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("elemnts are");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
