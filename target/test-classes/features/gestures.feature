@wip
Feature: User is able to use a gestures


  Scenario: User is able to swipe to open left side menu
    Given I land on the home screen
    When I swipe from left to right
    Then I should see the right side menu
    When I press on back button
    Then I see the "Length" as a current unit conversion

  Scenario: User is able to swipe to open right side menu
    Given I land on the home screen
    When I swipe from right to left
    Then I see the "Calculator" as a current unit conversion
    When I press on back button
    Then I should see the right side menu
