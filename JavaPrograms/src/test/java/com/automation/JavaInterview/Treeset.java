package com.automation.JavaInterview;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
	
		Set<String> TS=new TreeSet<String>();
		TS.add("hi");
		TS.add("username");
		TS.add("pass");
		TS.add("Bat");
		System.out.println(TS);
		Iterator<String> ts=TS.iterator();
		while(ts.hasNext())
		{
			System.out.println(ts.next());
		}
		
	}

}
