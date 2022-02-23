package com.automation.JavaInterview;

//Example: a={2,3,0,0,5,0,8}

public class ArrayallZerostoEnd2 {

	public static void main(String[] args) {

        int a[]={2,3,0,0,5,0,8};
        
        int i,count=0;
        
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
