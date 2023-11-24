Feature: Users should be able to login

  Background:
    Given User on the test page

  @test01
  Scenario: able to login
    And User sees email address and password inputs
    When User enters the email address and password
    Then user logged in successfully


