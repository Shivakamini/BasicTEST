package com.javaScripts;

public class ArrayPrintEven {

	public static void main(String[] args) {

        int[] a= {1,2,3,4,5,6,7,8,9,10,122};
        
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]%2==0)
        	{
        		System.out.println(a[i]);
        	}
        	else
        	{
        		System.out.println("not fully devided by 2");
        	}
        }
        
        	for(int e:a)
        	{
        		System.out.println("elements are "+e);
        	}
        

	}

}
