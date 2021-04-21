Feature: Delete Lead using Leaftaps application

Background: 
Given Open the chrome browser
And Load the application URL

Scenario Outline: TC004_Delete Lead using phone number

Given Enter username as <username>
And Enter password as <password>
When click on Login button
Then Click on CRMSFA link
And Click on Leads
Then Click on Find Leads for Delete lead
And Click on phone Number tab for Delete lead
And Enter Phone Number as <phoneNum> for Delete lead
And Click on Find Leads button for Delete lead
Then Click on Lead Record for Delete lead
And Click on Delete Lead button
Then Verify if Lead is deleted
Then close the browser

Examples:
|username|password|phoneNum|
|'demosalesmanager'|'crmsfa'|'9'|