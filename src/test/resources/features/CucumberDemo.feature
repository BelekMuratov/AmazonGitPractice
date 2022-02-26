@Smoke
Feature: Login functionality
 # here we would write the feature name to be tested
 # we create one feature file for per feature
Background: User is logged in to https://www.facebook.com/
  Scenario: Verify user can login with valid credentials
    # Given steps are used for precondition
    # When Action
    When User enter test@test.com to email field
    # And
    And User should enter Hello1234 in password input field
    And User should click on Log In button
    # Then Validation
    Then User should successfully logged in to the Facebook
