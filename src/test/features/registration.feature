Feature: I want to create an account successfully
#  Background: I am on Create account page
#    Given I am on homepage
#    And click on signIn tab
#    And enter email address "londongb@gmail.com"
#    And click on create account

  @reg
  Scenario: User should register successfully when enters all required fields.

    Given user is on registration page
    When user enter all required fields
    And click on Register Button
    Then user should be able to see success message
