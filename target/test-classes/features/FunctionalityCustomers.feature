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
  Scenario: Navigate to the Prime Tech Invoice Application Customer Menu Link and clicking on +New Customer
    Given user should see the following sections Basic Info", "Portal Access", "Billing Address", "Shipping Address"
   And user clicks on the 'Save Customer'
    Then the following message should appear "Success!Customer created successfully" with a close button to the right. 
    And The flash message should disappear within 5 seconds or less
    Then The user can close the flash message by clicking on the 'X' button. 
    Then The user should be navigated to the Sales and expenses page.
    Then user sees the following: "Basic Info", "Portal Access", "Billing Address", "Shipping Address"
    And the customer information should be saved
    Then should display "Basic Info", "Portal Access", "Billing Address", "Shipping Address"
  
   @CustomerPageOther
   Scenario: Navigate to the Prime Tech Invoice Application 'Customer' Menu Link
   Given: A page with the data should appear
   And user can select Check box for each customer row
   And user sees a column with Name, showing all entered customers
   And user sees a phone column 
   And user sees the Amount Due column 
   And user sees Added On column 
   And user can nagive to More link represented by three dots for each row in the table
    

