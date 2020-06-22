# Created by rebak at 2020. 06. 22.
Feature: Sign in
  # Enter feature description here

  Scenario: Sign in
    Given Open the Chrome and start the website
    When I click on the Sign In button
    And I click on the Sign In with IMDB button
    And I fill the username field
    And I fill the password field
    And I click on the Sign In button below
    Then I logged in