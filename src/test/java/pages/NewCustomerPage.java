package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class NewCustomerPage {

	public NewCustomerPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy (xpath = "/html/body/div/main/div/div/div[1]/div[2]/div/button[2]")
	public WebElement NewCustomer;
	
	@FindBy (xpath = "/html/body/div/main/div/div/form/div[2]/div/div[1]/h6")
	public WebElement BasicInfo;
	
	@FindBy (xpath = "/html/body/div/main/div/div/form/div[2]/div/div[2]/h6")
	public WebElement PortalAccess; 
	
	@FindBy (xpath = "/html/body/div/main/div/div/form/div[2]/div/div[3]/h6")
	public WebElement BillingAddress; 
	
	@FindBy (xpath = "/html/body/div/main/div/div/form/div[2]/div/div[5]/h6")
	public WebElement ShippingAddress; 
	
	@FindBy (xpath = "/html/body/div/main/div/div/form/div[1]/div[2]/div/button")
	public WebElement SaveCustomerBtn;
	
	@FindBy (xpath = "/html/body/div/div[1]/div/div/div")
	public WebElement FlashMessage;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[3]/div/div[2]/h6")
	public WebElement BasicInfoRegistrationPage;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[3]/div/div[2]/div[1]/div[1]/div/label")
	public WebElement DisplayNameRegistrationPage;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[3]/div/div[2]/div[1]/div[2]/div/label")
	public WebElement PrimaryContactNameRegistrationPage;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[3]/div/div[2]/div[1]/div[3]/div/label")
	public WebElement EmailRegistrationPage;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[3]/div/div[2]/div[2]/div[1]/div/label")
	public WebElement CurrencyRegistrationPage;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[3]/div/div[2]/div[2]/div[2]/div/label")
	public WebElement PhoneNumberRegistrationPage; 
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[3]/div/div[2]/div[2]/div[3]/div/label")
	public WebElement website; 
	
	
	
	
	
	
}
	


