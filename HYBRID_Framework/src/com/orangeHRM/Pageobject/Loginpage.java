package com.orangeHRM.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.baseTEST.Basetest;

public class Loginpage extends Basetest{
	
	@FindBy(name="username")
	private WebElement usn;
	@FindBy(name="password")
	private WebElement psw;
	@FindBy(xpath="//Button[@type='submit']")
	private WebElement lgn;
	public Loginpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public WebElement Enterusn()
	{
		return usn;
	}
	public WebElement Enterpse()
	{
		return psw;
	}
	public WebElement clicklogin()
	{
		return lgn;
	}

}
