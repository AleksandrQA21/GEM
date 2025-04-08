@epic=Authentication @feature=LoginFeature
Feature: Login Functionality
  As a Student
  I want to be able to login to the G.E.M. Class Recruiting website
  So that I can access my account

  @severity=critical @story=SuccessfulLogin @regression @smoke
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid email "aleksandr.titovskoy+3@greenice.net"
    And I enter valid password "1q2w3e4r"
    And I click on the login button
    Then I should be redirected to the homepage
    And I should see user is logged in

  @severity=normal @story=UnsuccessfulLogin @regression
  Scenario Outline: Unsuccessful login with invalid credentials
    Given I am on the login page
    When I enter email "<email>"
    And I enter password "<password>"
    And I click on the login button
    Then I should see an error message
    And I should see error message containing "The credentials do not match our records."
    And I should remain on the login page

    Examples:
      | email                             | password |
      | invalid@example.com               | q1w2e3r4 |
      | aleksandr.titovskoy@greenice.net  | wrong123 |

  @severity=minor @story=ValidationChecks @regression
  Scenario Outline: Validation empty login or password fields
    Given I am on the login page
    When I enter email "<email>"
    And I enter password "<password>"
    And I click on the login button
    And I should see Please fill out this field validation
    And I should remain on the login page
    Examples:
      | email                             | password |
      |                                   | q1w2e3r4 |
      | aleksandr.titovskoy@greenice.net  |          |

  @severity=normal @story=ForgotPassword @regression
  Scenario: Forgot password link
    Given I am on the login page
    When I click on Forgot Password link
    Then I should see Recover Password page
    And I enter valid email "aleksandr.titovskoy+3@greenice.net"
    And I click Reset button
    Then I should see Reset Password link sent
    And email input field is empty
    And I click on Back to Sign in button
    Then I should remain on the login page

