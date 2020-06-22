# Created by rebak at 2020. 06. 22.
Feature: Rate a movie
  # Enter feature description here

  Scenario: Rate a movie
    Given Open the Chrome and start the website
    When I fill the search field
    And I click on search result
    And I rate a movie
    Then I select ten