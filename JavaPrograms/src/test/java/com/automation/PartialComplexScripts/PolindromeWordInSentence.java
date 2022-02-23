package com.automation.PartialComplexScripts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PolindromeWordInSentence {
	
	// create object of buffer class.
		static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
	 
		// function to check palindrome
		boolean IsPalindrome(String s)
		{
			int l=s.length();
			String rev="";
			for(int i=l-1; i>=0; i--)
			{
				rev=rev+s.charAt(i);
			}
			if(rev.equals(s))
				return true;
			else
				return false;
		}
	 
		public static void main(String args[])throws IOException
	    {
			// create function of palindromewords.
			PolindromeWordInSentence ob=new PolindromeWordInSentence();
	        
			// enter the sentence.
			System.out.print("Enter the sentence : ");
	        String s=br.readLine();
	        
	        // to convert into upper case.
	        s=s.toUpperCase();
	 
	        StringTokenizer str = new StringTokenizer(s,".?! ");
	        int w=str.countTokens(); 
	 
	        String word[]=new String[w];
	        for(int i=0;i<w;i++)
	        {
	            word[i]=str.nextToken();
	        }
	 
	        int count=0;
	        System.out.print("OUTPUT : ");
	        for(int i=0; i<w; i++)
	        {
	            if(ob.IsPalindrome(word[i])==true)
	            {
	                count++;
	                System.out.print(word[i]+" ");
	            }
	        }
	 
	        // To show the palindrome or not.
	        if(count==0)
	        System.out.println("No Palindrome Words");
	        else
	        System.out.println("\nNumber of Palindromic Words : "+count);
	    }
	}