

Feature: Frames Functionality
  @Regression
  Scenario: Validating the functionality of frames
    Given User should validate title of page
   And User should move to selenium practice link to see options in the dropdown
   And User should click on frames practice option from the dropdown
   And User should validate the title of frames page
   And User should move into frame1 and test the functionality in frame1
   And User should move into frame2 and test the functionality in frame2
   And User should move to frame3 and test the functionality in frame3
   And User should finally come out from the frames and enter the text in the displayed textbox
    And Click on Home link
 