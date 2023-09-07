package com.saf.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.saf.driver.DriverManager;

public final class LoginPageTest extends BaseTest {
	
	private LoginPageTest()
	{
		
	}
	
	
	@Test
	public void test2()
	{
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	}

}
