package com.iNetBanking.testCases;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.iNetBanking.utilities.ReadConfig;

public class Base_Class {
	ReadConfig readconfig=new ReadConfig();
	
	public String baseUrl=readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password=readconfig.getPasswordL();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("Browser")
	@BeforeClass
	public void setup(String br)
	{
		logger=logger.getLogger("Base_Class");
		DOMConfigurator.configure("Log4j.xml");
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getfoxpath());
			driver=new FirefoxDriver();
		}
		
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
