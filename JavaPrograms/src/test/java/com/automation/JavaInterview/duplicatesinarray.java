package com.automation.JavaInterview;

public class duplicatesinarray {

	public static void main(String[] args) {


		int a[]={2,3,0,0,5,0,8};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}

	}

}
