package com.ndtv.qa.pages;
 

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import com.ndtv.qa.base.TestBase;
 
public class Three_Dot_To_Weather_Page extends TestBase{
    @FindBy(xpath="//*[@id=\'h_sub_menu\']")
    WebElement threeDot;
 
    
    @FindBy(xpath="//*[@id=\'__cricketsubscribe\']/div[2]/div[2]/a[1]")
    WebElement noThanks;
    public Three_Dot_To_Weather_Page() {
        PageFactory.initElements(driver, this);
    }
 
    public String validate_Three_Dot_To_Weather_Page_Title() {
        return driver.getTitle();  
    }
    
    public void threeDot_click() {
		List<WebElement> option=driver.findElements(By.xpath("//*[@id='subnav']//div/descendant::a[@href='https://social.ndtv.com/static/Weather/report/?pfrom=home-ndtv_topsubnavigation']"));
		System.out.println(option.size());
		
		for(int i=0;i<option.size();i++) {
			if(option.get(i).getText().contains("WEATHER")) {
				option.get(i).click();
			}
		}
	}
    
    public Pin_Your_City_Page clickThreeDotWeather() {
    	noThanks.click();
    	WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(threeDot));
        threeDot.click();
        
     
        this.threeDot_click();
       
        return new Pin_Your_City_Page();
    }
}
