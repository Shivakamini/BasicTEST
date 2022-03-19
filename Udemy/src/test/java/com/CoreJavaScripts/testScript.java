package com.CoreJavaScripts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testScript {

	public static void main(String[] args) {


		int a[]= {1,4,7,55,10,10,3};
		int b[]=new int[5];
		int count=0,j=0;
		int max=a[0];
		for(int i=0;i<a.length-2;i++) 		
		{
			count=a[i]*a[i+1]*a[i+2];
			System.out.println("multiplication of: "+a[i]+" "+a[i+1]+" "+a[i+2]+" "+"is "+count);
			
			b[i]=count;
			
			if(b[i]>max)
			{
				max=b[i];
			}	
	}
		
		System.out.println("max is "+max);
	
	}}
