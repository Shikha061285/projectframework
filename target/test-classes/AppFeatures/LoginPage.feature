Feature: Log In page Feature

Scenario: Log In Page Title
Given User is on Log In Page
When User gets the title of Page
Then Page Title will be "Log In or Register - DollarDays"


Scenario: Forgot your email address or password? link
Then Forgot your email address or password? link should be displayed


Scenario: Login with correct credentials
Given User is on Login Page
When User enters Email Address "shikhatesting06@gmail.com"
And User enters Password "abc123"
And User clicks on Sign In Button




