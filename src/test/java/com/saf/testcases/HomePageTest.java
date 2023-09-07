package com.saf.testcases;

import java.util.List;
import java.util.Objects;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saf.driver.DriverManager;

public final class HomePageTest extends BaseTest {
	
	private HomePageTest()
	{
		
	}
	
	@Test
	public void test3()
	{
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
		String title = DriverManager.getDriver().getTitle();
		
		Assertions.assertThat(title)
		.as("Object is actually null").isNotNull()
		.as("Size is not between 1 to 50").hasSizeBetween(1, 50);
		
		Assert.assertTrue(Objects.nonNull(title));
		//Assert.assertTrue(title.toLowerCase().contains("Automation"));
		//Assert.assertTrue(title.toLowerCase().matches("\\w.*"+"Automation"));   //"\\w.{3}"  //[a-zA-Z0-9]
		Assert.assertTrue(title.length()>5);
		Assert.assertTrue(title.length()<100);
		List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3/span"));
		
		//Assert.assertEquals(elements.size(), 10);
		
		boolean isElementPresent=false;
		for(WebElement element:elements)
		{
			if(element.getText().equalsIgnoreCase("Automation"))
			{
				isElementPresent=true;
				break;
			}
		}
		//Assert.assertTrue(isElementPresent,"Automation");
	}
}
