package com.subscribeStcTv.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {

	Properties pro;
	
	public readConfig()
	{
		File src = new File("./configurationfiles/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
						
		}catch(Exception e) {
			System.out.println("Exception is ="+ e.getMessage());
		}
	}
	public String getApplicationURL()
	{
		String baseUrl = pro.getProperty("baseURL");
		return baseUrl;
	}
	public String getChromePath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxPath()
	{
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}

}
