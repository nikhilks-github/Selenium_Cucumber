Feature: Register to the System

  Scenario: User registers to the system successfully
    Given Register page is opened
    When User Clicks on the radio button male or female
    And User enters the firstname
    And User enters the last name
    And User enters the email
    And User enters Password
    And User enters confirm password
    Then User clicks on register button
    Then Registration complete should be displayed
