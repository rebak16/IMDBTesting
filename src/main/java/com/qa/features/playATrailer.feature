# Created by rebak at 2020. 06. 22.
Feature: Play a trailer
  # Enter feature description here

  Scenario: Play a trailer
    Given Open the Chrome and start the website
    When I fill the search field
    And I click on search result
    And I play a trailer
    Then I check the trailer's text