# Created by rebak at 2020. 06. 22.
Feature: Click on image
  # Enter feature description here

  Scenario: Click on image
    Given Open the Chrome and start the website
    When I fill the search field
    And I click on search result
    And I click on image
    Then I check the image is displayed