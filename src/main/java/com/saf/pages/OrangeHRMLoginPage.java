package com.saf.pages;

import org.openqa.selenium.By;

import com.saf.enums.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage {

	private final By textboxUsername=By.xpath("//input[@name='username']");
	private final By textboxPassword=By.xpath("//input[@name='password']");
	private final By buttonLogin=By.xpath("//button[@type='submit']");
	
	public OrangeHRMLoginPage enterUsername(String username)
	{
		//Uninterruptibles.sleepUninterruptibly(3,TimeUnit.SECONDS);
		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE);
		//DriverManager.getDriver().findElement(textboxUsername).sendKeys(username);
		return this;
	}
	public OrangeHRMLoginPage enterPassword(String password)
	{
		sendKeys(textboxPassword, password, WaitStrategy.PRESENCE);
		//DriverManager.getDriver().findElement(textboxPassword).sendKeys(password);
		return this;
	}
	public OrangeHRMHomePage clickLogin()
	{
		click(buttonLogin, WaitStrategy.CLICKABLE);
		//DriverManager.getDriver().findElement(buttonLogin).click();
		return new OrangeHRMHomePage();
	}
	public String getTitle()
	{
		return getPageTitle();
	}
}
