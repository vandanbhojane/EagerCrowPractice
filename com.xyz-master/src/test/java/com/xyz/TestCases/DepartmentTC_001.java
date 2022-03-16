package com.xyz.TestCases;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.xyz.PageObject.DepartmentsPage;

import Keywords.Constants;
import Keywords.Keywords;

public class DepartmentTC_001 {
	@SuppressWarnings("deprecation")
	@Test
	public static void clickOnDepartmentMethod() throws InterruptedException, AWTException {		
		DepartmentsPage dp = new DepartmentsPage(Constants.getDriver());
		Thread.sleep(5000);
		dp.clickOnDepartment();
		int actual = 9;
		Keywords.logger.info("Successfully open Department ");
		@SuppressWarnings("rawtypes")
		List list = Constants.getDriver().findElements(By.xpath("//div[@class='m-l-r-auto']/div[@class='filterDiv show']"));
		int expected = list.size();
		Assert.assertEquals(expected, actual);
		Keywords.logger.info("Department matched");
		Thread.sleep(3000);
		dp.clickonBedDepartment();
		Keywords.logger.info("Successfully click on Bed/cot Department");
		Thread.sleep(5000);
		Actions act=new Actions(Constants.getDriver());
		act.moveToElement(dp.clickonProduct()).build().perform();
		WebDriverWait wait=new WebDriverWait(Constants.getDriver(),10);
		WebElement element=Constants.getDriver().findElement(By.xpath("//div[@class='row']/div[1]/div[1]/div[1]/div[@class='block2-overlay trans-0-4'][1]/div[1]/button[contains(text(),'View Details')]"));
		wait.pollingEvery(5,TimeUnit.SECONDS).until(ExpectedConditions.visibilityOf(element));
		dp.clickOnViewDetail();
		Keywords.logger.info("Display the Product Details");

	}

}
