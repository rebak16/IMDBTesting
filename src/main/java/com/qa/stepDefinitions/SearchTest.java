package com.qa.stepDefinitions;

import com.qa.pages.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchTest{

    private MainNavBar mainNavBar = new MainNavBar();
    private SearchResultsPage searchResultsPage = new SearchResultsPage();
    private SearchPage searchPage = new SearchPage();
    private AdvancedTitleSearchPage advancedTitleSearchPage = new AdvancedTitleSearchPage();
    private SignInPage signInPage = new SignInPage();

    @BeforeEach
    public void setup(){
        mainNavBar.navigate();
        signInPage.loginWithValidData();
    }

    @Test
    public void searchAMovie(){
        mainNavBar.searchAMovie();
        Assertions.assertTrue(searchResultsPage.getSearchResults());
    }

    public void advancedSearch(String releaseDateMinPar, String releaseDateMaxPar, String minRatingPar,
                               String maxRatingPar, String votingNumberMinPar, String votingNumberMaxPar) {
        mainNavBar.clickOnAll();
        mainNavBar.clickOnAdvancedSearch();
        searchPage.clickOnAdvancedTitleSearch();
        advancedTitleSearchPage.selectFilmAndMovie();
        advancedTitleSearchPage.fillReleaseDateMinAndMax(releaseDateMinPar, releaseDateMaxPar);
        advancedTitleSearchPage.setUserRatingMinOption(minRatingPar);
        advancedTitleSearchPage.setUserRatingMaxOption(maxRatingPar);
        advancedTitleSearchPage.fillVotes(votingNumberMinPar, votingNumberMaxPar);
        advancedTitleSearchPage.setSelectCountries();
        advancedTitleSearchPage.deselectMyRatingsMovies();
        advancedTitleSearchPage.setSelectYourWatchlistAndMegunhatatlan();
        advancedTitleSearchPage.setTitlePerPage();
        advancedTitleSearchPage.setSorting();
        advancedTitleSearchPage.clickOnSearch();
    }
}
