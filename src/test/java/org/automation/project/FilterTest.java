package org.automation.project;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTest extends BaseClass {
//	@Test
//    public void testCase15() {
//        launchBrowser();
//        url("https://www.marksandspencer.com/");
//        cookiesClick();
//        FilterPage fp = new FilterPage(driver);
//        fp.enterSearch("Shirt");
//        fp.pressEnter();
//        fp.openFilter();
//        fp.applyPriceFilter();
//        fp.setPriceRange();
//
////        Assert.assertTrue(fp.isProductsDisplayed());
//
//    }
	
//	
//	@Test
//    public void testCase16() {
//        launchBrowser();
//        url("https://www.marksandspencer.com/");
//        //cookiesClick();
//        FilterPage fp = new FilterPage(driver);
//        fp.enterSearch("Shirt");
//        fp.pressEnter();
//        fp.openFilter();
//        fp.applySizeFilter();
//
//        
//    }
	

// 
//    @Test
//    public void testCase17() {
//        launchBrowser();
//        url("https://www.marksandspencer.com/");
//
//        FilterPage fp = new FilterPage(driver);
//        fp.openFilter();
//        fp.applyCategoryFilter();
//
//        Assert.assertTrue(fp.isProductsDisplayed());
//        closeBrowser();
//    }
//
//    
//    @Test
//    public void testCase18() {
//        launchBrowser();
//        url("https://www.marksandspencer.com/");
//
//        FilterPage fp = new FilterPage(driver);
//        fp.openFilter();
//        fp.applyBrandFilter();
//
//        Assert.assertTrue(fp.isProductsDisplayed());
//        closeBrowser();
//    }
//	
	 
    @Test
    public void testCase19() throws AWTException {
        launchBrowser();
        url("https://www.marksandspencer.com/");
        waits();
        //cookiesClick();
        FilterPage fp = new FilterPage(driver);
        fp.enterSearch("Shirt");
        fp.pressEnter();
        fp.sortby();
        arrowMove(3);
                
    }
    
 
    @Test
    public void testCase20() throws AWTException {
        launchBrowser();
        url("https://www.marksandspencer.com/");
        waits();
        //cookiesClick();
        FilterPage fp = new FilterPage(driver);
        fp.enterSearch("Shirt");
        fp.pressEnter();
        fp.sortby();
        arrowMove(4);
                
    }
    
    @Test
    public void testCase21() throws AWTException {
        launchBrowser();
        url("https://www.marksandspencer.com/");
        waits();
        //cookiesClick();
        FilterPage fp = new FilterPage(driver);
        fp.enterSearch("Shirt");
        fp.pressEnter();
        fp.sortby();
        arrowMove(1);
        Assert.assertTrue(fp.isProductsDisplayed());      
    }


	
}
