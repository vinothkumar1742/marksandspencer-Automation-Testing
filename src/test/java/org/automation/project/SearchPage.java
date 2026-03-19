package org.automation.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Search box
    @FindBy(id = "searchId")
    WebElement searchBox;
   

//    // Search suggestions
//    @FindBy(xpath = "//ul[contains(@class,'suggest')]")
//    WebElement suggestions;
//
//    // No result message
//    @FindBy(xpath = "//*[contains(text(),'no results') or contains(text(),'cannot find')]")
//    WebElement noResultsMsg;
//
   
    
    public void enterSearch(String text) {
        searchBox.clear();
        searchBox.sendKeys(text);
        searchBox.click(); 
    }

    public void pressEnter() {
        searchBox.sendKeys(Keys.ENTER);
    }
    
    

//    public boolean isSuggestionsDisplayed() {
//        return suggestions.isDisplayed();
//    }
//
//    public boolean isNoResultDisplayed() {
//        return noResultsMsg.isDisplayed();
//    }
//
//    public boolean isProductDisplayed() {
//        return productResults.isDisplayed();
//    }
}


