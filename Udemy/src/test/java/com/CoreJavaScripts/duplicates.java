package com.CoreJavaScripts;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class duplicates {

	public static void main(String[] args) {
		
		String str="cricket";
		
		char a[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++) 
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate is: "+a[j]);
				}
			}
		}
		
		/*
		 * for(char c:a) { System.out.println(c); } for(int i=0;i<a.length;i++) {
		 * System.out.println(a[i]); }
		 */
		
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(mp.containsKey(c))
			{
				mp.put(c, mp.get(c)+1);		
			}
			else
			{
				mp.put(c, 1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> hs=mp.entrySet();
		
		for(Map.Entry<Character,Integer> m:hs)
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey()+"-"+m.getValue());
			}
		}
		
		StringBuilder sb=new StringBuilder();
		Set<Character> lhs=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			lhs.add(str.charAt(i));
		}
		
		for(char c:lhs)
		{
			sb.append(c);
		}

		System.out.println(sb);
	}

}
