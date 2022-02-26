Feature: Bank App
  Scenario: Scenario: Account for User
    Given user should register to bank with following data
      | Account Number | Routing Number |
      | 416958534057   | 123456789      |
    Then user should be successfully register the  bank with following data
      | Account Number | Routing Number |
      | 416958534057   | 123456789      |