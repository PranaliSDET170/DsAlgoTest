@Queue
Feature: This feature file contain scenario for the Queue module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And cicks on login button
    Then user is successfully logged in

  @Queue
  Scenario: verify queue module homepage
    Given user is on homepage
    When user clicks on get started button in queue module
    Then user is navigated to queue homepage
