package com.automation.JavaInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Arraylist {

	public static void main(String[] args) {

		 List<String> list=new ArrayList<String>();
		 list.add("SHIVA");
		 list.add("Amma");
		 list.add("Selenium");
		 list.add("SHIVA");
		 list.add("JAVA");
		 list.add("QTP");
		 System.out.println(list.isEmpty());
		 System.out.println(list);
		 System.out.println(list.size());
		 
		 ListIterator<String> lt=list.listIterator();//to traverse among list elements
		 while(lt.hasNext())//hasNext() returns true if more elements are there to traverse
		 {
			 System.out.println(lt.next());//next()- prints elements in list
		 }
		 
		 list.remove("JAVA");
		 list.remove("SHIVA");
		 System.out.println(list);
		 System.out.println(list.size());
		 
		 
		 for(String str:list)//other way to traverse among list elements
		 {
			 System.out.println(str);
		 }
		 
	}

}
