package com.automation.JavaInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Example: String s =""""11223356677""""

public class FindFirstNonRepeatinginString {

	public static void main(String[] args) {
		
		String str="11223356677";
		char ch[]=str.toCharArray();
		/*for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				 if(ch[i]==ch[j])
        		 {
        		System.out.println(ch[j]);
        		break;
        		 }
		}*/
			
	    Map<Character,Integer> map=new HashMap<Character,Integer>();
	    
	    for(int i=0;i<str.length();i++)
	    	{
	    	char c=str.charAt(i);
	    
	    if(map.containsKey(c))
	    {
	    	map.put(c,map.get(c)+1);
	    }
	    else
	    {
	    	map.put(c, 1);
	    }
	    	}
	    
	    System.out.println("map is: "+map);
	    
	    Set<Map.Entry<Character,Integer>> hm=map.entrySet();
	    for(Map.Entry<Character,Integer> m:hm)
	    {
	    	if(m.getValue()==1)
	    	{
	    		System.out.println(m.getKey()+"-"+m.getValue());
	    	}
	    }
	   
	}

}

