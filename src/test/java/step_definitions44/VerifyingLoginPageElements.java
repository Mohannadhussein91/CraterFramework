package step_definitions44;



import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CraterLoginPage;
import pages.CraterLoginPage;
import pages.DashboradPage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class VerifyingLoginPageElements {
	CraterLoginPage page= new CraterLoginPage();
	BrowserUtils browser = new BrowserUtils();
	DashboradPage dashboard = new DashboradPage();
	
	
	// verifying login page components
	@Given("navigate to the Prime Tech Invoice Applicationlogin page")
	public void navigate_to_the_prime_tech_invoice_applicationlogin_page() {
		Driver.getDriver().get(TestDataReader.getProperty("craterUrl"));
	}
	
	@Then("It should display the Login page with page title Crater Crater - Self Hosted Invoicing Platform")
	public void it_should_display_the_login_page_with_page_title() {
	  String pageTitle = Driver.getDriver().getTitle();
	  Assert.assertEquals(pageTitle , "Crater - Self Hosted Invoicing Platform");
	  Assert.assertTrue(page.Craterlogo.isDisplayed());
	}
	@And("Text box with the Label Email")
	public void text_box_with_the_label() {
	   Assert.assertTrue(page.firstTextBoxName.isDisplayed());
	   String firstBoxLabel = page.firstFieldTextTitle.getText();
	   Assert.assertEquals(firstBoxLabel, "Email *");
	}
	
	@And("Text box with the Label Password")
	public void text_box_with_the_label_password() {
		Assert.assertTrue(page.secondTextBoxName.isDisplayed());
		String secondBoxLabel = page.secondFieldTextTitle.getText();
		Assert.assertEquals(secondBoxLabel, "Password *");
	}
	
	@And("A link titled ‘Forgot Password?")
	public void a_link_titled_forgot_password() {
	String actualLinkName = page.ForgotPasswordLink.getText();
	Assert.assertEquals(actualLinkName, "Forgot Password?");
	  
	}
	@And("A primary button labeled ‘Login’")
	public void a_primary_button_labeled_login() {
	 Assert.assertTrue(page.loginButton.isDisplayed());
	 String actualButtonText= page.loginButtonlabel.getText();
	 Assert.assertEquals(actualButtonText, "Login");
	}
	
	@And("A Text area with the following text located on the bottom"
			+ " left Copyright @ Crater Invoice, Inc.")
	public void a_text_area_with_the_following_text_located_on_the_bottom_left_copyright_crater_invoice_inc() {
		browser.isElementPresent(page.copyRightText);
		
	}
	
	@And("A Heading located to the right with the following text"
			+ " Simple Invoicing for Individuals Small Businesses")
	public void a_heading_located_to_the_right_with_the_following_text() {
	 browser.isElementPresent(page.headerText);
	}
	@And("A Heading located underneath Heading with the following text Crater helps you track expenses, record payments & generate beautiful invoices & estimates")
	public void a_heading_located_underneath_heading_with_the_following_text() {
	  browser.isElementPresent(page.underHeaderText);
	}
	
	// valid login scenario
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
	
	
	
	// invalid login Scenario
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
	
	// Empty login
	@Then("the system should display inline error messages")
	public void the_system_should_display_inline_error_messages() {
	    String actualInlineErrorTxt = page.Errorinlinemessage.getText();
	    Assert.assertEquals(actualInlineErrorTxt, "Field is required");
	}
	
	// Verifying ForfotPassword Page 
	
	@Given("user click on the Forgot PAssword Link")
	public void user_click_on_the_forgot_p_assword_link() {
	   page.ForgotPasswordLink.click();
	}
	@Then("the user should be directed to a new page")
	public void the_user_should_be_directed_to_a_new_page() throws InterruptedException {
		Thread.sleep(3000);
	    String actualPageTitle = Driver.getDriver().getCurrentUrl();
	    System.out.println(actualPageTitle);
	    Assert.assertTrue(actualPageTitle.contains("forgot-password"));
	}
	@Then("user should see Textbox titeld Enter Email")
	public void user_should_see_textbox_titeld_enter_email() {
	 String actualtxtEmail= page.resetPassword.getText();
	 Assert.assertTrue(actualtxtEmail.contains("Enter email"));
	}
	@Then("user should see button titeld Send Rest Link")
	public void user_should_see_button_titeld_send_rest_link() {
		 String actualRestLinkTxt =page.sendRestLinkButton.getText();
		 Assert.assertEquals(actualRestLinkTxt, "Send Reset Link");
	}
	@Then("user should see Link titeld Back To Login")
	public void user_should_see_link_titeld_back_to_login() {
	  String actualLinkTxt=page.backToLoginLink.getText();
	  Assert.assertEquals(actualLinkTxt, "Back to Login?");
	}



}
