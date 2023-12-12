Feature: Employer Review
  Scenario: User should be able to review the employer once the internship is over
    Given the internship period is over
    And the user was selected for the internship
    When the user accesses the employer's page
    And the user clicks the review button
    Then a review form will be presented to the user

  Scenario: User should be able to rate the employer on a scale from 1 to 5
    Given the user is on the review form
    Then the user is able to rate the employer on a scale from 1 to 5

  Scenario: User should be able to leave a comment on their review
    Given the user is on the review form
    Then the user is able to leave a comment along with their review

  Scenario: User should not be able to review the same employer twice
    Given the user already reviewed the employer
    When the user accesses the employer's page
    Then the review button is turned into a modify review button

  Scenario: User should not be able to review an employer whose internship they did not attend
    Given the user did not get selected for the internship
    When the user accesses the employer's page
    Then the review button is not visible