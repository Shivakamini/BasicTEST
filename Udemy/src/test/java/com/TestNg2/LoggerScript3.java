package com.TestNg2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.TestNGSampleScripts.LoggerScript;

public class LoggerScript3 {

	private static Logger log=LogManager.getLogger(LoggerScript3.class.getName());

	public static void main(String arg[])
	{
		
		log.debug("I am debugging");
		
		try
		{
			if(5%0==1)
			{
				log.info("Condition is correct");
			}
			else
			{
				log.error("Condition is not correct");
			}
		}
		catch(Exception e)
		{
			log.fatal("Exception catched");
		}
		
	}
}

