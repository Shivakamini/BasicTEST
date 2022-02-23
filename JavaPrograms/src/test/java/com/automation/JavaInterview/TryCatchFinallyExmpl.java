package com.automation.JavaInterview;

public class TryCatchFinallyExmpl {

	public static void main(String[] args) {

//Case 1-exception doesn't occur.
		
	    try
		{
			int data=25/5;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
		System.out.println("Finally Method case1");
		}
		
//Case 2- exception occurs and not handled.
		
		try
		{
			int d=25/0;
			System.out.println(d);
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getStackTrace());
		}
		finally
		{
			System.out.println("Finally Method case2");
		}
		
//Case 3- exception occurs and handled.
		
		
		try
		{
			int d=25/0;
			System.out.println(d);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Method case3");
		}

	}

}
