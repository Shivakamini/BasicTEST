package com.automation.JavaInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Example 2: input="frontoffice", output="{(f,3),(r,1),(o-2),...}

public class Duplicatecount2 {

	public static void main(String[] args) {
		
		/*String str="frontoffice";
		char ch[]=str.toCharArray();
		for(int i=0; i<str.length(); i++)
		{
			
			for(int j=i+1; j<str.length(); j++)
			{
				if(ch[i]==ch[j])
				{
				System.out.println(ch[j]);				
				}
			}
		}*/
		 //other way for duplicateCharcount program
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		String str="frontoffice";
		for(int i=0; i<str.length();i++)
		{
		char c=str.charAt(i);
		
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		System.out.println(map);
		
		Set<Map.Entry<Character,Integer>> set=map.entrySet();
		for(Map.Entry<Character,Integer> K:set)
		{
			if(K.getValue()>1)
			{
				System.out.println(K.getKey()+"-"+K.getValue());
			}
		}
			}
}