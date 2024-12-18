Feature: Login validation for orange hrm application

@Login
Scenario: Valid Login Validation

Given User should enter valid credentials username and password
And Click on Login Button
Then Verify successful navigation to hrm application page