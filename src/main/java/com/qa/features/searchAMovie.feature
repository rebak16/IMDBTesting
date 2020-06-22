# Created by rebak at 2020. 06. 22.
Feature: Search a movie
  # Enter feature description here

  Scenario: Search a movie
    Given Open the Chrome and start the website
    When I fill the search field
    Then I check search result