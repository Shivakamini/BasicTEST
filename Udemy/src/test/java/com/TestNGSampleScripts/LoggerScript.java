package com.TestNGSampleScripts;

import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

public class LoggerScript {

	private static Logger log=LogManager.getLogger(LoggerScript.class.getName());

	public static void main(String arg[])
	{
		log.debug("I am debugging");
		log.info("done debugging");
		log.error("find errors");
		log.fatal("find more errors");
	}
}
