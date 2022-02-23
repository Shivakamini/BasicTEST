package com.automation.JavaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Example: arraylist =[2,5,1,10,20,20,15]

public class ArrayListDescendingOrder {

	public static void main(String[] args) {

        List<Integer> lt=new ArrayList<Integer>();
        lt.add(2);
        lt.add(5);
        lt.add(1);
        lt.add(10);
        lt.add(20);
        lt.add(20);
        lt.add(15);
        System.out.println(lt.size());
        System.out.println(lt);
        
        Collections.sort(lt);//Ascending Order
        System.out.println(lt);
        
        Collections.sort(lt,Collections.reverseOrder());//Descending order
        System.out.println(lt);
	}

}
