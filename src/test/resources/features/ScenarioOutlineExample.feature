Feature: Scenario Outline Example

  @Test1
  Scenario Outline: Verifying Data Table functionality1
    Given I am on Registration page
    When I fill the registration form with "<name1>", "<email1>", "<password1>", and "<age1>"

    #Then I verify the registration form details
    Examples: 
      | name1   | email1           | password1 | age1 |
      | Divya   | alice@test.com   | xyz!      |   30 |
      | Bob     | bob@test.com     | Secure456 |   25 |
      | Charlie | charlie@test.com | Password7 |   35 |
