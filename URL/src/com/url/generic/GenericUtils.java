package com.url.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	
		public static void SelectDateType(WebElement dropdowntype) 
		{
			Select sel=new Select(dropdowntype);
			sel.selectByValue("2");
		}
	

}
