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

  @ImplQueueInPython
  Scenario: verify Implementation of Queue in Python
    Given user is on homepage
    When user clicks on get started button in queue module
    And user clicks on Implementation of Queue in Python link
    Then user is navigated to Implementation of Queue in Python homepage

  @ImplQueueInPython-TryEditor
  Scenario: verify Implementation of Queue in Python - Try Editor
    Given user is on homepage
    When user clicks on get started button in queue module
    And user clicks on Implementation of Queue in Python link
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    #Then user is able to see the output in the console
    
