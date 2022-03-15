package com.TestNGSampleScripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerScript2 {

	private static Logger log=LogManager.getLogger(LoggerScript2.class.getName());

	public static void main(String arg[])
	{
		log.debug("I am debugging");
		log.info("done debugging");
		log.error("find errors");
		log.fatal("find more errors");
	}
}

