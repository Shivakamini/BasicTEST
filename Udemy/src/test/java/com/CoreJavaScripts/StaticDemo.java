package com.CoreJavaScripts;

public class StaticDemo {

	String name;
	static String city;
	String address;
	static int i;

	static {
		city = "HYD";
		i = 10;
	}

	public StaticDemo(String name, String address) {
		this.name = name;
		this.address = address;

	}

	/*
	 * public void getAddress() {
	 * 
	 * System.out.println(name+"\t"+address+"\t"+city); }
	 */

	public String getAddress() {
		i++;
		System.out.println(i);
		return name + "\t" + address + "\t" + city;
	}

	public static void main(String[] args) {

		StaticDemo sd = new StaticDemo("shiva", "gachibolwi");
		/*
		 * String add = sd.getAddress(); System.out.println(add);
		 */
		System.out.println(sd.getAddress());
		StaticDemo sd2 = new StaticDemo("shiva2", "DLF");
		String add2 = sd2.getAddress();
		System.out.println(add2);
		System.out.println(sd2.address);
		System.out.println(sd2.name);
		System.out.println(city);
		
		

	}

}
