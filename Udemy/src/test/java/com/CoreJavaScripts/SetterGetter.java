package com.CoreJavaScripts;

public class SetterGetter {

	
	String name;
	int num;

	
	void setName(String name)
	{

		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args) {

		SetterGetter sg=new SetterGetter();
		sg.setName("Shiva");
		String str=sg.getName();
		System.out.println(str);

	}

}
