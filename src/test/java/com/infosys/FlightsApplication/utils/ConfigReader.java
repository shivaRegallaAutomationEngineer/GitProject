package com.infosys.FlightsApplication.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop= new Properties();
	public static FileInputStream fis=null;
	
	public static void readProperties(String filePath)  {
		try {
			fis=new FileInputStream(filePath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * Created the method to get the 
	 * string value from the property file
	 * 
	 */
	
	public static String getKeyValue(String key) {
		String value=prop.getProperty(key);
	   return value;
		
	}
	
}
