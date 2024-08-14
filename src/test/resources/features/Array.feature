@Array
Feature: This feature file contain scenario for the module Array

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is successfully logged in

  @ArrayHome
  Scenario: verify Array module homepage
    Given user is on homepage
    When user clicks on get started button in Array module
    Then user is navigated to Array homepage
