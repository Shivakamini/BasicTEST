package com.CoreJavaScripts;

import java.util.ArrayList;
import java.util.List;

public class DuplicateswithArrayList {

	public static void main(String[] args) {

		Integer a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		List<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;

			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println("duplicates are: " + a[i]);
				System.out.println("count is: " + k);
			}
			if(k==1)
			{
				System.out.println("unique is: "+a[i]+"-"+k);
			}
		}
		System.out.println(al);
	}

}
