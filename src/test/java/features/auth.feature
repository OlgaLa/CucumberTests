Feature: Auth process
#Test authentication page

  Scenario:
    When I click on "Sign In" button
    And I enter new valid email
    And I click on "Create an account" button
    Then Registration page should be opened
