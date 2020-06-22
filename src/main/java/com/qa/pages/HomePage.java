package com.qa.pages;

import com.qa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[@title='Click to add to watchlist']")
    private WebElement addToWatchlist;
    @FindBy(xpath = "//*[@title='Click to remove from watchlist']")
    private WebElement removeFromWatchlist;



    public HomePage() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }

    public boolean checkWatchlist(){
        wait.until(ExpectedConditions.elementToBeClickable(removeFromWatchlist));
        return removeFromWatchlist.isDisplayed();
    }

    public void clickOnAddToWatchlist(){
        wait.until(ExpectedConditions.elementToBeClickable(addToWatchlist));
        addToWatchlist.click();
    }

    public void clickOnRemoveFromWatchlist(){
        wait.until(ExpectedConditions.elementToBeClickable(removeFromWatchlist));
        removeFromWatchlist.click();
    }
}
