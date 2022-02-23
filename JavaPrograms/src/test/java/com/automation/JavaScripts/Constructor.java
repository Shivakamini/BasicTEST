package com.automation.JavaScripts;


class employee
{
	public int empid;
	public String name;
	static double salary;
	
	employee()
	{
		empid=101;
		name="shiva";
		salary=100.00;
	}
	employee(int id,String nm,double s)
	{
		empid=id;
		name=nm;
		salary=s;
	}
	void print() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(salary);
		
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		employee e=new employee();
		e.print();
		employee e2=new employee(11,"shiva",200.00);
		e2.print();
		employee e3=new employee();
		e3.empid=143;
		e3.name="Krishna";
		e3.salary=1000.00;
		e3.print();
	}

}
