package com.automation.JavaInterview;

public class ArrayIsEmptyORNull {

	public static void main(String[] args) {
  
		  int a[]=null;
		  if(a==null)
		  {
			  System.out.println("Null");
		  }
		  
		  a=new int[0];
		  if(a.length==0)
		  {
			  System.out.println("IsEmpty");
		  }
		 
	
	}

}
