#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
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
    
     @invalidLogin
  Scenario Outline:: Login as a user with valid credentials
    Given navigate to the Prime Tech Invoice Applicationlogin page
    Then enter  invalid "<username>" and invalid "<password>"
    And click on the login button
    Then the system should display a flash error message
    And user is not logged in
    
     Examples: 
    | username                 |   password              |    
    | Invalidemail@yaho.com    |   invalidpassword123    |
 
 
