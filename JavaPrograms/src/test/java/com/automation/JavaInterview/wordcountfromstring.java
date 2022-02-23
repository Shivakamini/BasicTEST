package com.automation.JavaInterview;

//Example: String s= "my name is umesh";

public class wordcountfromstring {

	public static void main(String[] args) {
		
		String str="my name is umesh";
		String[] Word=str.split(" ");
		
		for(String word:Word)
		{
			System.out.println(word);
		}
		System.out.println("words count is:"+Word.length);
	}

}
