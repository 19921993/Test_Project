Feature: Button State Validation
  As a user
  I want to navigate to the home page
  So that I can validate the state of buttons in Test 4 div

  @test04 @regression
  Scenario: Verify Button States in Test 4 Div
    Given the user is on the home page
    When the user navigates to the Test 4
    Then the first button should be enabled
    And the second button should be disabled