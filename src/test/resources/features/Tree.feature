@Tree 
Feature: This feature file contain scenario for the tree module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And cicks on login button
    Then user is successfully logged in

  @Tree
  Scenario: verify tree module homepage
    Given user is on homepage
    When user clicks on get started button in tree module
    Then user is navigated to tree homepage
