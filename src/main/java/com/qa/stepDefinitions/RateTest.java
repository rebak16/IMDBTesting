package com.qa.stepDefinitions;

import com.qa.pages.MainNavBar;
import com.qa.pages.SearchPage;
import com.qa.pages.SignInPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RateTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private SignInPage signInPage = new SignInPage();
    private SearchPage searchPage = new SearchPage();

    @When("^I rate a movie$")
    public void i_rate_a_movie() {
        searchPage.rateAMovie();
    }

    @Then("^I select ten$")
    public void i_select_ten() {
        searchPage.select10();
    }
}
