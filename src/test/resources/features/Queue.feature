@Queue
Feature: This feature file contain scenario for the Queue module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And cicks on login button
    Then user is navigated to homepage

  @Queue
  Scenario: verify Queue module homepage
    Given user is on homepage
    When user clicks on get started button
    Then user is navigated to Queue homepage
