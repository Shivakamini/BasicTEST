package com.automation.JavaScripts;


public class overloadingcompilepoly {

	
	public int id;
	public String name;
	public double salary;
	void set(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	void set(int id, double salary)//diff type of parameters
	{
		this.id=id;
		this.salary=salary;
	}
	void set(int id, String name,double salary)//diff no. of parameters
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void set(int id,double salary, String name)//diff order of parameters
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void print()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
		}
	public static void main(String[] args) {
		overloadingcompilepoly ol=new overloadingcompilepoly();
		ol.set(10, "Shiva");
		ol.print();
		ol.set(15, "Ammamma", 100.00);
		ol.print();
		ol.set(20, 200.00, "tataiah");
		ol.print();
		ol.set(25, "Pinni");
		ol.print();
		
	}

}
