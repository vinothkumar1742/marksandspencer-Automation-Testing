package org.automation.project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flow {
WebDriver driver;
JavascriptExecutor js;
WebDriverWait wait;
	

    
    public  Flow(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver,(10));

    }
    
  //------------------Register--------------------------- //
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
    
    @FindBy(xpath="//input[@value='No']")
    WebElement optno;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement registerBtn;

    @FindBy(xpath="//a[contains(text(),' do this later')]")
    WebElement laterBtn;

  //------------------Login--------------------------- //
    @FindBy(xpath="//input[@id='usernameInput']")
    WebElement emailField;

    @FindBy(id = "passwordInput")
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;
    
//------------------Search--------------------------- //
    // Search box
    @FindBy(id = "searchId")
    WebElement searchBox;
    
//------------------Filter--------------------------- //
    
    @FindBy(xpath = "//button[text()='All Filters']")
    WebElement filterBtn;
    @FindBy(xpath = "//span[text()='Size']")
    WebElement sizeFilter;
    
    @FindBy(xpath = "//label[text()='6']")
    WebElement chooseSize;
    
    @FindBy(xpath="//button[text()='View Items']")
    WebElement viewItems;
    
    
  //------------------Sort--------------------------- //
    
    @FindBy(xpath = "//select[@id='sortBy']")
    WebElement sort;

    @FindBy(xpath = "//div[contains(@class,'product')]")
    List<WebElement> products;
    
    
  //------------------Cart--------------------------- //
    
    // Product click (first product)
    @FindBy(xpath = "(//a[contains(@class,'product')])[1]")
    WebElement firstProduct;
    
 // Product click (Second product)
    @FindBy(xpath = "(//a[contains(@class,'product')])[2]")
    WebElement secondProduct;
    
    @FindBy(xpath="//span[text()='16']")
    WebElement sizes;

    @FindBy(xpath = "//button[contains(.,'Add to bag')]")
    WebElement addToBagBtn;
    
    // Cart icon
    @FindBy(xpath = "//a[contains(@href,'bag')]")
    WebElement cartIcon;
    
    @FindBy(xpath="(//button[@aria-label='Close modal'])[2]")
    WebElement cross;

    // Cart items
    @FindBy(xpath = "//ul[@class='listUnstyled']")
    List<WebElement> cartItems;
    
    
    
    
  //------------------Register--------------------------- //
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
    public void optionclick()  {
    	JavascriptExecutor js = (JavascriptExecutor) driver;    	
        js.executeScript("arguments[0].click();", optno);  	
    }
    

    public void clickRegisterBtn() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", registerBtn);
    }
    public void clickLaterBtn() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true);", laterBtn);
    	js.executeScript("arguments[0].click();", laterBtn);
    	
    }

  //------------------Login--------------------------- //
    
    
    public void clickLogin() {
        loginBtn.click();
    }
    
    public void lenterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void lenterPassword(String password) {
        passwordField.sendKeys(password);
    }
    
  //------------------Search--------------------------- //
    public void enterSearch(String text) {
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        searchBox.clear();
        searchBox.sendKeys(text);
        searchBox.click(); 
    }

    public void pressEnter() {
        searchBox.sendKeys(Keys.ENTER);
    }
    
  //------------------Filter--------------------------- //
    
    public void openFilter() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement filter = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='All Filters']")
            )
        );

        ((JavascriptExecutor) driver)
            .executeScript("arguments[0].click();", filter);
    }

    
    public void applySizeFilter() {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Click Size (fresh element)
        WebElement size = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='Size']")
            )
        );
        size.click();
        
        WebElement e=driver.findElement(By.xpath("//span[text()='Size'] "));
        js.executeScript("arguments[0].scrollIntoView(true)", e );

        // Click size option
        WebElement sizeOption = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//label[text()='16']")
            )
        );
        sizeOption.click();
        js.executeScript("arguments[0].click();", viewItems);

      
        
    }

    //------------------Sort--------------------------- //
    public void sortby() {
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        sort.click();
        
    }
    public void closeOverlay() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement overlay = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'dropdown-filter_overlay')]")
            )
        );

        overlay.click();  
    }
    
    public void newArrivals() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement dropdown = wait.until(
            ExpectedConditions.elementToBeClickable(By.id("sortBy"))
        );

        Select s = new Select(dropdown);
        s.selectByVisibleText("New Arrivals");  
    }
  //------------------Cart--------------------------- //
    
    public void openFirstProduct() {
    	WebElement down = driver.findElement(By.xpath("//span[@id='productsCount']"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true);", down);
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct)).click();
    }
    public void openSecondProduct() {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement down = driver.findElement(By.xpath("//span[@id='productsCount']"));
        js.executeScript("arguments[0].scrollIntoView(true);", down);

        WebElement product = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(@class,'product')])[2]")
            )
        );

        product.click();   
    }
    public void scrolldown() {
    	WebElement down = driver.findElement(By.xpath("//span[text()='Size']"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true);", down);
    }
  
    
    public void size() {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement size = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='16']")
            )
        );

        size.click();
    }   
    public void addToCart() {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement addBtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(.,'Add to bag')]")
            )
        );

        addBtn.click();   
    }
    
    public boolean isConfirmationDisplayed() {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement msg = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Successfully added']")
            )
        );

        return msg.isDisplayed();
    }
    
    


    public void openCart() {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement cart = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href,'bag')]")
            )
        );

        js.executeScript("arguments[0].click();", cart);
    }
}