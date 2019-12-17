Feature: Login
  As a user, I want to be able to login under different roles with username and password

  Scenario: Login as store manager
    Given user is on the landing page(technically, it's a login page)
    Then user logs in as store manager
    And user verifies that "Dashboard" page subtitle is displayed