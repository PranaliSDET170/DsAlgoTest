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

  @ArrayInPython
  Scenario: verify Array In Python
    Given user is on homepage
    When user clicks on get started button in Array module
    Then user is navigated to Array homepage
    And user clicks on Arrays in Python link
    Then user is navigated to Arrays in Python homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @ArraysUsingList
  Scenario: verify Arrays Using List
    Given user is on homepage
    When user clicks on get started button in Array module
    Then user is navigated to Array homepage
    And user clicks on Arrays Using List link
    Then user is navigated to Arrays Using List homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @BasicOperationsinLists
  Scenario: verify Basic Operations in Lists
    Given user is on homepage
    When user clicks on get started button in Array module
    Then user is navigated to Array homepage
    And user clicks on Basic Operations in Lists link
    Then user is navigated to Basic Operations in Lists homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @ApplicationsofArray
  Scenario: verify Applications of Array
    Given user is on homepage
    When user clicks on get started button in Array module
    Then user is navigated to Array homepage
    And user clicks on Applications of Array link
    Then user is navigated to Applications of Array homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
