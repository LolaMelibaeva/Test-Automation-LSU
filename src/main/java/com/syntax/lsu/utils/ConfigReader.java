package com.syntax.lsu.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
		public static String getProperty(String key) {
			
		Properties prop=new Properties();
		
		try {
			prop.load(new FileInputStream(Constants.PROPERTIES_FILE_PATH));
		} catch (Exception e) {			
			e.printStackTrace();
		
		}
		return prop.getProperty(key);
	}

}
