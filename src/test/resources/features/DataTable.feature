Feature: Data Table Functionality
@DataTablesExample
Scenario: Verifying Data Table functionality
Given I am on Registration page
When I fill the following details
      | name       | email            | password   | age  |
      | Alice      | alice@test.com   | Pass123!   | 30   |
      | Bob        | bob@test.com     | Secure456  | 25   |
      | Charlie    | charlie@test.com | Password7  | 35   |
#Then I verify all the users
