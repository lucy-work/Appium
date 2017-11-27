Feature: Test for Home screen functionality

  Background:
    Given I land on the home screen

  Scenario: Default values on Home screen are Foot and Centimeter
    Then Left Unit picker value should be Foot
    And Right Unit picker value should be Centimeter


   Scenario: Show All button should be enable at launch
     Then Show All button should be disable
     When I type "1" on application keyboard
     Then Show All button should be enable

   Scenario Outline: Verify default conversion
     When I type "<target>" on application keyboard
     Then I should see result as "<result>"
     Examples:
       |target|result |
#       |1     |30.48  |
       |2     |60.96  |
#       |3     |91.44  |
       |10     |304.8 |

  Scenario: Shoe All button should be enable at launch
    Then Show All button should be enable
    When I press on Clear button
    Then Show All button should be disable

   Scenario: User is able to save the favorite conversion
     When I press star icon
     And I press on menu icon
     And I press on Favorite Conversions button
     Then I verify "Length" added to the Favorite Conversation


   Scenario:  User is able to search by existing conversion type
     When I press on Search icon
     Then I type "Temperature" in search field
     And I press return button on soft keyboard
     Then I see the "Temperature" as a current unit conversion
     Then Left Unit picker value should be Celsius
     And Right Unit picker value should be Fahrenheit


  Scenario Outline: User is able to select value from unit picker
    Then I select "<unit_type>" from left unit picker
    When I type "<amount>" on application keyboard
    Then I should see result as "<result>"

    Examples:
      |unit_type|amount|result  |
      |Inch     |1     |2.54    |
      |Link     |1     |20.1168 |


    Scenario: Uer is able to convert values
      When I press on menu icon
      Then I press on "Volume"
      Then I select "Cup" from right unit picker
      When I type "1" on application keyboard
      Then I should see result as "15.1416"

      Scenario: User is able to switch a value
        Then Right Unit picker value should be Centimeter
        And Left Unit picker value should be Foot
        When I press on Switch button
        Then Right Unit picker value should be Foot
        And Left Unit picker value should be Centimeter

Scenario: User is able to clean up the conversion history
  When I press on menu icon
  Then I press on "History"
  And I see the "History" as a current unit conversion
  Then I should see text "No history right now"
  When I press on menu icon
  Then I press on "Length"
  When I type "1" on application keyboard
  When I press on menu icon
  And I press on "History"
  Then I verify that 1st result in history list is "Length"
  And I press delete from history at 1st row
  And I should see text "No history right now"



