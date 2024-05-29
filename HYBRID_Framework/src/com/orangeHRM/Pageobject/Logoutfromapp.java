package com.orangeHRM.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutfromapp {
	@FindBy(xpath="//img[@alt='profile picture' and @class='oxd-userdropdown-img']")
	private WebElement profile;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logou;
	
	public Logoutfromapp(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public WebElement profileclik()
	{
		return profile;
	}
	public WebElement logout()
	{
		return logou;
	}

}
