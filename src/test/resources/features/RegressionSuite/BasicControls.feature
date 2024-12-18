Feature: Basic Controls Practice

  @Regression
  Scenario: Handling basic controls
    Given User should validate title of page
    And User should move to selenium practice link to see options in the dropdown
    And User should click on Basic Controls option from the drop down
    And User should send the text into the FirstName and LastName text boxes
    And User should select any one gender radio button
    And User should click on any of the check boxes from the Languages known
    And User should click on Register button
    Then User should validate the successful message after clicking on register button
    And User should click on the link to go back to home page
