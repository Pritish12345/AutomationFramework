package com.saf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.saf.constants.FrameworkConstants;
import com.saf.driver.DriverManager;
import com.saf.enums.WaitStrategy;
import com.saf.factories.ExplicitWaitFactory;

public class BasePage {
	
	protected void click(By by, WaitStrategy waitStrategy)
	{
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();		
		//DriverManager.getDriver().findElement(by).click();
	}
	protected void sendKeys(By by,String value, WaitStrategy waitStrategy)
	{
		ExplicitWaitFactory.performExplicitWait(waitStrategy, by).sendKeys(value);
		//DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	protected String getPageTitle()
	{
		return DriverManager.getDriver().getTitle();
	}
	/*
	 * private void explicitlyWaitForElementToBeClickable(By by) { new
	 * WebDriverWait(DriverManager.getDriver(),
	 * FrameworkConstants.getExplicitWait())
	 * .until(ExpectedConditions.elementToBeClickable(by)); } private void
	 * explicitlyWaitForElementToBePresent(By by) { new
	 * WebDriverWait(DriverManager.getDriver(),
	 * FrameworkConstants.getExplicitWait())
	 * .until(ExpectedConditions.presenceOfElementLocated(by)); }
	 */
}
