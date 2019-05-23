@Login
Feature: Validate Login Feature Red App
  As a user with valid credentials
  I want to able to log in to the red app
  So that I can shop the stuffs

  #@tag2
  #Scenario Outline: Login to the RedApp
    #Given I launch Red App
    #When I click Hamburger menu
    #And I click Login link
    #Then I enter an <email> and <password>
    #And I click Sign In
    #Then I see the logged in email at Hamburger menu
#
    #Examples: 
      #| email                | password |
      #| sampletest@gmail.com | test123  |
      #| jothi2k9@gmail.com   | test123  |
@tag2
  Scenario: Login to the RedApp
    Given I launch Red App
    When I click Hamburger menu
    And I click Login link
    Then I enter an "username" and "password"
    And I click Sign In
    Then I see the logged in email at Hamburger menu
