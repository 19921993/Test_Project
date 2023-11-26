Feature: Grid Cell Value Verification
  As a user
  I want to navigate to the home page
  So that I can find the value of a cell on the grid

  @test06 @regression
  Scenario: Verify Grid Cell Value
    Given the user is on the home page
    When the user navigates to the Test 6
    And the user requests the value of the cell at coordinates 3, 3
    Then the value of the cell should be "Ventosanzap"