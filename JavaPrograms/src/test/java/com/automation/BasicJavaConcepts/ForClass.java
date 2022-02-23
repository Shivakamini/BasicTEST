package com.automation.BasicJavaConcepts;

public class ForClass {

	public static void main(String[] args) {
		
		loop1:
		for(int i=0; i<=10; i++)
		{
			loop2:
			for(int j=0; j<=10; j++)
			{
				if(j<=i)
					System.out.println(j);
			    else
				continue loop1;
			}
			System.out.println(i);
		}
	}

}
