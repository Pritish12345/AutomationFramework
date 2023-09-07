package com.saf.testcases;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.saf.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest {
	
	private OrangeHRMTests()
	{
		
	}
	
	@Test
	public void loginLogoutTest()
	{
		String title=new OrangeHRMLoginPage()
				.enterUsername("Admin").enterPassword("admin123").clickLogin()
				.clickWelcome().clickLogout()
				.getTitle();
		
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");
	}
}
