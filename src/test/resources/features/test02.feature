Feature: Home Page Functionality
  As a user
  I want to navigate to the home page
  So that I can interact with the elements on the page

  @test02 @regression
  Scenario: Verify List Group in Test 2
    Given the user is on the home page
    When the user navigates to the Test 2
    Then the user should see 3 values in the list group
    And the list item number 2 value is set to "List Item 2"
    And the list item number 2 badge value is "6"