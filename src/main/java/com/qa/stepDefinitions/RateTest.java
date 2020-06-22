package com.qa.stepDefinitions;

import com.qa.pages.MainNavBar;
import com.qa.pages.SearchPage;
import com.qa.pages.SignInPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RateTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private SignInPage signInPage = new SignInPage();
    private SearchPage searchPage = new SearchPage();

    @BeforeEach
    public void setup(){
        mainNavBar.navigate();
    }

    @Test
    public void rateAMovie(){
        mainNavBar.searchAMovie();
        searchPage.clickOnSearchResult();
        searchPage.rateAMovie();
        searchPage.select10();
        Assertions.assertTrue(searchPage.checkSignInText());
    }

}
