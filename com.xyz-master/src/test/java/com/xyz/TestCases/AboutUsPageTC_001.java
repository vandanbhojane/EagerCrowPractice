package com.xyz.TestCases;

import org.testng.annotations.Test;

import com.xyz.PageObject.AboutUsPage;

import Keywords.Constants;

public class AboutUsPageTC_001 {

	@Test
	public static void clickOnAboutUs() throws InterruptedException {
		
		AboutUsPage ap = new AboutUsPage(Constants.getDriver());
		Thread.sleep(5000);
		ap.clickAbtUs();
	}
}
