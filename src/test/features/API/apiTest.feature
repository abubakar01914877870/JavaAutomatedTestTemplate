@api
Feature: Simple API test using cucumber REST Assured
  Scenario: Get data from a site
    Given I set base path "https://restful-booker.herokuapp.com"
    Given I create access token "admin" and "password123"
#    When I request for all booking data
#    Then I check response status should be "success"
