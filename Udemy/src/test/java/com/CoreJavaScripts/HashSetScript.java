package com.CoreJavaScripts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetScript  {

	public static void main(String[] args) {

		Set<String> al=new HashSet<String>();
		al.add("shiva");
		al.add("krishna");
		al.add("ganesh");
		al.add("parvathi");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("shiva"));
		al.remove("ganesh");
		//al.add(2,"baba");
		//al.remove(0);
		//System.out.println(al.get(2));
		//System.out.println(al.indexOf("baba"));
		System.out.println(al);
		al.add("Gopal");
		System.out.println(al);
		
		Iterator<String> lt=al.iterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		

		
	}

}
