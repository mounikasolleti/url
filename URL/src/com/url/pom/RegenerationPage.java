package com.url.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.url.generic.BasePage;

public class RegenerationPage extends BasePage
	{
		//decleartion
		@FindBy(id="createacc")
		private WebElement createAccountLink;
		
		public RegenerationPage(WebDriver driver) 
		{
			super(driver);
			PageFactory.initElements(driver, this);
			
		}
		public void createAccount()
		{
			createAccountLink.click();
		}

	}

