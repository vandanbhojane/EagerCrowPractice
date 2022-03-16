package com.xyz.TestCases;

import org.testng.annotations.Test;

import com.xyz.PageObject.JoinUsPage;

import Keywords.Constants;

public class JoinUsPageTC_001 {
	@Test
	public void clickOnJoinUsPage() throws InterruptedException {

	
	JoinUsPage ju=new JoinUsPage(Constants.getDriver());
	Thread.sleep(5000);
	ju.clickOnJoinUs();
	Thread.sleep(10000);
	ju.clickOnJoinButton();
	}

}
