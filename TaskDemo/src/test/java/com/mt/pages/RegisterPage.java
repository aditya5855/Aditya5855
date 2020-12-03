package com.mt.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage {

	public WebDriver driver;
	static Logger log=Logger.getLogger(RegisterPage.class.getName());

	public RegisterPage(WebDriver driver) {
		this.driver = driver;

	}
	
	
	


	
	@FindBy(name = "firstName")
	WebElement firstname;
	
	
	
	
	@FindBy(name = "lastName")
	WebElement lastname;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(how = How.NAME, using = "userName")
	//@CacheLookup
	WebElement username;

	@FindBy(how = How.NAME, using = "address1")
	//@CacheLookup
	WebElement address1;

	@FindBy(how = How.NAME, using = "city")
	//@CacheLookup
	WebElement cit;

	@FindBy(how = How.NAME, using = "state")
	//@CacheLookup
	WebElement sta;

	@FindBy(how = How.NAME, using = "postalCode")
	//@CacheLookup
	WebElement post;

	@FindBy(how = How.NAME, using = "country")
	//@CacheLookup
	WebElement count;

	@FindBy(how = How.NAME, using = "email")
	//@CacheLookup
	WebElement mail;

	@FindBy(how = How.NAME, using = "password")
	//@CacheLookup
	WebElement pass;

	@FindBy(how = How.NAME, using = "confirmPassword")
	//@CacheLookup
	WebElement pass1;

	@FindBy(how = How.NAME, using = "submit")
	//@CacheLookup
	WebElement submitbutton;
	
	@FindBy(how = How.XPATH, using="//a[contains(text(),\"SIGN-OFF\")]")
	//@CacheLookup
     WebElement signoff;
	
	@FindBy(how =How.LINK_TEXT, using="SIGN-ON")
	//@CacheLookup
	WebElement signon;
	
	@FindBy(how = How.LINK_TEXT, using="REGISTER")
	//@CacheLookup
	WebElement register;
	
	
	

	public void registercheck() throws IOException, InterruptedException
	{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\mercuryregdata.xlsx");
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		  XSSFSheet sheet=wb.getSheet("sheet1");
		    XSSFRow row=sheet.getRow(1);
		    XSSFCell col=row.getCell(0);
		    String val=col.getStringCellValue();
		    log.info(val);
		    
		    
		    XSSFCell col1=row.getCell(1);
			 String val1=col1.getStringCellValue();
			 log.info(val1);
			 XSSFCell col2=row.getCell(2);
			 String val2=col2.getStringCellValue();
			 log.info(val2);
			 XSSFCell col3=row.getCell(3);
			 String val3=col3.getStringCellValue();
			 log.info(val3);
			 
			 
			 XSSFCell col4=row.getCell(4);
			 String val4=col4.getStringCellValue();
			 log.info(val4);
			 
			 
			 XSSFCell col5=row.getCell(5);
			 String val5=col5.getStringCellValue();
			 log.info(val5);
			 
			 XSSFCell col6=row.getCell(6);
			 String val6=col6.getStringCellValue();
			 log.info(val6);
			 
			 XSSFCell col7=row.getCell(7);
			 String val7=col7.getStringCellValue();
			 log.info(val7);
			 
			 XSSFCell col8=row.getCell(8);
			 String val8=col8.getStringCellValue();
			 log.info(val8);
			 
			 XSSFCell col9=row.getCell(9);
			 String val9=col9.getStringCellValue();
			 log.info(val9);
			 
			 XSSFCell col10=row.getCell(10);
			 String val10=col10.getStringCellValue();
			 log.info(val10);
			 
			 XSSFCell col11=row.getCell(11);
			 String val11=col11.getStringCellValue();
			 log.info(val11);
			 
		    
		    firstname.sendKeys(val);
		    lastname.sendKeys(val1);
		    phone.sendKeys(val2);
		    
		    username.sendKeys(val3);
		    address1.sendKeys(val4);
		    cit.sendKeys(val5);
		    sta.sendKeys(val6);
		    post.sendKeys(val7);
		    count.sendKeys(val8);
		    mail.sendKeys(val9);
		    pass.sendKeys(val10);
		    pass1.sendKeys(val11);
		    
		    submitbutton.click();

		   Thread.sleep(3000);   
		    Boolean button=signoff.isDisplayed();
		    Assert.assertTrue(button);
		    log.info("succesfully registered FirstUser credential");
		    signoff.click();
		    
		    Thread.sleep(2000);
		    Boolean flag=signon.isDisplayed();
		    Assert.assertTrue(true);
		    username.sendKeys(val9);
		    pass.sendKeys(val10);
		    submitbutton.click();
		    
		    boolean flag1=register.isDisplayed();
		    Assert.assertTrue(flag1);
		    log.info("Sucessfully login First-User");
		    register.click();
		   
		    
		    
		    
		
	}
	

	public void user2() throws IOException, InterruptedException {
	
		FileInputStream fs=new FileInputStream("C:\\Users\\HP\\Desktop\\mercuryregdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("sheet1");
		XSSFRow row=sheet.getRow(2);
		XSSFCell col=row.getCell(0);
		String val=col.getStringCellValue();
		log.info(val);
		
		XSSFCell col1=row.getCell(1);
		String val1=col1.getStringCellValue();
		log.info(val1);
		
		XSSFCell col2=row.getCell(2);
		String val2=col2.getStringCellValue();
		log.info(val2);
		
		XSSFCell col3=row.getCell(3);
		String val3=col3.getStringCellValue();
		log.info(val3);
		
		XSSFCell col4=row.getCell(4);
		String val4=col4.getStringCellValue();
		log.info(val4);
		
		XSSFCell col5=row.getCell(5);
		String val5=col5.getStringCellValue();
		log.info(val5);
		
		XSSFCell col6=row.getCell(6);
		String val6=col6.getStringCellValue();
		log.info(val6);
		
		XSSFCell col7=row.getCell(7);
		String val7=col7.getStringCellValue();
		log.info(val7);
		
		XSSFCell col8=row.getCell(8);
		String val8=col8.getStringCellValue();
		log.info(val8);
		
		XSSFCell col9=row.getCell(9);
		String val9=col9.getStringCellValue();
		log.info(val9);
		
		XSSFCell col10=row.getCell(10);
		String val10=col10.getStringCellValue();
		log.info(val10);
		
		XSSFCell col11=row.getCell(11);
		String val11=col11.getStringCellValue();
		log.info(val11);
//		
		
		 firstname.sendKeys(val);
		    lastname.sendKeys(val1);
		    phone.sendKeys(val2);
		  
		    username.sendKeys(val3);
		    address1.sendKeys(val4);
		    cit.sendKeys(val5);
		    sta.sendKeys(val6);
		    post.sendKeys(val7);
		    count.sendKeys(val8);
		    mail.sendKeys(val9);
		    pass.sendKeys(val10);
		    pass1.sendKeys(val11);
		    
		
		submitbutton.click();
		Thread.sleep(3000);   
	    Boolean button=signoff.isDisplayed();
	    Assert.assertTrue(button);
	    log.info("succesfully registered Second-User credential");
	    signoff.click();
	    
	    Thread.sleep(2000);
	    Boolean flag=signon.isDisplayed();
	    Assert.assertTrue(true);
	    username.sendKeys(val9);
	    pass.sendKeys(val10);
	    submitbutton.click();
	    
	    boolean flag1=register.isDisplayed();
	    Assert.assertTrue(flag1);
	    log.info("Sucessfully login Second-User");
	    register.click();
		
		
		
	}
	
	public void user3() throws IOException, InterruptedException
	{
		
		FileInputStream fs=new FileInputStream("C:\\Users\\HP\\Desktop\\mercuryregdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("sheet1");
		XSSFRow row=sheet.getRow(3);
		XSSFCell col=row.getCell(0);
		String val=col.getStringCellValue();
		log.info(val);
		
		XSSFCell col1=row.getCell(1);
		String val1=col1.getStringCellValue();
		log.info(val1);
		
		XSSFCell col2=row.getCell(2);
		String val2=col2.getStringCellValue();
		log.info(val2);
		
		XSSFCell col3=row.getCell(3);
		String val3=col3.getStringCellValue();
		log.info(val3);
		
		XSSFCell col4=row.getCell(4);
		String val4=col4.getStringCellValue();
		log.info(val4);
		
		XSSFCell col5=row.getCell(5);
		String val5=col5.getStringCellValue();
		log.info(val5);
		
		XSSFCell col6=row.getCell(6);
		String val6=col6.getStringCellValue();
		log.info(val6);
		
		XSSFCell col7=row.getCell(7);
		String val7=col7.getStringCellValue();
		log.info(val7);
		
		XSSFCell col8=row.getCell(8);
		String val8=col8.getStringCellValue();
		log.info(val8);
		
		XSSFCell col9=row.getCell(9);
		String val9=col9.getStringCellValue();
		log.info(val9);
		
		XSSFCell col10=row.getCell(10);
		String val10=col10.getStringCellValue();
		log.info(val10);
		
		XSSFCell col11=row.getCell(11);
		String val11=col11.getStringCellValue();
		log.info(val11);
		
		 firstname.sendKeys(val);
		    lastname.sendKeys(val1);
		    phone.sendKeys(val2);
		  
		    username.sendKeys(val3);
		    address1.sendKeys(val4);
		    cit.sendKeys(val5);
		    sta.sendKeys(val6);
		    post.sendKeys(val7);
		    count.sendKeys(val8);
		    mail.sendKeys(val9);
		    pass.sendKeys(val10);
		    pass1.sendKeys(val11);
		    
		    submitbutton.click();
			Thread.sleep(3000);   
		    Boolean button=signoff.isDisplayed();
		    Assert.assertTrue(button);
		    log.info("succesfully registered Third-User credential");
		    signoff.click();
		    
		    Thread.sleep(2000);
		    Boolean flag=signon.isDisplayed();
		    Assert.assertTrue(true);
		    username.sendKeys(val9);
		    pass.sendKeys(val10);
		    submitbutton.click();
		    
		    boolean flag1=register.isDisplayed();
		    Assert.assertTrue(flag1);
		    log.info("Sucessfully login Third-User");
		    register.click();
		
	}
	
	public void user4() throws IOException, InterruptedException
	{
		
		FileInputStream fs=new FileInputStream("C:\\Users\\HP\\Desktop\\mercuryregdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("sheet1");
		XSSFRow row=sheet.getRow(4);
		XSSFCell col=row.getCell(0);
		String val=col.getStringCellValue();
		log.info(val);
		
		XSSFCell col1=row.getCell(1);
		String val1=col1.getStringCellValue();
		log.info(val1);
		
		XSSFCell col2=row.getCell(2);
		String val2=col2.getStringCellValue();
		log.info(val2);
		
		XSSFCell col3=row.getCell(3);
		String val3=col3.getStringCellValue();
		log.info(val3);
		
		XSSFCell col4=row.getCell(4);
		String val4=col4.getStringCellValue();
		log.info(val4);
		
		XSSFCell col5=row.getCell(5);
		String val5=col5.getStringCellValue();
		log.info(val5);
		
		XSSFCell col6=row.getCell(6);
		String val6=col6.getStringCellValue();
		log.info(val6);
		
		XSSFCell col7=row.getCell(7);
		String val7=col7.getStringCellValue();
		log.info(val7);
		
		XSSFCell col8=row.getCell(8);
		String val8=col8.getStringCellValue();
		log.info(val8);
		
		XSSFCell col9=row.getCell(9);
		String val9=col9.getStringCellValue();
		log.info(val9);
		
		XSSFCell col10=row.getCell(10);
		String val10=col10.getStringCellValue();
		log.info(val10);
		
		XSSFCell col11=row.getCell(11);
		String val11=col11.getStringCellValue();
		log.info(val11);
		
		 firstname.sendKeys(val);
		    lastname.sendKeys(val1);
		    phone.sendKeys(val2);
		  
		    username.sendKeys(val3);
		    address1.sendKeys(val4);
		    cit.sendKeys(val5);
		    sta.sendKeys(val6);
		    post.sendKeys(val7);
		    count.sendKeys(val8);
		    mail.sendKeys(val9);
		
		    submitbutton.click();
			Thread.sleep(3000);   
		    Boolean button=signoff.isDisplayed();
		    Assert.assertTrue(button);
		    log.info("succesfully Registered Fourth-User credential");
		    signoff.click();
		    
		    Thread.sleep(2000);
		    Boolean flag=signon.isDisplayed();
		    Assert.assertTrue(true);
		    username.sendKeys(val9);
		    pass.sendKeys(val10);
		    submitbutton.click();
		    
		    boolean flag1=register.isDisplayed();
		    Assert.assertTrue(flag1);
		    log.info("Sucessfully login Fourth-User");
		    register.click();
	}
	
	public void user5() throws IOException, InterruptedException
	{

		FileInputStream fs=new FileInputStream("C:\\Users\\HP\\Desktop\\mercuryregdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("sheet1");
		XSSFRow row=sheet.getRow(5);
		XSSFCell col=row.getCell(0);
		String val=col.getStringCellValue();
		log.info(val);
		
		XSSFCell col1=row.getCell(1);
		String val1=col1.getStringCellValue();
		log.info(val1);
		
		XSSFCell col2=row.getCell(2);
		String val2=col2.getStringCellValue();
		log.info(val2);
		
		XSSFCell col3=row.getCell(3);
		String val3=col3.getStringCellValue();
		log.info(val3);
		
		XSSFCell col4=row.getCell(4);
		String val4=col4.getStringCellValue();
		log.info(val4);
		
		XSSFCell col5=row.getCell(5);
		String val5=col5.getStringCellValue();
		log.info(val5);
		
		XSSFCell col6=row.getCell(6);
		String val6=col6.getStringCellValue();
		log.info(val6);
		
		XSSFCell col7=row.getCell(7);
		String val7=col7.getStringCellValue();
		log.info(val7);
		
		XSSFCell col8=row.getCell(8);
		String val8=col8.getStringCellValue();
		log.info(val8);
		
		XSSFCell col9=row.getCell(9);
		String val9=col9.getStringCellValue();
		log.info(val9);
		
		XSSFCell col10=row.getCell(10);
		String val10=col10.getStringCellValue();
		log.info(val10);
		
		XSSFCell col11=row.getCell(11);
		String val11=col11.getStringCellValue();
		log.info(val11);
		
		 firstname.sendKeys(val);
		    lastname.sendKeys(val1);
		    phone.sendKeys(val2);
		  
		    username.sendKeys(val3);
		    address1.sendKeys(val4);
		    cit.sendKeys(val5);
		    sta.sendKeys(val6);
		    post.sendKeys(val7);
		    count.sendKeys(val8);
		    mail.sendKeys(val9);
		    
		    submitbutton.click();
			Thread.sleep(3000);   
		    Boolean button=signoff.isDisplayed();
		    Assert.assertTrue(button);
		    log.info("succesfully Registered Fifth-User credential");
		    signoff.click();
		    Thread.sleep(2000);
		    Boolean flag=signon.isDisplayed();
		    Assert.assertTrue(true);
		    username.sendKeys(val9);
		    pass.sendKeys(val10);
		    submitbutton.click();
		    
		    boolean flag1=register.isDisplayed();
		    Assert.assertTrue(flag1);
		    log.info("Sucessfully login Fifth-User");
		    
		    Thread.sleep(2000);
		    driver.close();
		 
	}
}
