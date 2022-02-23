package com.automation.JavaInterview;

import java.util.Arrays;
import java.util.Scanner;

//Examples: HEART and EARTH are anagrams ; TRIANGLE and INTEGRAL are anagrams ; TOSS and SHOT are not anagrams
public class AnagramStrings {

	public static void main(String[] args) {

      Scanner sc =new Scanner(System.in);
      System.out.println("enter str1");
      String str1=sc.nextLine();
      System.out.println("enter str2");
      String str2=sc.nextLine();
      int len1=str1.length();
      int len2=str2.length();
      char array1[]=str1.toLowerCase().toCharArray();
      char array2[]=str2.toLowerCase().toCharArray();
      
      if(len1!=len2)
      {
    	  System.out.println("lengths are not same, so can't be anagram");
      }
      else
      {
    	  System.out.println("lengths are same, so check if those can be anagram");
      }
      
      Arrays.sort(array1);
      Arrays.sort(array2);
      
      boolean b=Arrays.equals(array1, array2);
      
      if(b==true)
      {
    	  System.out.println("Both Strings are Anagram");
      }
      else
      {
    	  System.out.println("Both Strings are not Anagram");
      }
      
      }
       
	}


