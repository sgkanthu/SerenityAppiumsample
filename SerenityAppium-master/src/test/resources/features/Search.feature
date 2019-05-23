Feature: As an active user
  I want to search the product in the app
  To know the options available for online shopping

  Scenario: ActiveLogin
    Given I launch the AUT
    When I click SearchButton
    Then I enter "Rings"
    And I click Find button
  
