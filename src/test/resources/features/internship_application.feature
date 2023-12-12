Feature: Internship Application
  Scenario: User should be able to apply to an internship with no extra questions if they uploaded their CV
    Given the user is on the internship's page
    When the user uploaded their CV
    And the user presses the apply button
    And the user has not applied to the same position before
    Then the registration is stored in the system and the user is notified

  Scenario: User should be able to apply to an internship with extra questions if they uploaded their CV and answered the questions
    Given the user is on the internship's page
    When the user uploaded their CV
    And the user answered all the extra questions posed by the Representatives
    And the user presses the apply button
    And the user has not applied to the same position before
    Then the registration is stored in the system and the user is notified

  Scenario: User should not be able to apply to an internship if they already applied for that position
    Given the user is on the internship's page
    When the user already applied for the internship
    Then the apply button is turned into a delete application button

  Scenario: User should not be able to apply to an internship if they have not provided the necessary information
    Given the user is on the internship's page
    When the user did not upload their CV
    And the user did not answer the extra questions
    And the user presses the apply button
    Then the user will not be able to apply and they will be notified about what they need to complete