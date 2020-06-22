# Created by rebak at 2020. 06. 22.
Feature: Advanced search
  # Enter feature description here

  Scenario Outline: Advanced search
    Given Open the Chrome and start the website
    When I click on the Sign In button
    And I click on the Sign In with IMDB button
    And I fill the username field
    And I fill the password field
    And I click on the Sign In button below
    And I logged in
    And I click on all next to the search field
    And I click on Advanced search
    And I click on Advanced title search
    And I select film and movie
    And I fill release date min "<releaseDateMinPar>" and max "<releaseDateMaxPar>"
    And I set user rating min "<minRatingPar>"
    And I set user rating max "<maxRatingPar>"
    And I fill min votes "<votingNumberMinPar>" and max votes "<votingNumberMaxPar>"
    And I select countries
    And I deselect already rated movies
    And I select My Watchlist and Megunhatatlan
    And I set title per page
    And I set sorting
    Then I click on search button

    Examples:
      | releaseDateMinPar | releaseDateMaxPar | minRatingPar | maxRatingPar | votingNumberMinPar | votingNumberMaxPar |
      | 1970              | 2021              | 7.0          | 10           | 100000             | 60000000           |
      | 1910              | 1969              | 8.0          | 10           | 200000             | 60000000           |