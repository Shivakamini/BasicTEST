package com.automation.JavaInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Example: string """"Welcome to moolya"

public class DuplicateCharsCount3 {

	public static void main(String[] args) {

       String str="Welcome to moolya";
        String str1=str.replaceAll("\\s+", "");//to replace all spaces
        System.out.println(str1);
       char ch[]=str1.toCharArray();
       for(int i=0;i<str1.length();i++)
       {
    	   for(int j=i+1;j<str1.length();j++)
    	   {
    			   if(ch[i]==ch[j]&&ch[i]!=' ')
                    {
    			   System.out.println(ch[j]);
    		        }
    	   }
       }
       Map<Character,Integer> map=new HashMap<Character,Integer>();
       
       for(int i=0;i<str1.length();i++)
    	   {
    	   char c=str1.charAt(i);
    	    if(map.containsKey(c))
    	    {
    	    	map.put(c, map.get(c)+1);
    	    }
    	    else
    	    {
    	    	map.put(c, 1);
    	    }
    	   }
       System.out.println(map);
       
       Set<Map.Entry<Character,Integer>> set=map.entrySet();
       for(Map.Entry<Character,Integer> HS:set)
       {
    	   if(HS.getValue()>1)
    	   {
    		   System.out.print(HS.getKey()+"-"+HS.getValue()+",");
    	   }
       }
       
       
       
	}

}
