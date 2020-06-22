package com.qa.stepDefinitions;

import com.qa.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private SearchResultsPage searchResultsPage = new SearchResultsPage();
    private SearchPage searchPage = new SearchPage();
    private AdvancedTitleSearchPage advancedTitleSearchPage = new AdvancedTitleSearchPage();
    private SignInPage signInPage = new SignInPage();

    @Then("^I check search result$")
    public void i_check_search_result() {
        Assertions.assertTrue(searchResultsPage.getSearchResults());
    }

    @Given("^Open the Chrome and start the website$")
    public void open_the_Chrome_and_start_the_website() {
        mainNavBar.navigate();
    }

    @When("^I click on the Sign In button$")
    public void i_click_on_the_Sign_In_button() {
        signInPage.loginWithValidData();
    }

    @When("^I click on the Sign In with IMDB button$")
    public void i_click_on_the_Sign_In_with_IMDB_button() {
    }

    @When("^I fill the username field$")
    public void i_fill_the_username_field() {
    }

    @When("^I fill the password field$")
    public void i_fill_the_password_field() {
    }

    @When("^I click on the Sign In button below$")
    public void i_click_on_the_Sign_In_button_below() {
    }

    @When("^I logged in$")
    public void i_logged_in() {

    }

    @When("^I click on all next to the search field$")
    public void i_click_on_all_next_to_the_search_field() {
        mainNavBar.clickOnAll();
    }

    @When("^I click on Advanced search$")
    public void i_click_on_Advanced_search() {
        mainNavBar.clickOnAdvancedSearch();
    }

    @When("^I click on Advanced title search$")
    public void i_click_on_Advanced_title_search() {
        searchPage.clickOnAdvancedTitleSearch();
    }

    @When("^I select film and movie$")
    public void i_select_film_and_movie() {
        advancedTitleSearchPage.selectFilmAndMovie();
    }

    @When("^I fill release date min \"([^\"]*)\" and max \"([^\"]*)\"$")
    public void i_fill_release_date_min_and_max(String releaseDateMinPar, String releaseDateMaxPar) {
        advancedTitleSearchPage.fillReleaseDateMinAndMax(releaseDateMinPar, releaseDateMaxPar);
    }

    @When("^I set user rating min \"([^\"]*)\"$")
    public void i_set_user_rating_min(String minRatingPar) {
        advancedTitleSearchPage.setUserRatingMinOption(minRatingPar);
    }

    @When("^I set user rating max \"([^\"]*)\"$")
    public void i_set_user_rating_max(String maxRatingPar) {
        advancedTitleSearchPage.setUserRatingMaxOption(maxRatingPar);
    }

    @And("^I fill min votes \"([^\"]*)\" and max votes \"([^\"]*)\"$")
    public void iFillMinVotesAndMaxVotes(String votingNumberMinPar, String votingNumberMaxPar) {
        advancedTitleSearchPage.fillVotes(votingNumberMinPar, votingNumberMaxPar);
    }

    @When("^I select countries$")
    public void i_select_countries() {
        advancedTitleSearchPage.setSelectCountries();
    }

    @When("^I deselect already rated movies$")
    public void i_deselect_already_rated_movies() {
        advancedTitleSearchPage.deselectMyRatingsMovies();
    }

    @When("^I select My Watchlist and Megunhatatlan$")
    public void i_select_My_Watchlist_and_Megunhatatlan() {
        advancedTitleSearchPage.setSelectYourWatchlistAndMegunhatatlan();
    }

    @When("^I set title per page$")
    public void i_set_title_per_page() {
        advancedTitleSearchPage.setTitlePerPage();
    }

    @When("^I set sorting$")
    public void i_set_sorting() {
        advancedTitleSearchPage.setSorting();
    }

    @Then("^I click on search button$")
    public void i_click_on_search_button() {
        advancedTitleSearchPage.clickOnSearch();
    }

}
