$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gestures.feature");
formatter.feature({
  "line": 2,
  "name": "User is able to use a gestures",
  "description": "",
  "id": "user-is-able-to-use-a-gestures",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.before({
  "duration": 22399778577,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User is able to swipe to open left side menu",
  "description": "",
  "id": "user-is-able-to-use-a-gestures;user-is-able-to-swipe-to-open-left-side-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I land on the home screen",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I swipe from left to right",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the right side menu",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I press on back button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I see the \"Length\" as a current unit conversion",
  "keyword": "Then "
});
formatter.match({
  "location": "main_menu_steps.iLandOnTheHomeScreen()"
});
formatter.result({
  "duration": 3501261873,
  "status": "passed"
});
formatter.match({
  "location": "gestures_steps.iSwipeFromLeftToRight()"
});
formatter.result({
  "duration": 2604184047,
  "status": "passed"
});
formatter.match({
  "location": "main_menu_steps.iShouldSeeTheRightSideMenu()"
});
formatter.result({
  "duration": 2638814788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "back button",
      "offset": 11
    }
  ],
  "location": "main_menu_steps.iPressOnMenuIcon(String)"
});
formatter.result({
  "duration": 1651884559,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Length",
      "offset": 11
    }
  ],
  "location": "home_screen_steps.iSeeTheAsACurrentUnitConversion(String)"
});
formatter.result({
  "duration": 2639951749,
  "status": "passed"
});
formatter.after({
  "duration": 3218829853,
  "status": "passed"
});
formatter.before({
  "duration": 22636171213,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User is able to swipe to open right side menu",
  "description": "",
  "id": "user-is-able-to-use-a-gestures;user-is-able-to-swipe-to-open-right-side-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I land on the home screen",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I swipe from right to left",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I see the \"Calculator\" as a current unit conversion",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I press on back button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I should see the right side menu",
  "keyword": "Then "
});
formatter.match({
  "location": "main_menu_steps.iLandOnTheHomeScreen()"
});
formatter.result({
  "duration": 2987634749,
  "status": "passed"
});
formatter.match({
  "location": "gestures_steps.iSwipeFromRightToLeft()"
});
formatter.result({
  "duration": 1861539007,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Calculator",
      "offset": 11
    }
  ],
  "location": "home_screen_steps.iSeeTheAsACurrentUnitConversion(String)"
});
formatter.result({
  "duration": 885244164,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "back button",
      "offset": 11
    }
  ],
  "location": "main_menu_steps.iPressOnMenuIcon(String)"
});
formatter.result({
  "duration": 1854360161,
  "status": "passed"
});
formatter.match({
  "location": "main_menu_steps.iShouldSeeTheRightSideMenu()"
});
formatter.result({
  "duration": 1951108318,
  "status": "passed"
});
formatter.after({
  "duration": 3892955122,
  "status": "passed"
});
});