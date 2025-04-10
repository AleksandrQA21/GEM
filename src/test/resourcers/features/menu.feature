@feature=MenuFeature
Feature: As a User
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

  @severity=critical @story=CheckWhatWeDoSection @regression @smoke
  Scenario: Check What We Do button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on About button
    And I click on What We Do button
    Then I should see What We do section on About Us page

  @severity=critical @story=CheckBackgroundSection @regression @smoke
  Scenario: Check Background button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on About button
    And I click on Background button
    Then I should see Background section on About Us page

  @severity=critical @story=CheckTestimonialsSection @regression @smoke
  Scenario: Check Testimonials button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on About button
    And I click on Testimonials button
    Then I should see Testimonials section on About Us page

  @severity=critical @story=CheckFacSection @regression @smoke
  Scenario: Check F.A.C. button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on About button
    And I click on FAC button
    Then I should see FAC section on About Us page

  @severity=critical @story=ContactUsSection @regression @smoke
  Scenario: Check Contact Us button
    Given I open G.E.M. Class Recruiting website as a guest
    When I click on Menu button
    And I click on About button
    And I click on Contact Us button
    Then I should see Contact Us section on About Us page