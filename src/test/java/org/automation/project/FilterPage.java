package org.automation.project;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FilterPage {
	WebDriver driver;
	JavascriptExecutor js;
	
	  
	

    public  FilterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.js = (JavascriptExecutor) driver;
        
        
    }
    
 // Search box
    @FindBy(id = "searchId")
    WebElement searchBox;
    
    @FindBy(xpath = "//button[text()='All Filters']")
    WebElement filterBtn;

    @FindBy(xpath = "//span[text()='Price']")
    WebElement priceFilter;
    
    //price slider
    @FindBy(xpath = "(//input[@type='range'])[1]")
    WebElement minSlider;

    @FindBy(xpath = "(//input[@type='range'])[2]")
    WebElement maxSlider;

  
    @FindBy(xpath = "//span[text()='Size']")
    WebElement sizeFilter;
    
    @FindBy(xpath = "//label[text()='6']")
    WebElement chooseSize;
    
    @FindBy(xpath="//button[text()='View Items']")
    WebElement viewItems;

    @FindBy(xpath = "//label[contains(.,'Women')]")
    WebElement categoryFilter;

    @FindBy(xpath = "//label[contains(.,'M&S')]")
    WebElement brandFilter;
 
    
    @FindBy(xpath = "//select[@id='sortBy']")
    WebElement sort;

    
    @FindBy(xpath = "//div[contains(@class,'product')]")
    List<WebElement> products;

    public void enterSearch(String text) {
        searchBox.clear();
        searchBox.sendKeys(text);
        searchBox.click(); 
    }
    public void pressEnter() {
        searchBox.sendKeys(Keys.ENTER);
    }

//    public void openFilter() {
//    	js.executeScript("arguments[0].click();", filterBtn);
//    }
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

    public void applyPriceFilter() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", priceFilter);
    	
    	
    }
    
    public void setPriceRange() {
        Actions act = new Actions(driver);

        act.clickAndHold(minSlider).moveByOffset(60, 0).release().perform();
        act.clickAndHold(maxSlider).moveByOffset(-60, 0).release().perform();
    }

    public void applySizeFilter() {
    	
    	sizeFilter.click();
        chooseSize.click();
        WebElement e=driver.findElement(By.xpath("//span[text()='Size'] "));
        js.executeScript("arguments[0].scrollIntoView(true)", e );
        js.executeScript("arguments[0].click();", viewItems);
        
    }
    


    public void applyCategoryFilter() {
        categoryFilter.click();
    }

    public void applyBrandFilter() {
        brandFilter.click();
    }

    public void sortby() {
        sort.click();
        
    }

   
    public boolean isProductsDisplayed() {
        return products.size() > 0;
    }

	
}
