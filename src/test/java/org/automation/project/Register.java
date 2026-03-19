package org.automation.project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebDriver driver;
	

    
    public  Register(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

 
    @FindBy(xpath = "//p[text()='Sign in']")
    WebElement signInBtn;

    @FindBy(xpath = "//a[contains(text(),'Create an account')]")
    WebElement registerLink;

    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    
    @FindBy(xpath="//label[text()='No']")
    WebElement optno;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement registerBtn;

    

    public void clickSignIn() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", signInBtn);
    }

    public void clickRegister() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        registerLink.click();
    }

    public void enterFirstName(String fname) {
        firstName.sendKeys(fname);
    }

    public void enterLastName(String lname) {
        lastName.sendKeys(lname);
    }

    public void enterEmail(String mail) {
        email.sendKeys(mail);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
        
    }
    public void optionclick() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;    	
        js.executeScript("arguments[0].click();", optno);
    }
    

    public void clickRegisterBtn() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", registerBtn);
    }


}
