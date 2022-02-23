package com.automation.JavaInterview;

import java.util.Scanner;

public class NumberPolindrome {

	public static void main(String[] args) {

       int sum = 0,rev=0,temp;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=sc.nextInt();
      
       temp=num;//storing number in temp at present
       
       while(num>0)
       {
    	   rev=num%10;            
    	   sum=(sum*10)+rev;
    	   num=num/10;
       }
       if(temp==sum)
       {
    	   System.out.println("polindrome");
       }
       else
       {
    	   System.out.println("Not polindrome");
       }
       
	}

}
