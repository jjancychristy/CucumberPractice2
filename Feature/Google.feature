Feature: To validate google home page

@Smoke
Scenario: To validate search bar of Google Home page is "https://www.google.com"
Given User is on google page
When User enter text "America" search page
And User press enter button

@Smoke
Scenario: To validate search bar of Google Home page
Given User is on google page
When User enter text "India" search page
And User press enter button
Then validate the title of the page is "India - Google Search"

@Regression
Scenario Outline: To validate search bar of Google Home page
Given User is on google page
When User enter text "<searchValue>" search page
And User press enter button


Examples:
|searchValue|
|Selenium|
|Maven|
