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
@CustomerFunctionality @SmokeTest
Feature: CraterCustomerFunctionality

  @CustomerPage
  Scenario: Verifying Customer Page Components
  Given Navigate to the Prime Tech Invoice Application Customer Menu Link
    And User should see an  icon titled Customer with the menu navigation path as Home/Customers
    And the button user sees Filter icon
    And user navigates to button titled +New Customer
    And a table with the columns: Select All checkbox, NAME, PHONE, AMOUNT DUE, ADDED ON, A link icon showing three dots: Edit with an edit icon, View with a view icon, Delete with a delete icon
    And user should see numbered pagination text Total customers ‘results’
    And user is able to click on the buttons to navigate the page
    
      @CustomerPageNavigation
  Scenario: Verifying Icons On Customer Page
  Given Navigate to the Prime Tech Invoice Application Customer Menu Link 
  Then user should be able to click on +New Customer
    Then user should see the following sections Basic Info, Portal Access, Billing Address, Shipping Address
    Then user clicks on the Save Customer
    Then the following message should appear Success!Customer created successfully 
    And  a close button should appear to the right 
    And The flash message should disappear within five seconds or less
    Then The user can close the flash message by clicking on the X button. 
    Then The user should be navigated to the Sales and expenses page.
    Then user sees the following: Basic Info, Portal Access, Billing Address, Shipping Address
    And the customer information should be saved
    Then the user should see customer's information
  
   @CustomerPageOther
   Scenario: Verifying Customers Dashboard
   Given Navigate to the Prime Tech Invoice Application Customer Menu Link
   Then A page with the data should appear
   And user can select Check box for each customer row
   And user sees a column with Name, showing all entered customers
   And user sees a phone column 
   And user sees the Amount Due column 
   And user sees Added On column 
   And user can nagive to More link represented by three dots for each row in the table
    

