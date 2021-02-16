Feature: HRM Application
This applicaiton includes validating login application 
1) valid case
2) Invalid case
Background:
Given We shud be in Login Page
@validcase
Scenario: To validate login with valid credentials
When Enter valid name 
And Enter valid password 
And click on login button when valid
Then Login Should be Success 
@invalidcase
Scenario: To login with invalid credentials
When Enter Invalid name 
And Enter Invalid pwd 
And Click on Login button when invalid
Then Login fails 
