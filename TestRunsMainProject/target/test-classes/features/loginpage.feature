Feature: Login page

    Feature Login page will work depending on the user credentials.

  Background:  A web browser is at the Testrunz login page
  Given A web browser is at the Testrunz login page
 
    Scenario: TC_TRUNZ_01_04: Verify when user does not logged In with empty credentials      
        Then Leave the fields empty and directly click the Log In button

    Scenario Outline: TC_TRUNZ_01_05: Verify whether the user should not be logged In with "<email id>" and "<password>" invalid credentials
        Then Enter the email id "<email id>"
        Then Enter the password "<password>"
        Then Click Log In button
        
        Examples:
        | email id | password |
        | admintestrunz.com | Test@123 |
        | admin@testrunz.com | Test@123a |
        | admintestrunz.com | Test@123a |
    
    @smoke
    Scenario Outline: TC_TRUNZ_01_08: Verify whether the user should be able to log In with valid credentials with clicking the checkbox      
        Then Enter the registered email id "<email id>"
        Then Enter the registered password "<password>"
        Then Click the Remember me checkbox 
        Then Click Log In button
        
        Examples:
        | email id | password |
        | admin@testrunz.com | Test@123 |
        
    Scenario Outline: TC_TRUNZ_01_09: Verify whether the user should be able to log In with valid credentials without clicking the checkbox    
        Then Enter the registered email id "<email id>"
        Then Enter the registered password "<password>"
        Then Click Log In button
        
        Examples:
        | email id | password |
        | admintestrunz.com | Test@123 |
    
    Scenario: TC_TRUNZ_01_10: Verify whether the user is able to redirected to the corresponding page when the user clicks "forgot your password ?"
        Then User clicks the forgot your password? link text 

    Scenario: TC_TRUNZ_01_11: Verify whether the user is able to redirected to the corresponding page when the user clicks "click here to signup!"
        Then User clicks the click here to signup link text 
    
    Scenario: TC_TRUNZ_01_12: Verify whether the eye icon is present in the password field is should be clickable
        Then Click the eye icon and the field shows the password characters.
        Then Again, click the eye icon and the field hides the password characters and vice versa.
