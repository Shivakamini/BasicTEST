package com;

public class variables {

	int i=10;
	static int j=15;
	
	void get()
	{
		i=20;
		j=25;
		System.out.println(i);
		System.out.println(j);
	}
	void get1()
	{
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {

		variables var=new variables();
	    System.out.println(var.i);//10
        System.out.println(j);//15
        var.get();//20,25
        System.out.println(var.i);//20
        System.out.println(j);//25
        var.i=30;
        j=35;
        System.out.println(var.i);//30
        System.out.println(j);//35
        var.get1();//30,35
        var.get();//20,25
	}

}
