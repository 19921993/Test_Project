Feature: Login Functionality
  As a user
  I want to navigate to the home page
  So that I can log in to my account

  @test01 @smoke @regression
  Scenario: Verify Login Page Elements and Enter Credentials
    Given the user is on the home page
    Then the user should see the email address input field
    And the user should see the password input field
    And the user should see the login button

    When the user enters an email address
    And enters a password
    And clicks the login button
