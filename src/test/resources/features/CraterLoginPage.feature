@Login @smokeTest
Feature: CraterLoginPageComponents

  @loginPage
  Scenario: Verifying login page components
    Given navigate to the Prime Tech Invoice Applicationlogin page
    Then It should display the Login page with page title Crater Crater - Self Hosted Invoicing Platform
    And  Text box with the Label Email
    And  Text box with the Label Password
    And  A link titled ‘Forgot Password?
    And  A primary button labeled ‘Login’
    And  A Text area with the following text located on the bottom left Copyright @ Crater Invoice, Inc.
    And  A Heading located to the right with the following text Simple Invoicing for Individuals Small Businesses
    And  A Heading located underneath Heading with the following text Crater helps you track expenses, record payments & generate beautiful invoices & estimates
 
  @validLogin
  Scenario Outline:: Login as a user with valid credentials
    Given navigate to the Prime Tech Invoice Applicationlogin page
    Then enter a valid "<username>" and a valid "<password>"
    And click on the login button
    Then the system should direct to the dashboard page
    
     Examples: 
    | username                    |   password    |    
    | husseinmohanad@gmail.com    |   Test1234    |
    | alinka.khayrullina@gmail.com|   Test1234    |
    
   @invalidLogin
  Scenario Outline:: Login as a user with invalid credentials
    Given navigate to the Prime Tech Invoice Applicationlogin page
    Then enter  invalid "<username>" and invalid "<password>"
    And click on the login button
    Then the system should display a flash error message
    And user is not logged in 
    
     Examples: 
    | username                 |   password              |    
    | Invalidemail@yaho.com    |   invalidpassword123    |
    
     @emptyLogin
    Scenario Outline:: Login as a user leaving username and password fields empty
    Given navigate to the Prime Tech Invoice Applicationlogin page
    Then enter  invalid "<username>" and invalid "<password>"
    And click on the login button
    Then the system should display inline error messages
    And user is not logged in 
    
      Examples: 
    | username                 |   password              |    
    |     |      |
    
    @forgotPassword
    Scenario: Forgot Password Link
    Given navigate to the Prime Tech Invoice Applicationlogin page
    And user click on the Forgot PAssword Link
    Then the user should be directed to a new page
    And user should see Textbox titeld Enter Email
    And user should see button titeld Send Rest Link
    And user should see Link titeld Back To Login
    
    
    
    
    
    
   
    
    
 
 
