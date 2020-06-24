# Created by rebak at 2020. 06. 24.
Feature: Check list
  # Enter feature description here

  Scenario: Check list
    Given Open the Chrome and start the website
    When I click on the Sign In button
    And I click on the Sign In with IMDB button
    And I fill the username field
    And I fill the password field
    And I click on the Sign In button below
    And I logged in
    And I click on user button at top right
    And I click on your lists
    And I click on megunhatatlan
    Then I check a movie