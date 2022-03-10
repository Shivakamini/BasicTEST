package com.javaScripts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesWodsinString {

	public static void main(String[] args) {

		String str = "I am am in the in meeting";
		String[] words = str.split(" ");

		Map<String,Integer> map=new HashMap<String,Integer>();
	    for(String word:words)
	    {
	    	if(map.containsKey(word))
	    	{
	    		map.put(word, map.get(word)+1);
	    	}
	    	else
	    	{
	    		map.put(word,1);
	    	}		
		}
	    
	    Set<Map.Entry<String,Integer>> setenter=map.entrySet();
	    
	    for(Map.Entry<String,Integer> m:setenter)
	    {
	    	if(m.getValue()>1)
	    	{
	    		System.out.println(m.getKey());
	    	}
	    }

	}

}
