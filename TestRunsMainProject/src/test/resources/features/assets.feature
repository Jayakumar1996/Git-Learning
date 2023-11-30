
Feature: Assets page

    Feature Assets page will work depending on the user credentials.
      
     
    Background: 
        Given user enters email "admin@testrunz.com" and enters password "Test@123" and clicks on login button
        Then Click the Asset module which is located in the sidebar.

      #Scenario: TC_TRUNZ_03_01: Verify whether the user successfully navigates to Asset page.
        #Then Ensure that the asset page is displayed.
       #
        #
    #Scenario: TC_TRUNZ_03_02: Verify whether the asset page is as per The Figma UI.
         #Then  Verify whether the asset page is as per The Figma UI.
    
          @sanity 
     Scenario: TC_TRUNZ_03_01: To validate the functionality of Add button and a pop-up displays when it is clicked.
         Then  Click the Add button and a pop-up displays.

     @sanity
     Scenario: TC_TRUNZ_03_02: Verify when User able to Search the Asset by using Asset Name in the search field.
         Then Enter Asset Name and click Search.
         Then  Verify that the User able to see the Assets Details after search.

     @sanity
     Scenario: TC_TRUNZ_03_03: To validate the functionality of with empty search.
         Then  Directly click the search button by leaving the fields empty.
         Then  Verify that the page displays remain unchanged.
         
     @sanity
     Scenario: TC_TRUNZ_03_04: To check if the user gets an error message when they click the search button without any assets
         Then  Search for assets using any name.
         Then Verify that the page displays no results found. 

     
     Scenario: TC_TRUNZ_03_05: To validate the functionality of searching non assets.
         Then  Search with non existing assets.
         Then  Verify that the page displays no results found.

     
     Scenario: TC_TRUNZ_03_6: Verify whether the filter is working as expected.
         Then  Click the filter and select the asset based on the availability.
         Then  Verify that the filtered asset is displayed properly based on the availability of asset.

     @sanity
     Scenario: TC_TRUNZ_03_7: Verify whether the asset details page is opening when the user clicks the asset in the table.
         Then  Click the required asset which is present in the table.  
         Then  Ensure that the asset details page is opening when the user clicks the specific asset in the table.

     







         

