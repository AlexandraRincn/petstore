@testService
Feature: Service tests

  @soldPets
  Scenario Outline: Add a pet
    Given I have a header
    And I create a get request with "<status>"
    Then I see status code 200 in DB
    And I see name and ID in JSON response

    Examples:
      | status    |
      | sold |
