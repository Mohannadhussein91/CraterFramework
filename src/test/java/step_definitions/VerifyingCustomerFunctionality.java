package step_definitions;


import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.CraterLoginPage;
import pages.CustomerPage;
import pages.DashboradPage;

public class VerifyingCustomerFunctionality {
	CraterLoginPage login = new CraterLoginPage();
	DashboradPage dashborad = new DashboradPage();
	CustomerPage customer = new CustomerPage();
	VerifyingLoginPageElements valid = new VerifyingLoginPageElements();
	String username= "husseinmohanad@gmail.com";
	String password = "Test1234";
	@Given("Navigate to the Prime Tech Invoice Application Customer Menu Link")
	public void navigate_to_the_prime_tech_invoice_application_customer_menu_link() throws InterruptedException {
		login.Login(username, password);
		valid.click_on_the_login_button();
		Thread.sleep(3000);
	    dashborad.Customers.click();

	}

	@Given("User should see an  icon titled Customer with the menu navigation path as Home\\/Customers")
	public void user_should_see_an_icon_titled_customer_with_the_menu_navigation_path_as_home_customers() {

	  Assert.assertTrue(customer.homeText.isDisplayed());
	  Assert.assertTrue(customer.customerText.isDisplayed());
	}
	@And("user sees the button Filter icon")
	public void user_sees_the_button_filter_icon() throws InterruptedException {
		Thread.sleep(5000);
	   Assert.assertTrue(customer.filterBtn.isDisplayed());
	}
	@And("user sees the button titled +New Customer")
	public void user_sees_the_button_titled_new_customer() {
		Assert.assertTrue(customer.plusNewCustomer.isDisplayed());
		
	}
	@And("a table with the columns: Select All checkbox, NAME, PHONE, AMOUNT DUE, ADDED ON, A link icon showing three dots: Edit with an edit icon, View with a view icon, Delete with a delete icon")
	public void a_table_with_the_columns_select_all_checkbox_name_phone_amount_due_added_on_a_link_icon_showing_three_dots_edit_with_an_edit_icon_view_with_a_view_icon_delete_with_a_delete_icon() throws InterruptedException {
	   Thread.sleep(3000);
//	   Assert.assertTrue(customer.selectAllcheckbox.isDisplayed());
	   Assert.assertTrue(customer.name.isDisplayed());
	   Assert.assertTrue(customer.phone.isDisplayed());
	   Assert.assertTrue(customer.amountDue.isDisplayed());
	   Assert.assertTrue(customer.addedOn.isDisplayed());
//	   Thread.sleep(3000);
//	   customer.threeDotIcon.click();
//	   Assert.assertTrue(customer.option1.isDisplayed());
//	   Assert.assertTrue(customer.option2.isDisplayed());
//	   Assert.assertTrue(customer.option3.isDisplayed());
//	   
	   
	

}
}
