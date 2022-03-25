package com.iNetBanking.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter 
{
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void OnStart(ITestContext testcontext)
	{
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repname="Test-report"+timestamp+".html";
		 htmlreporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"test-output"+repname);
		 htmlreporter.loadXMLConfig(System.getProperty("user.dir")+"extent-config.xml");
		 
		 extent=new ExtentReports();
		 extent.attachReporter(htmlreporter);
		 extent.setSystemInfo("Hostname", "localHost");
		 extent.setSystemInfo("Environment","QA");
		 extent.setSystemInfo("User","sagar");
		 
		 htmlreporter.config().setDocumentTitle("InetBanking test project");
		 htmlreporter.config().setReportName("QA Test report");
		 htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);
		 htmlreporter.config().setTheme(Theme.DARK);
	}
	//https://github.com/deshmukhsagar45/iNetBankingV1.git
	
	public void close()
	{
		extent.flush();
	
	
		}
	

	
	
	
	
	
	
	
	
	
	
	
}
