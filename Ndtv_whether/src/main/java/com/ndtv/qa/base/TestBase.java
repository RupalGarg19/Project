package com.ndtv.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase  {
	
	public static WebDriver driver;
	public static Properties prop;
	static String projectPath = System.getProperty("user.dir");
		public TestBase() {
			try {
				prop=new Properties();
				FileInputStream ip=new FileInputStream(projectPath +"\\src\\main\\java\\com\\ndtv\\qa\\config\\properties");
				prop.load(ip);
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	public static void initialization() {
		String browser_Name=prop.getProperty("browser");
		if(browser_Name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
      //driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
