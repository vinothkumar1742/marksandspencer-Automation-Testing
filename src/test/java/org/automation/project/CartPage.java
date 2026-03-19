package org.automation.project;

//import java.time.Duration;
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
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;
    WebDriverWait wait;
   

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,(10));
       
    }
    
//    @FindBy(xpath="//a[text()='Home']")
//    WebElement home;
    
    
    @FindBy(id = "searchId")
    WebElement searchBox;

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

//    // Product name in cart
//    @FindBy(xpath = "//div[contains(@class,'bag-item')]//a")
//    WebElement productName;
//
//    // Quantity
//    @FindBy(xpath = "//select[contains(@id,'quantity')]")
//    WebElement quantityDropdown;
//
//    // Price
//    @FindBy(xpath = "//span[contains(@class,'price')]")
//    WebElement price;
//
//   
    
//
    
    public void enterSearch(String text) {
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
        searchBox.clear();
        searchBox.sendKeys(text);
        searchBox.click(); 
    }
    public void pressEnter() {
        searchBox.sendKeys(Keys.ENTER);
    }
    
    public void openFirstProduct() {
    	WebElement down = driver.findElement(By.xpath("//span[@id='productsCount']"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true);", down);
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct)).click();
    }
    public void openSecondProduct() {
    	WebElement down = driver.findElement(By.xpath("//span[@id='productsCount']"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true);", down);
        wait.until(ExpectedConditions.elementToBeClickable(secondProduct)).click();
    }
    public void scrolldown() {
    	WebElement down = driver.findElement(By.xpath("//span[text()='Size']"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true);", down);
    }
    
    public void scrollup() {
//    	WebElement up = driver.findElement(By.xpath("//span[text()='Size']"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollTo(0, 0);");
    	cross.click();
    	
    	
    }
    
    public void size() {
    	sizes.click();
    	
    }

    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToBagBtn)).click();
    }
    
    public boolean isConfirmationDisplayed() {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement msg = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//p[text()='Successfully added']")
            )
        );

        return msg.isDisplayed();
    }


    public void openCart() { 	
    	cartIcon.click();
//        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
    }

    public int getCartItemCount() {
        return cartItems.size();
    }

//    public boolean isProductDisplayedInCart() {
//        return productName.isDisplayed();
//    }
//
//    public boolean isProductDetailsCorrect() {
//        return productName.isDisplayed() &&
//               quantityDropdown.isDisplayed() &&
//               price.isDisplayed();
//    }
//
//    public void refreshPage() {
//        driver.navigate().refresh();
//    }
}


