package org.automation.project;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	 	@FindBy(xpath = "//p[text()='Sign in']")
	    WebElement signInBtn;

	    @FindBy(xpath="//input[@id='usernameInput']")
	    WebElement emailField;

	    @FindBy(id = "passwordInput")
	    WebElement passwordField;

	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement loginBtn;
	    
	    public void clickSignIn() {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("arguments[0].click();", signInBtn);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }

	    public void enterEmail(String email) {
	        emailField.sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickLogin() {
	        loginBtn.click();
	    }


}
