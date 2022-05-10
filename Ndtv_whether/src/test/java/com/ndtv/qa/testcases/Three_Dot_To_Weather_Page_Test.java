package com.ndtv.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.ndtv.qa.base.TestBase;
import com.ndtv.qa.pages.Three_Dot_To_Weather_Page;

public class Three_Dot_To_Weather_Page_Test extends TestBase {
	
	Three_Dot_To_Weather_Page three_Dot_To_Weather_Page;
	public Three_Dot_To_Weather_Page_Test() {
		super();
	}
	@BeforeTest
	public void setup() {
		initialization();
		three_Dot_To_Weather_Page=new Three_Dot_To_Weather_Page();
	}
	@Test(priority=1)
	public void validate_Three_Dot_To_Weather_Page_Title() {
		String actual=three_Dot_To_Weather_Page.validate_Three_Dot_To_Weather_Page_Title();
		System.out.println(actual);
		Assert.assertEquals(actual,"Get Latest News, India News, Breaking News, Today's News - NDTV.com" );
	}
	@Test(priority=2)
	public void clickThreeDotWeather() {
		
		
		three_Dot_To_Weather_Page.clickThreeDotWeather();
	}
}
