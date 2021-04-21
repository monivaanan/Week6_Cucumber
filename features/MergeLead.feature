Feature: Merge lead using Leaftaps application

Background: 
Given Open the chrome browser
And Load the application URL

Scenario Outline: TC005_Merge Lead using first Name

Given Enter username as <username>
And Enter password as <password>
When click on Login button
Then Click on CRMSFA link
And Click on Leads
Then Click on Merge leads
And Click on From Lead Look up
And Enter first name as <firstNameFrom> From lookup
Then Click on From lead record
And Click on To Lead Look up
And Enter first name as <firstNameTo> To lookup
Then Click on To lead record
And Click on Merge button
Then Click on Alert
When Click on Find Leads and verify if from Lead ID retruns
Then close the browser

Examples:
|username|password|firstNameFrom|firstNameTo|
|'demosalesmanager'|'crmsfa'|'Hari'|'Karthik'|