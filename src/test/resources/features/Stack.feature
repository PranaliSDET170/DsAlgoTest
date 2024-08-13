@Stack
Feature: This feature file contain scenario for the Stack module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is successfully logged in

  Scenario: Verify Stack Operations in Stack module
    Given user is on homepage
    When User clicks the Get Started button in Stack Panel
    Then The user should be redirected to "Stack" page    
    When The user clicks "Operations in Stack" link
    Then The user should be redirected to "Operations in Stack" page    
    When The user clicks "Try here>>>" button
    Then The user should be redirected to a page having Editor and run button    
    When The user writes the valid python code
    And  Click run button
    Then The user is able to see the output inside the console
    
  Scenario: Verify Stack Implementation module
    Given user is on homepage
    When User clicks the Get Started button in Stack Panel
    Then The user should be redirected to "Stack" page    
    When The user clicks "Implementation" link
    Then The user should be redirected to "Implementation" page    
    When The user clicks "Try here>>>" button
    Then The user should be redirected to a page having Editor and run button    
    When The user writes the valid python code
    And  Click run button
    Then The user is able to see the output inside the console
    
  Scenario: Verify Stack Implementation module
    Given user is on homepage
    When User clicks the Get Started button in Stack Panel
    Then The user should be redirected to "Stack" page    
    When The user clicks "Applications" link
    Then The user should be redirected to "Applications" page    
    When The user clicks "Try here>>>" button
    Then The user should be redirected to a page having Editor and run button    
    When The user writes the valid python code
    And  Click run button
    Then The user is able to see the output inside the console