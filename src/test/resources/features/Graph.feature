@Graph
Feature: This feature file contain scenario for the Graph module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is successfully logged in

  @GraphHome
  Scenario: verify Graph module homepage
    Given user is on homepage
    When user clicks on get started button in Graph module
    Then user is navigated to Graph homepage
