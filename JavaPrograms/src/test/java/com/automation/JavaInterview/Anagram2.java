package com.automation.JavaInterview;

import java.util.Arrays;

//Example: char str1[] = { 't', 'e', 's', 't' }; & char str2[] = { 't', 't', 'e', 'w' }; 

public class Anagram2 {

	public static void main(String[] args) {
		
		char str1[]={ 't', 'e', 's', 't' };
		char str2[]={ 't', 't', 'e', 'w' }; 
		
		int len1=str1.length;
		int len2=str2.length;
		
		if(len1!=len2)
	      {
	    	  System.out.println("lengths are not same, so can't be anagram");
	      }
	      else
	      {
	    	  System.out.println("lengths are same, so check if those can be anagram");
	      }
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		boolean b=Arrays.equals(str1, str2);
		
		if(b==true)
	      {
	    	  System.out.println("Both Strings are Anagram");
	      }
	      else
	      {
	    	  System.out.println("Both Strings are not Anagram");
	      }
	      
		System.out.println("Str1 is: "+Arrays.toString(str1));
		System.out.println("Str2 is: "+Arrays.toString(str2));

	}

}
