package com.iNetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public enum Environment
{
	Windows;
}
	WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="uid")
	WebElement Txtusername;
	
	@FindBy(name="password")
	WebElement TxtPassword;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginbutton;
	
	public void setUserName(String uname)
	{
		Txtusername.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		TxtPassword.sendKeys(pwd);
	}
	
	public void submit()
	{
		loginbutton.click();
	}
	
	
	
}
