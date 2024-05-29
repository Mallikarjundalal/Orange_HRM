package com.orangeHRM.baseTEST;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangeHRM.Pageobject.Homepage;
import com.orangeHRM.Pageobject.Loginpage;
import com.orangeHRM.Pageobject.Logoutfromapp;

public class Basetest implements Applicationconstent
{
	 WebDriver driver;
	Properties prop;
	FileInputStream fis;
	Logoutfromapp lo;
	Loginpage lg;
	public Homepage hm;
	//WebDriverWait ew;
	@BeforeClass
	public void login() throws IOException {
		System.setProperty(chrome_key, chrome_value);
    driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(waittime,TimeUnit.SECONDS);
	 prop=new Properties();
	fis=new FileInputStream("./Properties/Testdata.properties");
	prop.load(fis);
	driver.get(prop.getProperty("url"));
	 hm=new Homepage(driver);
	}
	@BeforeMethod
	public void login2() {
	 lg=new Loginpage(driver);
	lg.Enterusn().sendKeys(prop.getProperty("usn"));
	lg.Enterpse().sendKeys(prop.getProperty("psw"));
	lg.clicklogin().click();
	}
	@AfterMethod
	public void logout(ITestResult result) throws IOException {
		if(result.FAILURE==result.getStatus())
		{
			Defects.defctsadd(driver,result.getName());
		}
		 lo=new Logoutfromapp(driver);
		lo.profileclik().click();
		lo.logout().click();
		}
	@AfterClass
	public void closeapp() {
		driver.close();
	}
}
