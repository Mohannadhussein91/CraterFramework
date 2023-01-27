@CustomerFunctionality 
Feature: CraterCustomerFunctionality

  @CustomerPage @smokeTest
  Scenario: Verifying Customer Page Components

    Given Navigate to the Prime Tech Invoice Application Customer Menu Link
    And User should see an  icon titled Customer with the menu navigation path as Home/Customers
    And user sees the button Filter icon
    And user sees the button titled +New Customer
    And a table with the columns: Select All checkbox, NAME, PHONE, AMOUNT DUE, ADDED ON, A link icon showing three dots: Edit with an edit icon, View with a view icon, Delete with a delete icon
  
    
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
   Then the user should see customer information
  
   @CustomerPageOther
   Scenario: Verifying Customers Dashboard
   Given Navigate to the Prime Tech Invoice Application Customer Menu Link
   Then A page with the data should appear
    And User should see an  icon titled Customer with the menu navigation path as Home/Customers
    And the button user sees Filter icon
    And user navigates to button titled +New Customer
    And a table with the columns: Select All checkbox, NAME, PHONE, AMOUNT DUE, ADDED ON, A link icon showing three dots: Edit with an edit icon, View with a view icon, Delete with a delete icon
    And user should see numbered pagination text Total customers ‘results’
    And user is able to click on the buttons to navigate the page
    
      
    

