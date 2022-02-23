package com.automation.JavaInterview;

//Example; Input Array= [2.18.2, 1.18.2, 2.13.4, 1.16.4]

public class LargestVerNumfromArray {

	public static void main(String[] args) {
		
		double[]  a = {2.18, 1.18, 2.13, 1.16};
		
		double max = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("max or latest version:"+max);
		

	}

}
