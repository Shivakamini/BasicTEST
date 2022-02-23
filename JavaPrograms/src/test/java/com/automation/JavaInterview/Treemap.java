package com.automation.JavaInterview;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Treemap {

	public static void main(String[] args) {


		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		tmap.put(2, "JIRA");
		tmap.put(4, "Hyd");
		tmap.put(5, "Wgl");
		tmap.put(2, "Chn");
		System.out.println(tmap.size());
		System.out.println(tmap.isEmpty());
		System.out.println(tmap);
		tmap.remove(5);
		System.out.println(tmap);
		Set s=tmap.entrySet();
		 Iterator it=s.iterator();
	     while(it.hasNext())
		{
			//System.out.println(it.next());
	    	 Map.Entry m=(Map.Entry)it.next();
	    	 System.out.println(m.getKey());
	    	 System.out.println(m.getValue());
		}
		
	}

}
