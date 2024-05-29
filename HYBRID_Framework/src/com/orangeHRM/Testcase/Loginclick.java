package com.orangeHRM.Testcase;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHRM.Pageobject.Homepage;
import com.orangeHRM.baseTEST.Basetest;
import com.orangeHRM.baseTEST.Readexcle;

public class Loginclick extends Basetest 
{
@Test
	public void click() throws EncryptedDocumentException, IOException {
	hm.pimclk().click();
	hm.Addemp().click();
	hm.firstname().sendKeys(Readexcle.Readdata("Sheet1", 1, 0));
	hm.middlename().sendKeys(Readexcle.Readdata("Sheet1", 1, 1));
	hm.lastname().sendKeys(Readexcle.Readdata("Sheet1", 1, 2));
	hm.saveclick().click();
	Assert.fail();
	}
   

}
