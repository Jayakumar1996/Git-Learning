Feature: Buyers module functionality

Background:
   Given user enters email "michael.riese@cbnorcal.com" and enters password "Testing123" and clicks on login button
   
   Scenario Outline: Search functionality
   When User navigates to buyers module
   And User searches using the buyers name "<name>"
   And User clears the search data and verifies the data is back to normal
     Examples: 
      | name          | 
      | Mike Riese    | 
      | Jim Rendler   | 