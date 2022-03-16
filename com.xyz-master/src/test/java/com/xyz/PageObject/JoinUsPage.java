package com.xyz.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Keywords.Constants;

public class JoinUsPage {
WebDriver driver=Constants.getDriver();
	
	public JoinUsPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Join Us')]")
	WebElement joinUs;
	
	@FindBy(xpath="//div[contains(text(),'Join Us !')]")
	WebElement joinUsButton;
	
	public void clickOnJoinUs(){
		joinUs.click();
	}
	
	public void clickOnJoinButton(){
		joinUsButton.click();
	}

}
