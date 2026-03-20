package org.automation.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	//Browser Launch
	 public static void launchBrowser() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        
	    }
	 public static void cookiesClick() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement w=driver.findElement(By.xpath("//button[contains(text(),'Accept')]"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", w);
	 }
	 	
	    public static void url(String website) {
	        driver.get(website);
	    }

	    public static void closeBrowser() {
	    	
	        driver.quit();
	    }
	    

	   
	    public static void moveMouse(WebElement w) {
	    	Actions a=new Actions(driver);
	    	a.moveToElement(w).perform();
	    }
	    public static void arrowMove(int n) throws AWTException{
	    	Robot robot = new Robot();
	    	for(int i=1;i<=n;i++) {
	    		robot.keyPress(KeyEvent.VK_DOWN);
		    	robot.keyRelease(KeyEvent.VK_DOWN);
	    	}
	    	
	    	robot.keyPress(KeyEvent.VK_ENTER);
	    	robot.keyRelease(KeyEvent.VK_ENTER);
	    	
	    	
	    }
	    
	    public static void rightmove() throws AWTException {
	    	Robot r=new Robot();
	    	r.keyPress(KeyEvent.VK_RIGHT);
	    	r.keyPress(KeyEvent.VK_RIGHT);
	    }
	    
	     
	    

}
