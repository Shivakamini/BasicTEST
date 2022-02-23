package com.automation.JavaScripts;

//both Apple and banana classes are having same methods

class Apple
{
	void start() {
		System.out.println("apple");
	}
}
class Banana
{
	Apple a=new Apple();
	void start() {
		System.out.println("banana");
	}
}
public class Composition {

	public static void main(String[] args) {
		Banana b=new Banana();
		b.start();//to call method in banana 
		b.a.start();//to call method in apple
	}

}
