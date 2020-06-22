# Created by rebak at 2020. 06. 22.
Feature: Add to watchlist
  # Enter feature description here

  Scenario: Add to watchlist
    Given Open the Chrome and start the website
    When I click on the Sign In button
    And I click on the Sign In with IMDB button
    And I fill the username field
    And I fill the password field
    And I click on the Sign In button below
    And I logged in
    And I fill the search field
    And I click on search result
    And I add to watchlist
    And I check the watchlist
    Then I remove from watchlist
