@ui
Feature: Simple login test
  Background: Skip welcome screen
    Given I go to url "https://staging.engineer.ai/home"
    And I skip welcome screen

  Scenario: Login Test
    Given open login popup
    When enter user name "sunny@yopmail.com" and password "1234qaqa"
    Then check for login status
