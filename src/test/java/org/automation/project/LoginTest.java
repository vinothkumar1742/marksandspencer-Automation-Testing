package org.automation.project;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
	@Test
    public void testCase5() {

        launchBrowser();
        url("https://www.marksandspencer.com/");
        cookiesClick();
        LoginPage login = new LoginPage(driver);

        login.clickSignIn();
        
        login.enterEmail("vinothkumar1742@gmail.com");
        login.enterPassword("Vin@1234");
        login.clickLogin();

        
    }
	
	@Test
    public void testCase6() {

        launchBrowser();
        url("https://www.marksandspencer.com/");
        cookiesClick();

        LoginPage login = new LoginPage(driver);

        login.clickSignIn();
        
        login.enterEmail("testuser@gmail.com");
        login.enterPassword("password123");
        login.clickLogin();

        
    }
	@Test
    public void testCase7() {

        launchBrowser();
        url("https://www.marksandspencer.com/");
        cookiesClick();
        LoginPage login = new LoginPage(driver);

        login.clickSignIn();
        
        login.enterEmail(" ");
        login.enterPassword(" ");
        login.clickLogin();

        
    }

}
