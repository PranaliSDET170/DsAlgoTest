@DataStructures
Feature: This feature file contain scenario for the Data Structures-Introduction module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is successfully logged in

  @DataStructuresHome
  Scenario: verify Data Structures-Introduction module homepage
    Given user is on homepage
    When user clicks on get started button in Data Structures-Introduction module
    Then user is navigated to Data Structures-Introduction homepage

  @DataStructuresTimeComplexity
  Scenario: verify Time Complexity
    Given user is on homepage
    When user clicks on get started button in Data Structures-Introduction module
    And user clicks on Time Complexity link
    Then user is navigated to Time Complexity homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
