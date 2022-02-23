package com.automation.JavaInterview;

//Example; String a= """"I Love Java""" ;; O/p Java Love I

public class ReverseWords {

	public static void main(String[] args) {
         
		 String rev="";
         String a="I Love Java";
         String[] words=a.split(" ");
         
        // for(int i=0;i<words.length;i++)
        //	 System.out.println(words[i]);
         
         for(String word:words)
         {
        	 System.out.println(word);
         }
         
         System.out.println(words.length);
         
         for(int i=words.length-1;i>=0;i--)
         {
        	rev=rev+words[i]+"\t";
         }
         
         System.out.println(rev);

	}

}
