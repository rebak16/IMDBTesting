package com.qa.stepDefinitions;

import com.qa.pages.MainNavBar;
import com.qa.pages.SearchPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImageTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private SearchPage searchPage = new SearchPage();

    @When("^I click on image$")
    public void i_click_on_image() {
        searchPage.clickOnImage();
    }

    @Then("^I check the image is displayed$")
    public void i_check_the_image_is_displayed() {
        Assertions.assertTrue(searchPage.checkImageIsDisplayed());
    }
}
