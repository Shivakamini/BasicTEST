package com.automation.JavaInterview;

//Example: String str= """"This#string%contains^special*characters&.""""; 

public class RemoveSpclChars4mString {

	public static void main(String[] args) {


		String str="This#string%contains^special*characters&.";
        String str1=str.replaceAll("\\s+","");//to remove spaces
        String str2=str.replaceAll("[^a-zA-Z0-9]", "");//to remove special chars
        System.out.println(str1);
        System.out.println(str2);


	}

}
