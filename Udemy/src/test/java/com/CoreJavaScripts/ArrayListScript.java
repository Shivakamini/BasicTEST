package com.CoreJavaScripts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListScript {

	public static void main(String[] args) {


		List<String> al=new ArrayList<String>();
		al.add("shiva");
		al.add("krishna");
		al.add("ganesh");
		al.add("parvathi");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("shiva"));
		al.remove("ganesh");
		al.add(2,"baba");
		al.remove(0);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("baba"));
		System.out.println(al);
		al.add("Gopal");
		
		ListIterator<String> lt=al.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
		
	}

}
