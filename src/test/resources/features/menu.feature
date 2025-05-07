@feature=MenuFeature
Feature: Frontend Menu Functionality
  As a User
  I want to be able to see clickable SideMenu button
  So that I can access to menu options

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check all options are displayed and clickable for Menu button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    Then I should see all menu's options

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Home button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And Click on Home button
    Then I should be redirected to the homepage

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check What We Do button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on About button
    And I click on What We Do button
    Then I should see What We do section on About Us page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Background button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on About button
    And I click on Background button
    Then I should see Background section on About Us page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Testimonials button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on About button
    And I click on Testimonials button
    Then I should see Testimonials section on About Us page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check F.A.C. button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on About button
    And I click on FAC button
    Then I should see FAC section on About Us page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Contact Us button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on About button
    And I click on Contact Us button
    Then I should see Contact Us section on About Us page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Our Team button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Our Team button
    Then I should see Our Team section

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Scholarships button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Scholarships button
    Then I should see Scholarships page
    And I click on Recruiting Info button
    Then I should redirect to Need To Know page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Grades button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Recruiting button
    And I click on Grades button
    Then I should see Grades section on Need To Know page
    
  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Gameplan button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Recruiting button
    And I click on Gameplan button
    Then I should see Gameplan page
    
  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Guidelines button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Recruiting button
    And I click on Guidelines button
    Then I should see Guidelines page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Calendar button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Recruiting button
    And I click on Calendar button
    Then I should see Calendar page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Player Directory button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Coaches button
    And I click on PlayerDirectory button
    Then I should see Guest area page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check My Profile button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Athletes button
    And I click on My Profile button
    Then I should see Get Verified page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Coach Directory button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Athletes button
    And I click on Coach Directory button
    Then I should see Coach Directory page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Study Guide button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Athletes button
    And I click on Study Guide button
    Then I should see Study Guide page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Classroom button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Athletes button
    And I click on Classroom button
    Then I should see Get Verified page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Film To Field button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Athletes button
    And I click on Film To field button
    Then I should see Film To Field page

  @severity=critical @story=CheckSideMenuButtonOptions @regression @smoke
  Scenario: Check Settings button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on Athletes button
    And I click on Settings button
    Then I should see Membership agreement page