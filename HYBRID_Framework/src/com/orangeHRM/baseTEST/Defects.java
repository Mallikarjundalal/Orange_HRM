package com.orangeHRM.baseTEST;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Defects implements Applicationconstent 
{
	public static  void defctsadd (WebDriver driver,String Filename) throws IOException
	{
		Date d=new Date(0);
		String d1 = d.toString().replace(":","-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File perm=new File(defects+Filename+d1+".png");
		FileHandler.copy(temp, perm);
//		try {
//			FileHandler.copy(perm, perm);
//		} catch (IOException e) {
//			System.out.println("hi");
//		}
		
	}

}
