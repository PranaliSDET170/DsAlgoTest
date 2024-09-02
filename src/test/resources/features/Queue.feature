@Queue @DsAlgo
Feature: This feature file contain scenario for the Queue module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is successfully logged in

  @QueueHome
  Scenario: verify queue module homepage
    Given user is on homepage
    When user clicks on get started button in queue module
    Then user is navigated to queue homepage

  @ImplQueueInPython
  Scenario: verify Implementation of Queue in Python
    Given user is on homepage
    When user clicks on get started button in queue module
    And user is navigated to queue homepage
    And user clicks on Queues "Implementation of Queue in Python" link
    Then user is navigated to Queues "Implementation of Queue in Python" homepage
    And user clicks on Try here button
    And user writes python code "print \"Hello\""
    And user clicks on Run button
    Then user is able to see the output in the console

  @ImplCollDeque
  Scenario: verify Implementation using collections.deque
    Given user is on homepage
    When user clicks on get started button in queue module
    And user clicks on Queues "Implementation using collections.deque" link
    Then user is navigated to Queues "Implementation using collections.deque" homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @ImplUsingArray
  Scenario: verify Implementation using array
    Given user is on homepage
    When user clicks on get started button in queue module
    And user clicks on Queues "Implementation using array" link
    Then user is navigated to Queues "Implementation using array" homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  @QueueOperations
  Scenario: verify Queue operations
    Given user is on homepage
    When user clicks on get started button in queue module
    And user clicks on Queues "Queue Operations" link
    Then user is navigated to Queues "Queue Operations" homepage
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
