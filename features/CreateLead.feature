Feature: Create Lead using Leaftaps application

Background: 
Given Open the chrome browser
And Load the application URL

Scenario Outline: TC001_Create Lead using mandatory fields

Given Enter username as <username>
And Enter password as <password>
When click on Login button
Then Click on CRMSFA link
And Click on Leads
And Click on Create Lead
And Enter the Company Name as <compName>
And Enter the First Name as <firstName>
And Enter the Last Name as <lastName>
Then Submit button is clicked
Then close the browser

Examples:
|username|password|compName|firstName|lastName|
|'demosalesmanager'|'crmsfa'|'L&T'|'Ratan'|'Tata'|
|'democsr'|'crmsfa'|'CSK'|'Bill'|'Gates'|