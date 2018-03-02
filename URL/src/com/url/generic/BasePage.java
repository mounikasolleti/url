package com.url.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyTitle(String eTitle)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleContains(eTitle));
			Reporter.log("title is matching"+eTitle,true);
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching"+eTitle,true);
			Assert.fail();
		}
	}
}
