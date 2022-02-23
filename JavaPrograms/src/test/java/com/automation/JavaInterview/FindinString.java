package com.automation.JavaInterview;

import java.util.Scanner;

public class FindinString {

	public static void main(String[] args) {


		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str.length());
		int upper=0,lower=0,special=0,number=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				upper++;
			}
			else if(ch>='a'&&ch<='z')
			{
				lower++;
			}
			else if(ch>='1'&&ch<='9')
			{
				number++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("Upper are:"+upper);
		System.out.println("lower are:"+lower);
		System.out.println("number are:"+number);
		System.out.println("special are:"+special);

	}

}
