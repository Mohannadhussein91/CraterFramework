package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CraterHomePage;
import pages.DashboradPage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class LoginFunctionality {
	BrowserUtils browser = new BrowserUtils();
	CraterHomePage page = new CraterHomePage();
	DashboradPage dashboard = new DashboradPage();
	
	@Then("enter a valid {string} and a valid {string}")
	public void enter_a_valid_and_a_valid(String username, String password) {
	    browser.sendKeysWithActionsClass(page.useremail, username);
	    browser.sendKeysWithActionsClass(page.password, password);

	}
	@And("click on the login button")
	public void click_on_the_login_button() {
		page.loginButtonlabel.click();
	  
	}
	@Then("the system should direct to the dashboard page")
	public void the_system_shoul_direct_to_the_dashboard_page() {
		browser.waitUntilElementVisible(dashboard.amountDueText);
		   Assert.assertTrue(dashboard.amountDueText.isDisplayed());
		  
	}
	
	
	
	// invalid Scenario
	@Then("enter  invalid {string} and invalid {string}")
	public void enter_invalid_and_invalid(String username, String password) {
	    browser.sendKeysWithActionsClass(page.useremail, username);
	    browser.sendKeysWithActionsClass(page.password, password);
	}
	
	@Then("the system should display a flash error message")
	public void the_system_should_display_a_flash_error_message() {
	        browser.waitUntilElementVisible(page.invalidUserErrorMessage);
		    Assert.assertTrue(page.invalidUserErrorMessage.isDisplayed());
	}
	
	@And("user is not logged in")
	public void user_is_not_logged_in() {
		Assert.assertTrue(page.loginButton.isDisplayed());
		Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
	
	}

	
	
	
}
