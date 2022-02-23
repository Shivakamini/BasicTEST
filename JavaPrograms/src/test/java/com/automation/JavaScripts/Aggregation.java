package com.automation.JavaScripts;

class Marks
{
	public int sub1;
	public int sub2;
	void setdetails(int sub1,int sub2)
	{
		this.sub1=sub1;
		this.sub2=sub2;
	}
	void printdetails(Student S)
	{
	System.out.println(S.getrno());
	System.out.println(S.getname());
	if(sub1>=40&&sub2>=40)
	System.out.println("pass");	
	else
	System.out.println("fail");			
	}

}
class Student
{
	private int rno;
	private String name;
	private int sub1;
	private int sub2;
	void setStudent(int rno,String name)
	{
	this.rno=rno;
	this.name=name;
	}
	int getrno()
	{
		return rno;
	}
	String getname()
	{
		return name;
	}
}
	
public class Aggregation
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.setStudent(2, "shiva");
		s1.getrno();
		s1.getname();
		Marks m=new Marks();
		m.setdetails(40,35);
		m.printdetails(s1);
		
		Student s2=new Student();
		s2.setStudent(6, "AIM");
		s2.getrno();
		s2.getname();
		m.setdetails(54, 46);
		m.printdetails(s2);
		
		
			
	}
}
