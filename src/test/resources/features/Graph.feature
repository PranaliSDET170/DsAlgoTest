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

  @GraphLink
  Scenario: verify Graph
    Given user is on homepage
    When user clicks on get started button in Graph module
    Then user is navigated to Graph homepage
    And user clicks on Graph link
    Then user is navigated to Graph homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @GraphRepresentations
  Scenario: verify Graph Representations
    Given user is on homepage
    When user clicks on get started button in Graph module
    Then user is navigated to Graph homepage
    And user clicks on Graph Representations link
    Then user is navigated to Graph Representations homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
