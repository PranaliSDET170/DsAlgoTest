@Queue @DsAlgo
Feature: This feature file contain scenario for the Queue module

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is successfully logged in

  @ImplQueueInPython
  Scenario Outline: verify Implementation of Queue in Python
    Given user is on homepage
    When user clicks on get started button in queue module
    And user is navigated to queue homepage
    And user clicks on Queues "Implementation of Queue in Python" link
    Then user is navigated to Queues "Implementation of Queue in Python" homepage
    And user clicks on Try here button
    And Write python code from Sheet <SheetName> at RowNumber <RowNumber> and enter
    And user clicks on Run button
    Then Verify alert window and close it
    And user is able to see the output in the console

    Examples: 
      | SheetName    | RowNumber |
      | "pythonCode" |         2 |
      | "pythonCode" |         3 |
      | "pythonCode" |         4 |

