package com.javaScripts;

public class testScript {

	public static void main(String[] args) {


		int a[]= {1,4,7,5,10,10,3};
		
		int max=a[0];
		int count=0;
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length-1;k++)
				{
					a[count++]=a[i]*a[j]*a[k];
				}
			}
		}
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
