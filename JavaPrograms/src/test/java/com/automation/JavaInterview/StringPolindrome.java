package com.automation.JavaInterview;

import java.util.Scanner;

public class StringPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		  String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string:");
	      str= sc.nextLine();
		  //int length=str.length();
		
		for(int i=str.length()-1;i>=0;i--)
	     rev=rev+str.charAt(i);
		if(str.equals(rev))
	    System.out.println("polidrome");
		else
			System.out.println("Not a polindrome");
	}

}
