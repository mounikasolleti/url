package com.url.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest implements AutoConstant 
{ 
	public static WebDriver driver=null;
	@BeforeTest
	public void preCondition() throws IOException
	{
		
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(urly);
	}
	
	@AfterTest
	public void postConditions()
	{
		driver.close();
	}
}
