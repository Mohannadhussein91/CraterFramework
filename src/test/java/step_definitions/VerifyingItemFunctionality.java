package step_definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterItemPage;
import pages.CraterLoginPage;
import pages.DashboradPage;
import utils.BrowserUtils;
import utils.DButils;
import utils.Driver;

public class VerifyingItemFunctionality {
	CraterLoginPage login = new CraterLoginPage();
	DashboradPage dashborad = new DashboradPage();
	CraterItemPage itemsPage = new CraterItemPage();
	BrowserUtils utils = new BrowserUtils();
	VerifyingLoginPageElements valid = new VerifyingLoginPageElements();
	DButils dbutils = new DButils();
	String username= "husseinmohanad@gmail.com";
	String password = "Test1234";
	
	@Given("Navigate to the Items Menu Link")
	public void navigate_to_the_items_menu_link() throws InterruptedException {
		login.Login(username, password);
		valid.click_on_the_login_button();
		Thread.sleep(3000);
	    dashborad.commonPageItemsLink.click();
	}
	
	// verified that we are on the item page

	@Given("User should be navigated to a page titled Items")
	public void user_should_be_navigated_to_a_page_titled_items() throws InterruptedException {
	   Thread.sleep(2000);
	    String actualPageTitle= Driver.getDriver().getCurrentUrl();
	    Assert.assertTrue(actualPageTitle.contains("items"));
	}

	@Given("User should see the menu navigation path as Home\\/Items placed under Items")
	public void user_should_see_the_menu_navigation_path_as_home_items_placed_under_items() {
	  
	}

	@Given("User should see a secondary button titled Filter with a filter icon")
	public void user_should_see_a_secondary_button_titled_filter_with_a_filter_icon() {
	   
	}

	@Given("User should see a primary button titled +Add Item")
	public void user_should_see_a_primary_button_titled_add_item() {
		// verify that user is on the Add Items page
				Assert.assertTrue(itemsPage.addItemButton.isDisplayed());
	}

	@Given("User should see a table with five columns")
	public void user_should_see_a_table_with_five_columns() {
	   
	}

	@Given("A link icon showing three dots options: Edit and Delete with icons")
	public void a_link_icon_showing_three_dots_options_edit_and_delete_with_icons() {
	   
	}

	@When("User click on +Add Item")
	public void user_click_on_add_item() {
		itemsPage.addItemButton.click();
	}

	@Then("User should be directed to a new page with name and price and unit and description")
	public void user_should_be_directed_to_a_new_page_with_name_and_price_and_unit_and_description() throws InterruptedException {
		// verify that the add item add on displays
		Thread.sleep(2000);
		Assert.assertTrue(itemsPage.newItemHeaderText.isDisplayed());
	}

	@When("User Enters {string} and {string} and Price and {string}")
	public void user_enters_and_and_price_and(String name, String price, String description) {
	    name = "Testy Besties is for lovers";
		price ="1000.00";
		description="It was very fun Bootcamp, thank you all!";
		utils.sendKeysWithActionsClass(itemsPage.addItemNameField, name);
		utils.sendKeysWithActionsClass(itemsPage.addItemPriceField, price);
		
		//itemsPage.addItemNameField.sendKeys(name);
		//itemsPage.addItemPriceField.sendKeys(price);
		itemsPage.addItemUnitField.click();
		// wait until the pc unit is display
		utils.waitUntilElementVisible(itemsPage.pc_unit);
		// click on the pc unit
		itemsPage.pc_unit.click();
		utils.sendKeysWithActionsClass(itemsPage.addItemDescription, description);
		
		
	}

	@Then("User clicks on Save Item button")
	public void user_clicks_on_save_item_button() {
		itemsPage.saveItemButton.click();
	}

	@Then("User should see a flash message with Success!")
	public void user_should_see_a_flash_message_with_success() {
		//wait until the item create success message displays
	     utils.waitUntilElementVisible(itemsPage.itemCreateSuccessMessage);
		 Assert.assertTrue(itemsPage.itemCreateSuccessMessage.isDisplayed());
	}


	@Then("User should able to view item added within the table")
	public void user_should_able_to_view_item_added_within_the_table() {
		WebElement newItem = Driver.getDriver().findElement(By.xpath("//a[text()='Testy Besties is for lovers']"));
		Assert.assertTrue(newItem.isDisplayed());
	}

	@Then("Item should be created on the Database")
	public void item_should_be_created_on_the_database() {
		// verify the add item with database 
	    String name = "Testy Besties is for lovers";
		String query = "Select * From items Where name='Testy Besties is for lovers'";
		 List<String> itemsData = dbutils.selectArecord(query);
		    System.out.println("Item Id: " + itemsData.get(0));
		    System.out.println("Item Name:" + itemsData.get(1));
		    Assert.assertEquals(itemsData.get(1), name);
		    
	}
	
	
	
	   
	
	

}
