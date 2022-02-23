package com.automation.JavaInterview;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemDateTime {

	public static void main(String[] args) {


		SimpleDateFormat formatter=new SimpleDateFormat("DD/MM/YY");
		Date date=new Date();
		System.out.println(formatter.format(date));

	}

}
