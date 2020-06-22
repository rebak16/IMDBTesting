package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.MainNavBar;
import com.qa.pages.SearchResultsPage;
import com.qa.pages.SignInPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WatchlistTest {

    private HomePage homePage = new HomePage();
    private MainNavBar mainNavBar = new MainNavBar();
    private SignInPage signInPage = new SignInPage();
    private SearchResultsPage searchResultsPage = new SearchResultsPage();

    @When("^I fill the search field$")
    public void i_fill_the_search_field() {
        mainNavBar.searchAMovie();
    }

    @When("^I click on search result$")
    public void i_click_on_search_result() {
        searchResultsPage.clickOnSearchResult();
    }

    @When("^I add to watchlist$")
    public void i_add_to_watchlist() {
        homePage.clickOnAddToWatchlist();
    }

    @When("^I check the watchlist$")
    public void i_check_the_watchlist() {
        Assertions.assertTrue(homePage.checkWatchlist());
    }

    @Then("^I remove from watchlist$")
    public void i_remove_from_watchlist() {
        homePage.clickOnRemoveFromWatchlist();
    }

}
