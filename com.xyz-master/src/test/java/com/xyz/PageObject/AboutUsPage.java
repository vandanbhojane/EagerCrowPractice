package com.xyz.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Keywords.Keywords;

public class AboutUsPage {
	WebDriver driver;

	public AboutUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "About Us")
	WebElement aboutUs;

	

	public void clickAbtUs() {
		//aboutUs.click();
		Keywords.clickOperation(aboutUs);
	}

}
