package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.MainNavBar;
import com.qa.pages.SearchResultsPage;
import com.qa.pages.SignInPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WatchlistTest{

    private HomePage homePage = new HomePage();
    private MainNavBar mainNavBar = new MainNavBar();
    private SignInPage signInPage = new SignInPage();
    private SearchResultsPage searchResultsPage = new SearchResultsPage();

    @BeforeEach
    public void setup(){
        mainNavBar.navigate();
        signInPage.loginWithValidData();
    }

    @Test
    public void clickOnAddToWatchlist(){
        mainNavBar.searchAMovie();
        searchResultsPage.clickOnSearchResult();
        homePage.clickOnAddToWatchlist();
        Assertions.assertTrue(homePage.checkWatchlist());
        homePage.clickOnRemoveFromWatchlist();
    }
}
