package com.saf.pages;

import org.openqa.selenium.By;

import com.saf.enums.WaitStrategy;

public final class OrangeHRMHomePage extends BasePage {

	private final By linkWelcome=By.xpath("//*[@class='oxd-userdropdown-tab']");
	private final By linkLogout=By.xpath("//a[text()='Logout']");
	
	public OrangeHRMHomePage clickWelcome()
	{
		//Uninterruptibles.sleepUninterruptibly(3,TimeUnit.SECONDS);
		click(linkWelcome, WaitStrategy.CLICKABLE);
		//DriverManager.getDriver().findElement(linkWelcome).click();
		return this;
	}
	public OrangeHRMLoginPage clickLogout()
	{
		//Uninterruptibles.sleepUninterruptibly(3,TimeUnit.SECONDS);
		//new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5))
		//	.until(ExpectedConditions.elementToBeClickable(linkLogout));
		click(linkLogout, WaitStrategy.CLICKABLE);
		//DriverManager.getDriver().findElement(linkLogout).click();
		return new OrangeHRMLoginPage();
	}
}
