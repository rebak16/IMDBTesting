package com.qa.stepDefinitions;

import com.qa.pages.MainNavBar;
import com.qa.pages.YourListsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CheckList {

    private MainNavBar mainNavBar = new MainNavBar();
    private YourListsPage yourListsPage = new YourListsPage();

    @When("^I click on user button at top right$")
    public void i_click_on_user_button_at_top_right() {
        mainNavBar.clickOnUserButton();
    }

    @When("^I click on your lists$")
    public void i_click_on_your_lists() {
        mainNavBar.clickOnYourLists();
    }

    @When("^I click on megunhatatlan$")
    public void i_click_on_megunhatatlan() {
        yourListsPage.clickOnMegunhatatlan();
    }

    @Then("^I check a movie$")
    public void i_check_a_movie() {
        Assertions.assertTrue(yourListsPage.checkMovie());
    }
}
