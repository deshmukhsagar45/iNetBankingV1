package com.iNetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src =new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}		
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseUrl");
		return url;
	}
	
	public String getUserName()
	{
		String uname=pro.getProperty("username");
		return uname;
	}
	
	public String getPasswordL()
	{
		String pwd=pro.getProperty("password");
		return pwd;
	}
	
	public String getchromepath()
	{
		String chrome=pro.getProperty("chromepath");
		return chrome;
	}
	
	public String getfoxpath()
	{
		String foxpath=pro.getProperty("firefoxpath");
		return foxpath;
	}
}
