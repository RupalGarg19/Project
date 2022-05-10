package com.ndtv.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ndtv.qa.base.TestBase;


public class Pin_Your_City_Page extends TestBase{
	
	@FindBy(id="searchBox")
	WebElement searchBox1;
//	static String cityName= TestUtil.cityName;
	@FindBy(id="Aligarh")
	WebElement checkatr;
	@FindBy(xpath="//*[@id=\"map_canvas\"]/div[1]/div[4]/div[12]/div/div[1]/span[2]")
	WebElement cityclick;
	
	public Pin_Your_City_Page() {
		PageFactory.initElements(driver, this);
	}

	public String validate_Pin_Your_City_Page_Title() {
		return driver.getTitle();
	}
	
	public Get_Weather_Page enterCity() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchBox1.sendKeys("Aligarh");
		checkatr.click();
		cityclick.click();
		return new Get_Weather_Page();
	}

}
