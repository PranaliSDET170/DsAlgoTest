@LinkedList @DsAlgo
Feature: This feature file contain scenario for the Linked List module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is successfully logged in

  Scenario: Verify linkedlist Introduction module
    Given user is on homepage
    When User clicks the Get Started button in Linked List Panel
    Then The user should be redirected to "Linked List" page    
    When The user clicks "Introduction" link
    Then The user should be redirected to "Introduction" page    
    When The user clicks "Try here>>>" button
    Then The user should be redirected to a page having Editor and run button    
    When The user writes the valid python code
    And  Click run button
    Then The user is able to see the output inside the console
 
   Scenario: Verify linkedlist CreatingLinkedList module
    Given user is on homepage   
    When User clicks the Get Started button in Linked List Panel
    Then The user should be redirected to "Linked List" page 
    When The user clicks "Creating Linked LIst" link
    Then The user should be redirected to "Creating Linked LIst" page
    When The user clicks "Try here>>>" button
    Then The user should be redirected to a page having Editor and run button
    When The user writes the valid python code
    And Click run button
    Then The user is able to see the output inside the console

  Scenario: Verify linkedlist TypesofLinkedList module
    Given user is on homepage
    When User clicks the Get Started button in Linked List Panel
    Then The user should be redirected to "Linked List" page
    When The user clicks "Types of Linked List" link
    Then The user should be redirected to "Types of Linked List" page
    When The user clicks "Try here>>>" button
    Then The user should be redirected to a page having Editor and run button
    When The user writes the valid python code
    And Click run button
    Then The user is able to see the output inside the console
    
  Scenario: Verify linkedlist ImplementLinkedList module
    Given user is on homepage
    When User clicks the Get Started button in Linked List Panel
    Then The user should be redirected to "Linked List" page
    When The user clicks "Implement Linked List in Python" link
    Then The user should be redirected to "Implement Linked List in Python" page
    When The user clicks "Try here>>>" button
    Then The user should be redirected to a page having Editor and run button
    When The user writes the valid python code
    And Click run button
    Then The user is able to see the output inside the console
 
   Scenario: Verify linkedlist Traversal module
    Given user is on homepage
    When User clicks the Get Started button in Linked List Panel
    Then The user should be redirected to "Linked List" page
    When The user clicks "Traversal" link
    Then The user should be redirected to "Traversal" page
    When The user clicks "Try here>>>" button
    Then The user should be redirected to a page having Editor and run button
    When The user writes the valid python code
    And Click run button
    Then The user is able to see the output inside the console   

  Scenario: Verify linkedlist Insertion module
    Given user is on homepage
    When User clicks the Get Started button in Linked List Panel
    Then The user should be redirected to "Linked List" page
    When The user clicks "Insertion" link
    Then The user should be redirected to "Insertion" page    
    When The user clicks "Try here>>>" button
    Then The user should be redirected to a page having Editor and run button
    When The user writes the valid python code
    And Click run button
    Then The user is able to see the output inside the console
    
  Scenario: Verify linkedlist Deletion module
    Given user is on homepage
    When User clicks the Get Started button in Linked List Panel
    Then The user should be redirected to "Linked List" page
    When The user clicks "Deletion" link
    Then The user should be redirected to "Deletion" page
    When The user clicks "Try here>>>" button
    Then The user should be redirected to a page having Editor and run button
    When The user writes the valid python code
    And Click run button
    Then The user is able to see the output inside the console
    
  Scenario: Verify linkedlist Introduction module
    Given user is on homepage
    When User clicks the Get Started button in Linked List Panel
    Then The user should be redirected to "Linked List" page    
    When The user clicks "Introduction" link
    Then The user should be redirected to "Introduction" page
    When The user clicks "Practice Questions" link
    Then The user should be redirected to "Practice Questions" page