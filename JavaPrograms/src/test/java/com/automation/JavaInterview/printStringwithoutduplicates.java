package com.automation.JavaInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Example= input="cricket", output="criket"

public class printStringwithoutduplicates {

	public static void main(String[] args)  {

         String str="cricket";
         char ch[]=str.toCharArray();
         for(int i=0;i<str.length();i++)
         {
        	 for(int j=i+1;j<str.length();j++)
        	 {
        		 if(ch[i]==ch[j])
        		 {
        			 System.out.println(ch[j]);
        		 }
        	 }
         }
         StringBuilder sb=new StringBuilder();
         Set<Character> hs=new LinkedHashSet<Character>();
         for(int i=0;i<str.length();i++)
         {
        	 hs.add(str.charAt(i));
         }
         for(Character c:hs)
         {
        	 sb.append(c);
         }
         
         System.out.println(sb);
	}
}
	
	


