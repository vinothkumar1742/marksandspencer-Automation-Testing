package org.automation.project;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTest extends BaseClass {


	@Test
    public void testCase16() {
        launchBrowser();
        url("https://www.marksandspencer.com/");
        cookiesClick();
        FilterPage fp = new FilterPage(driver);
        fp.enterSearch("Shirt");
        fp.pressEnter();
        fp.openFilter();
        fp.applySizeFilter();
        closeBrowser();
        
    }
	
	 
	
    @Test
    public void testCase19() throws AWTException {
        launchBrowser();
        url("https://www.marksandspencer.com/");
        cookiesClick();
        FilterPage fp = new FilterPage(driver);
        fp.enterSearch("Shirt");
        fp.pressEnter();
        fp.sortby();
        arrowMove(3);
        closeBrowser();
                
    }
    
 
    @Test
    public void testCase20() throws AWTException {
        launchBrowser();
        url("https://www.marksandspencer.com/");
        cookiesClick();
        FilterPage fp = new FilterPage(driver);
        fp.enterSearch("Shirt");
        fp.pressEnter();
        fp.sortby();
        arrowMove(4);
        closeBrowser();
                
    }
    
    @Test
    public void testCase21() throws AWTException {
        launchBrowser();
        url("https://www.marksandspencer.com/");
        cookiesClick();
        FilterPage fp = new FilterPage(driver);
        fp.enterSearch("Shirt");
        fp.pressEnter();
        fp.sortby();
        arrowMove(1);
        Assert.assertTrue(fp.isProductsDisplayed());  
        closeBrowser();
    }


	
}
