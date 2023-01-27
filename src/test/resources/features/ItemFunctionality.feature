@ItemFunctionality  @SmokeTest
Feature: Crater Item Functionality

   @ItemPage
  Scenario: Verifying Item Page Components
    Given Navigate to the Items Menu Link
    And User should be navigated to a page titled Items
    And User should see the menu navigation path as Home/Items placed under Items
    And User should see a secondary button titled Filter with a filter icon
    And User should see a primary button titled +Add Item
    And User should see a table with five columns
    And A link icon showing three dots options: Edit and Delete with icons
    
   @AddItemComponents 
  Scenario: Verifying Add Item UI components
  Given Navigate to the Items Menu Link
  When User click on +Add Item
  Then User should be directed to a new page with name and price and unit and description
    
   @AddItem
  Scenario: Add New Item
  Given Navigate to the Items Menu Link
  When User click on +Add Item
  And User Enters "Name" and "Unit" and Price and "Description"
  Then User clicks on Save Item button
  Then User should see a flash message with Success!
  And User should be navigated to a page titled Items 
  And User should able to view item added within the table
  And Item should be created on the Database
  
  
  
  
    
