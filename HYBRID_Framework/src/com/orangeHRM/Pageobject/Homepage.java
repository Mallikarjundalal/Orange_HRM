package com.orangeHRM.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement emp;
	@FindBy(xpath= "//input[@placeholder='First Name']")
	private WebElement fntf;
	@FindBy(name="middleName")
	private WebElement mdtf;
	@FindBy(name="lastName")
	private WebElement lstf;
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement Savclk;
	public Homepage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public WebElement pimclk()
	{
		return pim;
	}
	public WebElement Addemp()
	{
		return emp;
	}
	public WebElement firstname()
	{
		return fntf;
	}
	public WebElement middlename()
	{
		return mdtf;
	}
	public WebElement lastname()
	{
		return lstf;
	}
	public WebElement saveclick()
	{
		return Savclk;
	}


}


