package com.qa.stepDefinitions;

import com.qa.pages.MainNavBar;
import com.qa.pages.SearchPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayATrailerTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private SearchPage searchPage = new SearchPage();

    @When("^I play a trailer$")
    public void i_play_a_trailer() {
        searchPage.playTrailer();
    }

    @Then("^I check the trailer's text$")
    public void i_check_the_trailer_s_text() {
        Assertions.assertTrue(searchPage.checkTrailerText());
    }
}
