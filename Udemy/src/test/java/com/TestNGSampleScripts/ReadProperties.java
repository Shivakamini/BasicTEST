package com.TestNGSampleScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties {

	@Test
	public void Reda() throws IOException {


		File src=new File("C:\\Users\\Shiva\\git\\repository\\Udemy\\resources\\Data.properties");
		FileInputStream fis=new FileInputStream(src);
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser","Edge");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream(src);
		prop.store(fos, null);

	}

}
