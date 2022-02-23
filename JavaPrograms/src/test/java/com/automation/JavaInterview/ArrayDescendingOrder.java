package com.automation.JavaInterview;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDescendingOrder {

	public static void main(String[] args) {
		
		  
        Integer array[] = { 10, 45, 23, 14, 56 };
        
        Arrays.sort(array);
        System.out.println("Ascending Order: "+Arrays.toString(array));
        
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("Descending Order: "+Arrays.toString(array));
        
        Arrays.sort(array, 1,3);
        System.out.println("Sort only 1 & 2: "+Arrays.toString(array));
        
	}

	
	}


