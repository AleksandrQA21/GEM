Feature: Login Functionality
  As a Student
  I want to be able to login to the G.E.M. Class Recruiting website
  So that I can access my account
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid email "aleksandr.titovskoy+3@greenice.net"
    And I enter valid password "1q2w3e4r"
    And I click on the login button
    Then I should be redirected to the homepage
    And I should see user is logged in
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
##      |                                   | q1w2e3r4 |
##      | aleksandr.titovskoy@greenice.net  |          |