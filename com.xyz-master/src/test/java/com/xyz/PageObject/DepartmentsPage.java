package com.xyz.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Keywords.Constants;

public class DepartmentsPage {
	WebDriver driver = Constants.getDriver();
	
	public DepartmentsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Departments')]")
	static WebElement department;

	@FindBy(xpath = "//div[@class='m-l-r-auto']/div[@class='filterDiv show']")
	WebElement dep_list;

	@FindBy(xpath = "//div[@class='m-l-r-auto']/div[@class='filterDiv show']/a[1][@style='cursor: pointer']/img[@class='lazy']")
	WebElement bedDepartment;

	@FindBy(xpath = "//div[@class='row']/div[1]/div/div[1]/div[@class='block2-overlay trans-0-4'][1]/div")
	WebElement product;

	@FindBy(xpath = "//div[@class='row']/div[1]/div[1]/div[1]/div[@class='block2-overlay trans-0-4'][1]/div[1]/button[contains(text(),'View Details')]")
	WebElement viewDetail;

	public void clickOnDepartment() {
		department.click();

	}

	public WebElement checkDepartmentsNumber() {
		return dep_list;
	}

	public void clickonBedDepartment() {
		bedDepartment.click();
	}

	public WebElement clickonProduct() {
		return product;

	}

	public void clickOnViewDetail() {
		viewDetail.click();
	}

}
