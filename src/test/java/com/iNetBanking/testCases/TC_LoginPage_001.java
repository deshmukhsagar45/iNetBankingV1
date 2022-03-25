package com.iNetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.pageObject.LoginPage;


public class TC_LoginPage_001 extends Base_Class
{

	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
		logger.info("Open Browser");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.debug("entered username");
		lp.setPassword(password);
		logger.debug("entered password");
		lp.submit();
		logger.debug("click submit");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.debug("title matched");
		}
		else
		{
			Assert.assertTrue(false);
			logger.debug("title not matched");
		}
	}
	
}
