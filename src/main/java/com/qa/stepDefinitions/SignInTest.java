package com.qa.stepDefinitions;

import com.qa.pages.MainNavBar;
import com.qa.pages.SignInPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SignInTest{

    private MainNavBar mainNavBar = new MainNavBar();
    private SignInPage signInPage = new SignInPage();

    @BeforeEach
    public void setup(){
        mainNavBar.navigate();
    }

    @Test
    public void sigInTest(){
        mainNavBar.clickOnSignIn();
        signInPage.clickOnSignInWithIMDB();
        signInPage.fillEmail();
        signInPage.fillPassword();
        signInPage.clickOnSignInButton();
    }
}
