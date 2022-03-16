package com.xyz.TestCases;

import org.testng.annotations.Test;

import com.xyz.PageObject.HomePage;

import Keywords.Constants;

public class HomePageTC_001  {
  
	@Test
	public void open_home() {	
	HomePage hp = new HomePage(Constants.getDriver());
	  System.out.println(hp.validateHomePage());
      System.out.println(hp.eagerCrowLogo());
	}
	

}
