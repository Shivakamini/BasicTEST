package com.CoreJavaScripts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.logging.log4j.*;

public class CalendarObject {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal=Calendar.getInstance();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		System.out.println(formatter.format(cal.getTime()));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		
	}

}
