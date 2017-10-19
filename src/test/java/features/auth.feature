Feature: Auth process
#Test authentication page

  Scenario:
    Given I am on Home page
    When I click on "Sign In" button
    And I enter new email
    And I click on "Create an account" button
    Then Registration page should be opened
