package com.automation.JavaInterview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {

       Set<String> set=new HashSet<String>();
       set.add("JAVA");
       set.add("Selenium");
       set.add("JAVA");
       set.add("QTP");
       set.add("Jira");
       System.out.println(set.isEmpty());
       System.out.println(set.size());
       System.out.println(set);
       for(String str:set)
       {
    	   System.out.println(str);
       }
       set.add("Goal");
       set.remove("JAVA");
       set.add("JAVA");
       System.out.println(set.size());
       System.out.println(set);
       Iterator<String> it=set.iterator();
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }

	}

}
