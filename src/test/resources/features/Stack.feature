@Stack @DsAlgo
Feature: This feature file contain scenario for the Stack module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is successfully logged in

  Scenario: Verify Stack Operations in Stack module
    Given user is on homepage
    When user clicks the Get Started button in stack module
    Then user should be redirected to stack page  
    When The user clicks "Operations in Stack" link
    Then The user should be redirected to "Operations in Stack" page    
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
    
  Scenario: Verify Stack Implementation module
    Given user is on homepage
    When user clicks the Get Started button in stack module
    Then user should be redirected to stack page     
    When The user clicks "Implementation" link
    Then The user should be redirected to "Implementation" page    
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console
    
  Scenario: Verify Stack Implementation module
    Given user is on homepage
    When user clicks the Get Started button in stack module
    Then user should be redirected to stack page   
    When The user clicks "Applications" link
    Then The user should be redirected to "Applications" page    
    And user clicks on Try here button
    And user writes valid python code
    And user clicks on Run button
    Then user is able to see the output in the console