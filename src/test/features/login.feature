@ui
Feature: Simple login test
  Scenario: login
    Given I go to url "https://www.saucedemo.com"
    When I login using user "standard_user" and password "secret_sauce"
    Then I check page url "https://www.saucedemo.com/inventory.html"
    When I click logout button
    Then I check page url "https://www.saucedemo.com/"
