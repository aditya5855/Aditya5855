package com.mt.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mt.pages.RegisterPage;
import com.mt.utility.Common;

public class RegisterTest {
	
	public WebDriver driver;
	
	@Test
	public void register() throws IOException, InterruptedException
	{
		WebDriver driver=Common.openbrowser("chrome","http://demo.guru99.com/test/newtours/index.php");
		 Boolean button=driver.findElement(By.xpath("//a[contains(text(),\"REGISTER\")]")).isDisplayed();
		  Assert.assertTrue(button);
		  driver.findElement(By.xpath("//a[contains(text(),\"REGISTER\")]")).click();
		  
		  RegisterPage reg= PageFactory.initElements(driver, RegisterPage.class);
		  reg.registercheck();
		    reg.user2();
		    reg.user3();
		    reg.user4();
		    reg.user5();
		 
	}

}
