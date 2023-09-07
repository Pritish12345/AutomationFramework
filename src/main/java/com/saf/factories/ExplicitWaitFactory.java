package com.saf.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.saf.constants.FrameworkConstants;
import com.saf.driver.DriverManager;
import com.saf.enums.WaitStrategy;

public class ExplicitWaitFactory {

	public static WebElement performExplicitWait(WaitStrategy waitStrategy,By by)
	{
		WebElement element=null;
		if(waitStrategy==WaitStrategy.CLICKABLE)
		{
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
			.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitStrategy==WaitStrategy.PRESENCE)
		{
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
			.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitStrategy==WaitStrategy.VISIBLE)
		{
			element = new WebDriverWait(DriverManager.getDriver(),FrameworkConstants.getExplicitWait())
			.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(waitStrategy==WaitStrategy.NONE)
		{
			element = DriverManager.getDriver().findElement(by);
			//System.out.println("Not doing anything");
		}
		return element;
	}
}
