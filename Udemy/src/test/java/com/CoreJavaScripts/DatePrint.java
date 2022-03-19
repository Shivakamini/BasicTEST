package com.CoreJavaScripts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		Date date=new Date();
		formatter.format(date);
		System.out.println(formatter.format(date));
		System.out.println(date.toString());
	}

}
