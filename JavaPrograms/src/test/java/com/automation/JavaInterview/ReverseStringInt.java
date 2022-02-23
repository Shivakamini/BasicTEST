package com.automation.JavaInterview;

public class ReverseStringInt {

	public static void main(String[] args) {
		
//String reverse
		
		String rev="";
		String str="Shivakamini";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
        
//Integer reverse
		
		Integer a=1654379;
        int r=0,sum=0,temp;
		
        while(a>0)
        {
        	r=a%10;
        	sum=(sum*10)+r;
        	a=a/10;
        }
        System.out.println(sum);
	}

}
