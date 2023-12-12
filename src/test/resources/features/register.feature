Feature: Account Registration
  Scenario: User should be able to create a Candidate account
    Given the user is on the register page
    When the user provides correct mandatory fields
    And the user selects Candidate account
    And the user presses submit
    Then the user is logged in their account

  Scenario: User should be able to create a Representative account
    Given the user is on the register page
    When the user provides correct mandatory fields
    And the user selects Representative account
    And the user selects their employer
    And the user presses submit
    Then the user is logged in their account

  Scenario: User should not be able to create an account with incorrect data
    Given the user is on the register page
    When the user provides incorrect mandatory fields
    And the user presses submit
    Then the user is warned about the incorrect data
    And an account is not created