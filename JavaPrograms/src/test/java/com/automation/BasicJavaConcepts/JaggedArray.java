package com.automation.BasicJavaConcepts;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		
		System.out.println("array size");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int  a[][]=new int[size][];
		int i,j;
		for(i=0;i<size;i++)
		System.out.println("no.of players");
			int P=s.nextInt();
		a[i]=new int[P];
		System.out.println("Score");
		for(i=0;i<size;i++)
			for(j=0;j<a[i].length;j++)
				a[i][j]=s.nextInt();
		
		for(int x[]:a)
			{for(int e:x)
				System.out.println("Score");
			}
	}

}
