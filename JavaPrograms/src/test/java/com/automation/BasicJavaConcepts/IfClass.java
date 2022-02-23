package com.automation.BasicJavaConcepts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfClass {

	public static void main(String[] args) {
		
//===============================check char is vowel or not=========================
		
		/*System.out.println("Enter Char");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Non Vowel");	
		}*/
		
//===================================max of 3 numbers================================
		
		System.out.println("num1");
		System.out.println("num2");
		System.out.println("num3");		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>c && a>b)
		{
			System.out.println(a);
		}
		else if(b>c && b>c)
		{
			System.out.println(b);						
		}
		else
		{
			System.out.println(c);
		}
		
		/* if(n1>n2 && n1>n3)
		    {
		    	System.out.println("max is" +n1);
		    }
		    else
		    {
		    	if(n2>n3)
		    	{
		    		System.out.println("max is" +n2);
		    	}
		    	else
		    	{
		    		System.out.println("max is" +n3);
		    	}*/
		
	/*	if(x>y)
		{
			if(x>z)
			{
				System.out.println(x);
			}
			else
			{
				System.out.println(z);
			}
		}
			else
			{
				if(y>z){
				System.out.println(y);
				}
				else
				{
					System.out.println(z);
				}
			}*/
		
		
		    }
	}	

