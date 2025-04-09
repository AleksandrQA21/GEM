@feature=MenuFeature
Feature: As a User
  I want to be able to see clickable SideMenu button to the G.E.M. Class Recruiting website
  So that I can access to menu options

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check all options are displayed and clickable for Menu button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    Then I should see all menu's options