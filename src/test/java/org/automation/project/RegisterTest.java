package org.automation.project;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class RegisterTest extends BaseClass {
	 @Test
	    public void testCase1() throws AWTException   {

	        launchBrowser();
	        url("https://www.marksandspencer.com/");
	        cookiesClick();
	        Register reg = new Register(driver);

	        reg.clickSignIn();
	        reg.clickRegister();

	        reg.enterFirstName("John");
	        reg.enterLastName("Doe");
	        reg.enterEmail("tosib96866@soco7.com");
	        reg.enterPassword("Password@123");
	        reg.optionclick();
	        rightmove();

	        reg.clickRegisterBtn();
	        reg.clickLaterBtn();
	        
	 }
	 
	 @Test
	    public void testCase2() throws AWTException   {

	        launchBrowser();
	        url("https://www.marksandspencer.com/");
	        cookiesClick();
	        Register reg = new Register(driver);

	        reg.clickSignIn();
	        reg.clickRegister();

	        reg.enterFirstName("vinoth");
	        reg.enterLastName("kumar");
	        reg.enterEmail("vinothkumar@gmail.com");
	        reg.enterPassword("Vin@1234");
	        reg.optionclick();
	        rightmove();

	        reg.clickRegisterBtn();
	        
	 }
	 
	 @Test
	    public void testCase3() throws AWTException   {

	        launchBrowser();
	        url("https://www.marksandspencer.com/");
	        cookiesClick();
	        Register reg = new Register(driver);

	        reg.clickSignIn();
	        reg.clickRegister();

	        reg.enterFirstName("abc");
	        reg.enterLastName("def");
	        reg.enterEmail("");
	        reg.enterPassword("Abc@1234");
	        reg.optionclick();
	        rightmove();

	        reg.clickRegisterBtn();
	        
	 }
	 
	 @Test
	    public void testCase4() throws AWTException  {

	        launchBrowser();
	        url("https://www.marksandspencer.com/");
	        cookiesClick();
	        Register reg = new Register(driver);

	        reg.clickSignIn();
	        reg.clickRegister();

	        reg.enterFirstName(" ");
	        reg.enterLastName(" ");
	        reg.enterEmail(" ");
	        reg.enterPassword(" ");
	        reg.optionclick();
     		rightmove();

	        reg.clickRegisterBtn();
	        
	 }
}