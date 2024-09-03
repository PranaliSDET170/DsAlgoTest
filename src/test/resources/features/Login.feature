@Login @DsAlgo
Feature: This feature file contain scenario for the Login page

  Scenario Outline: verify user login
    Given user is on login page
    And User crdentials are read from Sheet <SheetName> at RowNumber <RowNumber>
    When user enters username and password
    And clicks on login button
    Then Verify alert message for login action

    Examples: 
      | Desc                        | SheetName          | RowNumber |
      | Valid userId and Password   | "User_Credentials" |         2 |
      | Invalid userId and Password | "User_Credentials" |         3 |
