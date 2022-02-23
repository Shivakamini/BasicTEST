package com.automation.BasicJavaConcepts;

public class Areaoftriangle {

	public int base;
	public int height;
	public float area;
	void settriangle()//not parametrised method
	{
		System.out.println("shiva");
		//base=15;//initilised at here
		//height=20;
	}
	/*void settriangle(int b, int h)//parametrised method
	{
		base=b;
		height=h;
	}*/
	void settriangle(int base, int height)//parameterised method
	{
		this.base=base;
		this.height=height;
	}
	float area()//return type of method
	{
		float a=3.14f*base*height;
		return a;
	}
	public static void main(String[] args) {
		
		Areaoftriangle at=new Areaoftriangle();
		at.settriangle();
		at.base=15;//initilisation override 
		at.height=27;
		System.out.println(at.area());
		at.settriangle(10, 20);
		System.out.println(at.area());
	}

}
