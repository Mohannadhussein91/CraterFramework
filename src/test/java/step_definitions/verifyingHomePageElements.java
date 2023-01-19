package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CraterHomePage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class verifyingHomePageElements {
	CraterHomePage page= new CraterHomePage();
	BrowserUtils browser = new BrowserUtils();
	
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


}
