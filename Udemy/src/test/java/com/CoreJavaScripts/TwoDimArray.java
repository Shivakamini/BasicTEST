package com.CoreJavaScripts;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter row size");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("enter col size");
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		System.out.println("elemnts are");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j <a.length+1; j++) {
				a[i][j] = sc.nextInt();
			}
		for(int e[]:a)
			for(int x:e)
		{
			System.out.println(x);
		}
		
	}

}
