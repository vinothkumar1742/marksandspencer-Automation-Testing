package org.automation.project;

import org.testng.annotations.Test;

public class RegisterTest extends BaseClass {
//	 @Test
//	    public void testCase1()  {
//
//	        launchBrowser();
//	        url("https://www.marksandspencer.com/");
//	        cookiesClick();
//	        Register reg = new Register(driver);
//
//	        reg.clickSignIn();
//	        reg.clickRegister();
//
//	        reg.enterFirstName("John");
//	        reg.enterLastName("Doe");
//	        reg.enterEmail("john123@gmail.com");
//	        reg.enterPassword("Password@123");
//
//	        reg.clickRegisterBtn();
//
//	 }
	 
	 @Test
	    public void testCase4()  {

	        launchBrowser();
	        url("https://www.marksandspencer.com/");
	        //cookiesClick();
	        Register reg = new Register(driver);

	        reg.clickSignIn();
	        reg.clickRegister();

	        reg.enterFirstName(" ");
	        reg.enterLastName(" ");
	        reg.enterEmail(" ");
	        reg.enterPassword(" ");

	        reg.clickRegisterBtn();

	 }
}