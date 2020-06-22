package com.qa.pages;

import com.qa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage extends BasePage {
    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[text()='Top Rated Movies']")
    private WebElement topRatedMovies;
    @FindBy(xpath = "//*[text()='Top Rated Shows']")
    private WebElement topRatedTVShows;

    public MenuPage() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }
}
