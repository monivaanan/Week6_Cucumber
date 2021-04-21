Feature: Duplicate Lead using Leaftaps application

Background: 
Given Open the chrome browser
And Load the application URL

Scenario Outline: TC003_Duplicate Lead using phone number

Given Enter username as <username>
And Enter password as <password>
When click on Login button
Then Click on CRMSFA link
And Click on Leads
Then Click on Find Leads
And Click on phone Number tab
And Enter Phone Number as <phoneNum>
And Click on Find Leads button
Then Click on Lead Record
And Click on Duplicate Lead
And Click on createLead button
Then close the browser

Examples:
|username|password|phoneNum|
|'demosalesmanager'|'crmsfa'|'99'|