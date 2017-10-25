Feature: New user registration
#Test authentication page

  Scenario: Open Registration page
    Given User opens Home page
    When User clicks on "Sign In" button
    And User enters new valid email
    And User clicks on "Create an account" button
    Then Registration page should be opened

  Scenario: Open Registration page
    Given User opens Home page
    When User clicks on "Sign In" button
    And User enters new valid email
    And User clicks on "Create an account" button
    Then Registration page should be opened
