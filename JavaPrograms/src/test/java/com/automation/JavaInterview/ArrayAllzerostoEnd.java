package com.automation.JavaInterview;

//Example: INPUT: myArray={2,5,0,4,2,7,0,0,1,9,4} ---OUTPUT: myArray={2,5,4,2,7,1,9,4,0,0,0}
		
public class ArrayAllzerostoEnd {

	public static void main(String[] args) {

		int a[]={2,5,0,4,2,7,0,0,1,9,4};
		
		int i, count=0;
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[count++]=a[i];
			}
		}
		while(count<a.length)
		{
			a[count++]=0;
		}
		 for(i=0;i<a.length;i++)
	        {
	        	System.out.println(a[i]);
	        }
	}

	}

