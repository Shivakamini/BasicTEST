package com.automation.JavaInterview;


// Example: Input - a[1,2,3] ; Output - b[2*3, 1*3, 1*2]

//b output is as a[1]*a[2] a[0][2] a[0]*a[1]

public class ArrayExample {

	public static void main(String[] args) {
	
		int a[]= {1,2,3};
		int b[]=new int[a.length];
		   
		for(int i=0;i<a.length;i++)
		{
			 if(i==a.length-1)
			{
				b[i]=a[i]*a[0];
			}
			else
			{
				b[i]=a[i]*a[i+1];
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
		}
		
		
	}

