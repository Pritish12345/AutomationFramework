package com.saf.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.saf.enums.ConfigProperties;
import com.saf.utils.PropertyUtils;

public final class Driver {
	
	private Driver()
	{
		
	}

	//private static WebDriver driver;
	
	public static void initDriver() throws Exception
	{
		if(Objects.isNull(DriverManager.getDriver())) {
			System.out.println("system set property");
			//driver=new ChromeDriver();
			
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
		}
	}
	public static void quitDriver()
	{
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unloadDriver();
		}
	}
}
