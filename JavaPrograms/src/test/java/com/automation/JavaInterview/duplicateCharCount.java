package com.automation.JavaInterview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Example: INPUT : String str="hcl-tech" ---OUTPUT :h-2,c-2

public class duplicateCharCount {

	public static void main(String[] args) {
		
		String str="hcl-tech";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
				System.out.println(ch[j]);				
				}
			}
		}

		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				int count=map.get(c);
				map.put(c, ++count);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		System.out.println(map);//to print all char with its count {c=2, t=1, e=1, h=2, l=1, -=1}
		
		 Set<Map.Entry<Character, Integer>> set=map.entrySet();
         for(Map.Entry<Character, Integer> S:set)
         {
        	 if(S.getValue()>1)
        	 {
        		 System.out.print(S.getKey()+"-"+S.getValue()+",");//print only chars>1 and it's count c-2, h-2

        	 }
         }

		
	
	}
}
	