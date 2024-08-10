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

  @OverviewofTrees
  Scenario: verify Overview of Trees
    Given user is on homepage
    When user clicks on get started button in tree module
    And user clicks on Overview of Trees link
    Then user is on Overview of Trees homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
