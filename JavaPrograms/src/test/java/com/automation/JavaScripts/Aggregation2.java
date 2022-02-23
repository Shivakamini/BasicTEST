package com.automation.JavaScripts;

public class Aggregation2 {
	
	public int rno;
	public String name;
	public int sub1;
	public int sub2;
	void setstudent(int rno,String name) {
		this.rno=rno;
		this.name=name;
	}
	void printStudent()
	{
		System.out.println(rno);
		System.out.println(name);
	}
	void setdetails(int sub1,int sub2)
	{
		this.sub1=sub1;
		this.sub2=sub2;
	}
	void printdetails()
	{
		System.out.println(sub1);
		System.out.println(sub2);
	if(sub1>=40&&sub2>=40)
		System.out.println("PASS");
	else
		System.out.println("FAIL");
	}
	
	
	boolean comparemarks(Aggregation2 s)
	{
		if(sub1==s.sub1&&sub2==s.sub2)
			return true;
		else 
			return false;	
	}

	public static void main(String[] args) {

Aggregation2 agr=new Aggregation2();
          agr.setstudent(3, "SHIVA");
          agr.printStudent();
          agr.setdetails(45, 56);
          agr.printdetails();
          
          Aggregation2 agr2=new Aggregation2();    
          agr2.setstudent(3, "SHIVA");
          agr2.printStudent();
          agr2.setdetails(35, 67);
          agr2.printdetails();
          
          boolean b=agr.comparemarks(agr2);
          if(b==true)
        	  System.out.println("equal");
          else 
        	  System.out.println("Not equal");
	}

}
