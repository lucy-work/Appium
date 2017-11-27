Feature: As a user I want to convert units


  Scenario: When I tap to the menu, I should see the left side menu
    Given I land on the home screen
    When I press on menu icon
    Then I should see the right side menu


   Scenario: I should be able to open my Conversion screen
     Given I land on the home screen
     When I press on menu icon
     And I press on "My Conversions"
     Then I land on My Conversions screen