Feature: Login

  #@Sanity
  Scenario: Successful shoping Site Login with Valid Credentials
    Given User Launch Chrome browser for ShopingSite
    When User opens the given URL "https://www.automationexercise.com/login"
    When User enters Email id as "vikas.singh@gmail.com" and Password as "Noida@123"
    Then User click on Login button
    And User logout
    
    
   Scenario Outline: Successful shoping Site Login with Valid Credentials DDT
    Given User Launch Chrome browser for ShopingSite
    When User opens the given URL "https://www.automationexercise.com/login"
    When User enters Email id as "<email>" and Password as "<password>"
    Then User click on Login button
    And User logout
    
Examples: 
|email                |password|
|vikas2@gmail.com     |Noida@1234|
|vikas.sing@gmail.com |Noida@12| 
    
    