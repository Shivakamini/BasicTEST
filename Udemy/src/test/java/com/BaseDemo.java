package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class BaseDemo {

	private static Logger log=LogManager.getLogger(BaseDemo.class.getName());


	public static void main(String arg[])
	{
		log.debug("I am debugging");
		log.info("done debugging");
		log.error("find errors");
		log.fatal("find more errors");
		
		Map<String,String> hm=new HashMap<String,String>();
		hm.put("shiva", "kamini");
		hm.put("1", "2");
		
		List<String> al=new ArrayList(hm.keySet());
		List<String> al2=new ArrayList(hm.values());
		
		
		System.out.println(al);
		System.out.println(al2);
		
	}
}

