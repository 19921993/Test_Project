Feature: Select Functionality
  As a user
  I want to navigate to the home page
  So that I can interact with select options

  @test03 @regression
  Scenario: Verify Default Selection and Select Option
    Given the user is on the home page
    When the user navigates to the Test 3
    Then "Option 1" should be the default selected value in the select list

    When the user selects "Option 3" from the select list
    Then "Option 3" should be the selected value in the select list
