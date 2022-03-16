package com.xyz.TestCases;

import org.testng.annotations.BeforeTest;
import Keywords.Constants;
import Keywords.Keywords;

public class BaseClass {

	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		Keywords.openBrowser("Chrome");
		Keywords.openURL();
		Thread.sleep(2000);
		//Keywords.minimize();
		
		
	}
	
	//@AfterClass
	public void tearDown()
	{
		Constants.getDriver().quit();
	}
	
	
	
	
	
}
