package org.automation.project;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseClass{
	

    @Test
    public void testcase25() {
    	launchBrowser();
        url("https://www.marksandspencer.com/");
        cookiesClick();
        

        LoginPage login = new LoginPage(driver);
        login.clickSignIn();
        login.enterEmail("vinothkumar1742@gmail.com");
        login.enterPassword("Vin@1234");
        login.clickLogin();
        
        
       CartPage cp = new CartPage(driver);
       cp.enterSearch("Shirt");
       cp.pressEnter();
       cp.openSecondProduct();
//       cp.openFirstProduct();
       cp.scrolldown();
       cp.size();
       cp.addToCart();
       Assert.assertTrue(cp.isConfirmationDisplayed());
       //cp.scrollup();
       driver.navigate().back();
       driver.navigate().back();
       cp = new CartPage(driver);
       cp.openCart();
       

        Assert.assertTrue(cp.getCartItemCount() >= 2);
    }


}
