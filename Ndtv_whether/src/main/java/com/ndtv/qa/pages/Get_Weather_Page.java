package com.ndtv.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ndtv.qa.base.TestBase;

public class Get_Weather_Page extends TestBase {
	@FindBy(xpath="//*[@id=\"map_canvas\"]/div[1]/div[4]/div[12]/div/div[1]/span[1]")
	WebElement getTemp;
	public Get_Weather_Page() {
		PageFactory.initElements(driver, this);
	}

	public String validate_Get_Weather_Page_Title() {
		return driver.getTitle();
	}
	
	public EndPage getTemprature() {
		System.out.println(getTemp.getText().substring(0,2));
		return new EndPage();
	}
}
