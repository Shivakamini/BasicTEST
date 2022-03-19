package com.CoreJavaScripts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntegerArrayDuplicates {

	public static void main(String[] args) {


		Integer a[]= {4,5,5,5,4,6,6,9,4};
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int e:a)
		{
			if(map.containsKey(e))
			{
				map.put(e, map.get(e)+1);
			}
			else
			{
				map.put(e, 1);
			}
		}
		
		System.out.println(map);
		
		Set<Map.Entry<Integer,Integer>> hs=map.entrySet();
		for(Map.Entry<Integer,Integer> m:hs)
		{
			if(m.getValue()==1)
			{
				System.out.println("unique key is: "+m.getKey());
			}
		}
		
		
		
	}

}
