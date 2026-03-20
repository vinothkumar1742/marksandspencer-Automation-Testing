package org.automation.project;
import org.testng.annotations.Test;

public class SearchTest extends BaseClass{
	 @Test
	    public void testcase8() {
	        launchBrowser();
	        url("https://www.marksandspencer.com/");
			cookiesClick();
	        SearchPage sp = new SearchPage(driver);
	        sp.enterSearch("Shirt");
	        sp.pressEnter();   
	        
	    }

	     
	    @Test
	    public void testcase9() {
	        launchBrowser();
	        url("https://www.marksandspencer.com/");
			cookiesClick();
	        SearchPage sp = new SearchPage(driver);
	        sp.enterSearch("abcdxyz");
	        sp.pressEnter();

	        
	    }


	    @Test
	    public void testcase10() {
	        launchBrowser();
	        url("https://www.marksandspencer.com/");
	        cookiesClick();
	        SearchPage sp = new SearchPage(driver);
	       
	        sp.enterSearch("Shir");   
	    }

	    
	    @Test
	    public void testcase11() {
	        launchBrowser();
	        url("https://www.marksandspencer.com/");
			cookiesClick();
	        SearchPage sp = new SearchPage(driver);
	        sp.enterSearch("Jeans");
			
	        sp.pressEnter();
	        
    }

	 
	    @Test
	    public void testcase12() {
	        launchBrowser();
	        url("https://www.marksandspencer.com/");
	        cookiesClick();
	        SearchPage sp = new SearchPage(driver);
	        sp.pressEnter();  

	        
	    }

	    
	    @Test
	    public void testcase13() {
	        launchBrowser();
	        url("https://www.marksandspencer.com/");
			cookiesClick();
	        SearchPage sp = new SearchPage(driver);
	        sp.enterSearch("Shir");
	        sp.pressEnter();



	    }

	    
	    @Test
	    public void testcase14() {
	        launchBrowser();
	        url("https://www.marksandspencer.com/");
			cookiesClick();
	        SearchPage sp = new SearchPage(driver);

	        sp.enterSearch("Shirt,Jacket");
	        sp.pressEnter();
   }

}
	    
