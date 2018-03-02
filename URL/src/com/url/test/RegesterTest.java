package com.url.test;

import org.testng.annotations.Test;

import com.url.generic.BaseTest;
import com.url.pom.RegenerationPage;
import com.url.pom.RegisterUserPage;

public class RegesterTest extends BaseTest
	{
		@Test
		private void Run() 
		{
			RegenerationPage regerationpage=new RegenerationPage(driver);
			regerationpage.createAccount();
			RegisterUserPage rup=new RegisterUserPage(driver);
			rup.EnterUserName();
			rup.EnterLastname();
			rup.EnterEmail();
			rup.EnterPassword();
			rup.EnterMobile();
			rup.EnterMonth();
			rup.EnterDate();
			rup.EnterYear();
			rup.EnterGender();
			rup.ClickSubmitBtn();
			rup.ClickOnKey();
			rup.ClickCode();
		}

	}

