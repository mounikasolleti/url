package com.url.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.url.generic.BasePage;
import com.url.generic.GenericUtils;

public class RegisterUserPage extends BasePage
	{
		@FindBy(id="usernamereg-firstName")
		private WebElement firstName;
		@FindBy(id="usernamereg-lastName")
		private WebElement lastName;
		@FindBy(id="usernamereg-yid")
		private WebElement email;
		@FindBy(id="usernamereg-password")
		private WebElement password;
		@FindBy(id="usernamereg-phone")
		private WebElement mobile;
		@FindBy(id="usernamereg-month")
		private WebElement month;
		@FindBy(id="usernamereg-day")
		private WebElement date;
		@FindBy(id="usernamereg-year")
		private WebElement year;
		@FindBy(id="usernamereg-freeformGender")
		private WebElement gender;
		@FindBy(id="reg-submit-button")
		private WebElement clickBtn;
		@FindBy(xpath="//button[contains(.,'Text me an Account')]")
		private WebElement textKeyClick;
		@FindBy(name="verifyCode")
		private WebElement sendCode;
		//@FindBy(xpath="//a[contains(.,'Sign out')]")
		
		public RegisterUserPage(WebDriver driver) 
		{
			super(driver);
			PageFactory.initElements(driver, this);
			
		}
		public void EnterUserName()
		{
			firstName.sendKeys("Soujanya");
		}
		public void EnterLastname() 
		{
			lastName.sendKeys("Aithal");
		}
		public void EnterEmail() 
		{
			email.sendKeys("soujanya.aithal123@yahoo.com");
		}
		public void EnterPassword() 
		{
			password.sendKeys("abcd@456");
		}
		public void EnterMobile() 
		{
			mobile.sendKeys("9741054263");
		}
		public void EnterMonth() 
		{
			GenericUtils.SelectDateType(month);
		}
		public void EnterDate() 
		{
			date.sendKeys("07");
		}
		public void EnterYear() 
		{
			year.sendKeys("1993");
		}
		public void EnterGender() 
		{
			gender.sendKeys("Female");
		}
		public void ClickSubmitBtn() 
		{
			clickBtn.click();
		}
		public void ClickOnKey() 
		{
			textKeyClick.click();
		}
		public void ClickCode()
		{
			sendCode.click();
		}
	}

