@LinkedList @DsAlgo
Feature: This feature file contain scenario for the Linked List module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is successfully logged in

  Scenario: Verify linkedlist Introduction module
    Given user is on homepage
    When user clicks the Get Started button in linkedlist module
    Then user should be redirected to linkedlist page
    When user clicks "Introduction" link
    Then user should be redirected to "Introduction" page    
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
 
   Scenario: Verify linkedlist CreatingLinkedList module
    Given user is on homepage
    When user clicks the Get Started button in linkedlist module
    Then user should be redirected to linkedlist page
    When user clicks "Creating Linked LIst" link
    Then user should be redirected to "Creating Linked LIst" page
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console

  Scenario: Verify linkedlist TypesofLinkedList module
    Given user is on homepage
    When user clicks the Get Started button in linkedlist module
    Then user should be redirected to linkedlist page
    When user clicks "Types of Linked List" link
    Then user should be redirected to "Types of Linked List" page
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
    
  Scenario: Verify linkedlist ImplementLinkedList module
    Given user is on homepage
    When user clicks the Get Started button in linkedlist module
    Then user should be redirected to linkedlist page
    When user clicks "Implement Linked List in Python" link
    Then user should be redirected to "Implement Linked List in Python" page
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
 
   Scenario: Verify linkedlist Traversal module
    Given user is on homepage
    When user clicks the Get Started button in linkedlist module
    Then user should be redirected to linkedlist page
    When user clicks "Traversal" link
    Then user should be redirected to "Traversal" page
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console  

  Scenario: Verify linkedlist Insertion module
    Given user is on homepage
    When user clicks the Get Started button in linkedlist module
    Then user should be redirected to linkedlist page
    When user clicks "Insertion" link
    Then user should be redirected to "Insertion" page    
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
    
  Scenario: Verify linkedlist Deletion module
    Given user is on homepage
    When user clicks the Get Started button in linkedlist module
    Then user should be redirected to linkedlist page
    When user clicks "Deletion" link
    Then user should be redirected to "Deletion" page
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
    
  Scenario: Verify linkedlist Introduction module
    Given user is on homepage
    When user clicks the Get Started button in linkedlist module
    Then user should be redirected to linkedlist page   
    When user clicks "Introduction" link
    Then user should be redirected to "Introduction" page
    When user clicks "Practice Questions" link
    Then user should be redirected to "Practice Questions" page