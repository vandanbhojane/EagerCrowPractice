package com.xyz.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Keywords.Constants;


public class HomePage {

	// Page Factory
	@FindBy(xpath = "/html/body/app-root/app-header/header/div[1]/div[2]/a/img")
	WebElement EagerCrowLogo  ;
	
	@FindBy(xpath = "//button[@class='arrow-slick1 next-slick1 slick-arrow']")
	WebElement   RightArrowLink    ;
		
	@FindBy(xpath = "//button[@class='arrow-slick1 prev-slick1 slick-arrow']")
	WebElement   LeftArrowLink ;
	
	@FindBy(xpath = "//h2[@style='padding:40px 0px;color:white !important'][contains(text(),'Introducing Solid Wood Furniture')]")
	WebElement  IntroSolidWoodFurnitureText ;
	
	@FindBy(xpath = "//h2[@style='padding:40px 0px;color:white !important'][contains(text(),'Handpicked For You')]")
	WebElement HandPickedForYouText  ;

	@FindBy(xpath = "/html/body/app-root/app-main-content/div/section[3]/div/div[6]/mat-card/div/div/div/div/div/div/div[6]/div/div[1]/img")
	WebElement  ExecutiveChairLink  ;

	@FindBy(xpath = "/html/body/app-root/app-main-content/div/section[3]/div/div[6]/mat-card/div/div/div/div/div/div/div[6]/div/div[1]/div/div/button[1]")
	WebElement AddtoCartBtn ;
	
	@FindBy(xpath ="//a[@class='s-text7' and @routerlink='/Feedback']")
	WebElement FeedbackLink ;
	
	@FindBy(xpath ="//img[@alt='ICON' and @src='../../../assets/images/icons/shopping-cart (1).png']")
	WebElement CartLink   ;
		
	@FindBy(xpath = "//a[@class='s-text7'][contains(text(),'FAQs')]")
	WebElement FaqsLink;
	
	 WebDriver driver=Constants.getDriver();
	
	// initializing the Page Objects:
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	public String validateHomePage(){
		return driver.getTitle(); 
	}
	public boolean eagerCrowLogo(){
		return  EagerCrowLogo.isDisplayed();
	}
	public void clickRightArrowLink(){
		RightArrowLink.click();
	}
	public void clickLeftArrowLink(){
		LeftArrowLink.click();
	}
	public String getTextIntroSolidWoodFurnitureText(){
		return IntroSolidWoodFurnitureText.getText();
	}
	public String getHandPickedForYouText(){
		return HandPickedForYouText.getText();
	}
	public void executiveChairLink(){
		ExecutiveChairLink.click();
	}
	public void addtoCartBtn(){
		AddtoCartBtn.click();
	}
	/*public FeedBackPage feedbackLink(){
		FeedbackLink.click();
		return new FeedBackPage();
	}
	public CartPage cartLink(){
		CartLink.click();
		return new CartPage();
	}
	public FaqsPage faqsLink(){
		FaqsLink.click();
		return new FaqsPage();
	}*/
}