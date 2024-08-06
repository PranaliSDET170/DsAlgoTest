@Queue
Feature: Title of your feature

	@QueueModule	
  Scenario: Queue module
    Given The user is in the Home page after logged in
    When The user clicks the Get Started button in Queue Panel
    Then The user should be directed to Queue Page
    
  @ImplQueueInPython
  Scenario: Queue module - Implementation of Queue in Python
    Given The user is in the Queue page after logged in
    When The user clicks Implementation of Queue in Python button
    Then The user should be directed to Implementation of Queue in Python Page
    Given The user is in the Implementation of Queue in Python page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given The user is on the tryEditor page
    When The User writes Valid python code
    And click Run button
    Then User is able to see the output in console
    Given The user is on the tryEditor page
    When The user writes invalid python code
    And click Run button
    Then User is able to see the error msg in pop up window
    Given The user is on the editor page with Alert  error message	
    When The user click the ok button in the alert window		
    Then The user is on the same page having Editor and Run button																				
    Given The user is on the tryEditor page	
    When The user clicks browser back button		
    Then The user should be directed to Implementation of Queue in Python Page																					