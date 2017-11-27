Feature: User is able to create and manage a custom conversion

  Scenario: User is able to create a new custom conversion
    Given I land on the home screen
    When I press on menu icon
    And I press on "My Conversions"
    And I press on Create your first conversion button
    And I type "Power" as a custome converion name
    When I press on New unit button
    Then I type "Horse power" as a Unit name
    Then I type "HP" as a unit symbol
    Then I type "1" as a unit value
    Then I press submit checkmark on Custom conversion screen
    When I press on New unit button
    Then I type "Mule power" as a Unit name
    Then I type "MP" as a unit symbol
    Then I type "0.5" as a unit value
    Then I press submit checkmark on Custom conversion screen
    When I press on Ok button on the custom confirm screen
    Then I verify "Power" added to the Custom Conversation

