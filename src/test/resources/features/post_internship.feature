Feature: Post Internship
  Scenario: The representative should be able to post an internship with all its mandatory details
    Given the representative is on the add internship page
    When the representative posted all required information for the internship
    And the representative presses the submit button
    Then a new internship will be posted in the system

  Scenario: The representative should be able to post an internship with all its mandatory and optional details
    Given the representative is on the add internship page
    When the representative posted all required information for the internship
    And the representative posted optional information about the internship
    And the representative presses the submit button
    Then a new internship will be posted in the system

  Scenario: The representative should be able to modify the internship details while it is open
    Given the representative is on the internship page
    And the internship is open
    When the representative changes internship information
    And the representative presses the submit button
    Then the internship information is modified in the system

  Scenario: The internship will automatically close when the period is over
    Given the internship period is over
    Then the system will close the internship post

  Scenario: The representative can close the internship
    Given the internship is open
    When the representative presses the close internship button
    Then the system will close the internship post

  Scenario: The representative can delete closed internship posts
    Given the internship post is closed
    When the representative presses the delete internship button
    Then the system will delete the internship post