Feature: Button Interaction in Test 5 Div
  As a user
  I want to navigate to the home page
  So that I can interact with a dynamic button in Test 5 div

  @test05 @regression
  Scenario: Click Dynamic Button in Test 5 Div
    Given the user is on the home page
    When the user navigates to the Test 5
    Then the user should wait for the button to be displayed

    When the user clicks the button
    Then a success message should be displayed
    And the button should be disabled