package com.automation.JavaInterview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Integer, String> map=new HashMap<Integer, String>();
      map.put(0, "Java");
      map.put(2, "sleenium");
      map.put(1, "High");
      map.put(3, "Mom");
      System.out.println(map.isEmpty());
      System.out.println(map.size());
      System.out.println(map);
      System.out.println(map.get(0));
      Set s=map.entrySet();
      Iterator it=s.iterator();
      while(it.hasNext())
      {
    	 // System.out.println(it.next());
    	  Map.Entry m=(Map.Entry)it.next();
    	  System.out.println(m.getKey()+","+m.getValue());
      }
    		  
	}

}
