#Feature: Login Functionality
#
#@smoke
  #Scenario Outline: Login with valid credentials
    #Given User navigates to login page
    #When User enters the valid email address "<email>" and valid password "<password>"
    #And User clicks on the login button
    #Then User should get successfully logged in
#
    #Examples: 
      #| email                      | password   |
      #| michael.riese@cbnorcal.com | Testing123 |
     #
  #Scenario Outline: Login with invalid credentials
    #Given User navigates to login page
    #When User enters the invalid email address "<email>" and invalid password "<password>"
    #And User clicks on the login button
    #Then User should not get logged in
    #
    #Examples: 
      #| email                      | password   |
      #| michael.riesecbnorcal.com  | Test123    |
#
#
 #Scenario Outline: Login with valid email and invalid password
    #Given User navigates to login page
    #When User enters the valid email address "<email>" and invalid password "<password>"
    #And User clicks on the login button
    #Then User should not get logged in
    #
     #Examples: 
      #| email                      | password   |
      #| michael.riese@cbnorcal.com | Test123    |
#
  #Scenario Outline: Login with invalid email and valid password
    #Given User navigates to login page
    #When User enters the invalid email address "<email>" and valid password "<password>"
    #And User clicks on the login button
    #Then User should not get logged in
    #
     #Examples: 
      #| email                      | password   |
      #| michael.riesecbnorcal.com  | Testing123 |
#
  #Scenario: Login without providing any credentials
    #Given User navigates to login page
    #When User does not enters email address and password
    #And User clicks on the login button
    #Then User should not get logged in
 #
 