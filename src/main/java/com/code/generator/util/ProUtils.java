package com.code.generator.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ProUtils {
	public static Map<String,String> cache = new HashMap<String,String>() ;
	public static String readValue(String key, String... filePath) {
		String path = "";
		if (filePath.length == 0) {
			path = "config.properties";
		} else {
			path = filePath[0];
		}
		String proPath = Class.class.getClass().getResource("/").getPath();
		path = proPath + path;
		Properties props = new Properties();
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(path));
			props.load(in);
			String value = props.getProperty(key);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 读取properties的全部信息
	public static void readProperties(String filePath) {
		Properties props = new Properties();
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(
					filePath));
			props.load(in);
			Enumeration en = props.propertyNames();
			while (en.hasMoreElements()) {
				String key = (String) en.nextElement();
				String Property = props.getProperty(key);
				System.out.println(key + Property);
				cache.put(key, Property) ;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
