Feature: Login
  Scenario: User should be able to login when providing correct data
    Given the user is on the login page
    When the user enters correct login data
    And the user presses submit
    Then the user is logged in their account

  Scenario: User is logged out of their account
    Given the user has been logged in for more than a week
    Then the user is logged out of their account

  Scenario: User logs out of their account
    Given the user is logged in their account
    When the user presses logout
    Then the user is logged out of their account

  Scenario: User should be unable to login when providing incorrect data
    Given the user is on the login page
    When the user enters incorrect login data
    And the user presses submit
    Then the user is logged in their account