package com.mt.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	
	
	 static public WebDriver driver;
	
	public static WebDriver openbrowser(String browsername,String urlname)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver.exe");
			   driver= new ChromeDriver();
			
			
		}
		else
		{
			
			System.setProperty("webdriver.gecko.driver","F:\\cjc\\core\\TestNg\\exefileforfirefox\\geckodriver.exe");
			  driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(urlname);
		return driver;
		
		
	}
}
