package com.ndtv.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ndtv.qa.base.TestBase;
import com.ndtv.qa.pages.Get_Weather_Page;
import com.ndtv.qa.pages.Pin_Your_City_Page;
import com.ndtv.qa.pages.Three_Dot_To_Weather_Page;

public class Get_Weather_Page_Test extends TestBase {
	Three_Dot_To_Weather_Page three_Dot_To_Weather_Page;
	Pin_Your_City_Page pin_Your_City_Page;
	Get_Weather_Page get_Weather_Page;
	public Get_Weather_Page_Test() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		three_Dot_To_Weather_Page=new Three_Dot_To_Weather_Page();
		three_Dot_To_Weather_Page.clickThreeDotWeather();
		pin_Your_City_Page=new Pin_Your_City_Page();
		pin_Your_City_Page.enterCity();
		get_Weather_Page=new Get_Weather_Page();
	}
	@Test
public void getTemprature() {
		get_Weather_Page.getTemprature();
	}
}










//xml file 
//jhansi =28
//Aligarh= 28
//mumbai= 23
