package com.saf.constants;

import java.time.Duration;

public final class FrameworkConstants {
	
	private FrameworkConstants()
	{
		
	}
	
	private static final String RESOURCESPATH=System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCESPATH+"/executables/chromedriver.exe";
	private final static String CONFIGFILEPATH= RESOURCESPATH+"/config/config.properties";
	private static final Duration EXPLICITWAIT = Duration.ofSeconds(10);
	
	public static Duration getExplicitWait()
	{
		return EXPLICITWAIT;
	}
	public static String getConfigFilePath()
	{
		return CONFIGFILEPATH;
	}
	public static String getChromeDriverPath()
	{
		return CHROMEDRIVERPATH;
	}
}
