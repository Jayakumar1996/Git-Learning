Feature: My Listing module functionality

Background:
   Given user enters email "ariyanayagam@twilightsoftwares.com" and enters password "Test@123" and clicks on login button
   
   Scenario: My Listing functionality
   When User navigates to My Listing module
   And User clicks the required dropdown and then the results are displayed
   And User clicks Add Listing button
   And User enters the property datas for adding the exclusives 
   Then User clicks save then that property is displayed in the mylisting page