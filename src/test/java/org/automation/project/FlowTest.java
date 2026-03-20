package org.automation.project;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlowTest extends BaseClass {
//	@Test
//    public void testCase1() throws AWTException   {
//
//        launchBrowser();
//        url("https://www.marksandspencer.com/");
//        cookiesClick();
//        Register reg = new Register(driver);
//
//        reg.clickSignIn();
//        reg.clickRegister();
//
//        reg.enterFirstName("John");
//        reg.enterLastName("Doe");
//        reg.enterEmail("tosib96866@soco7.com");
//        reg.enterPassword("Password@123");
//        reg.optionclick();
//        rightmove();
//
//        reg.clickRegisterBtn();
//        reg.clickLaterBtn();
//
// }
	@BeforeClass
	public void prerequisite(){
		launchBrowser();
        url("https://www.marksandspencer.com/");
        cookiesClick();
		
	}
	@Test
    public void testCase5() throws AWTException, InterruptedException {

        
        Flow f = new Flow(driver);

        f.clickSignIn();
        f.lenterEmail("vinothkumar1742@gmail.com");
        f.lenterPassword("Vin@1234");
        f.clickLogin();
        f.enterSearch("Shirt");
        f.pressEnter();
        
        f.openFilter();
        f.applySizeFilter();
        f.closeOverlay();
        f.openSecondProduct();
        f.scrolldown();
        f.size();
        f.addToCart();
        
        Assert.assertTrue(f.isConfirmationDisplayed());
        driver.navigate().back();
        driver.navigate().back();
        f = new Flow(driver);
        f.openCart();
        
        
    }
	
	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		closeBrowser(); 
	    }
}

	
	



