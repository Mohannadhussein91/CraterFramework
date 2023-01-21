package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CustomerPage {
	public CustomerPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//h3[contains(text(), 'Customers')]" )
	public WebElement customers;
	
	@FindBy (linkText = "Home")
	public WebElement homeText;
	
	@FindBy (linkText = "Customers")
	public WebElement customerText;
	
	@FindBy (xpath = "//button[@class='inline-flex whitespace-nowrap items-center border"
			+ " font-medium focus:outline-none focus:ring-2 focus:ring-offset-2 px-4 py-2 text-sm"
			+ " leading-5 rounded-md border-transparent  border-solid border-primary-500 "
			+ "font-normal transition ease-in-out duration-150 text-primary-500 hover:bg-primary-200"
			+ " shadow-inner focus:ring-primary-500']")
	public WebElement filterBtn;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[1]/div[2]/div/button[1]/text()")
	public WebElement filter;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[1]/div[2]/div/button[1]/svg")
	public WebElement filterIcon;
	
	@FindBy (xpath ="//button[@class='inline-flex whitespace-nowrap items-center border font-medium focus:outline-none "
			+ "focus:ring-2 focus:ring-offset-2 px-4 py-2 text-sm leading-5 rounded-md border-transparent "
			+ "shadow-sm text-white bg-primary-600 hover:bg-primary-700 focus:ring-primary-500']" )
	public WebElement plusNewCustomer;
	
	@FindBy (xpath = "//div[@class='relative table-container']")
    public WebElement table;	
	
	@FindBy (xpath = "//input[@id='check_nv1ellj89']")
	public WebElement selectAllcheckbox;
	
	@FindBy (xpath = "//th[contains(text(),'Name')]")
	public WebElement name;
	
	@FindBy (xpath = "//th[contains(text(),'Phone')]")
	public WebElement phone;
	
	@FindBy (xpath = "//th[contains(text(),'Amount Due')]")
	public WebElement amountDue;
	
	@FindBy (xpath = "//th[contains(text(),'Added On')]")
public WebElement addedOn;
	
	@FindBy (css = "#headlessui-menu-button-320")
	public WebElement threeDotIcon;
	
	@FindBy (xpath = "//*[@id=\"headlessui-menu-item-137\"]")
	public WebElement option1;
	
	
	@FindBy(xpath = "//*[@id=\"headlessui-menu-item-171\"]")
	public WebElement option2;
	
	@FindBy(xpath = "//*[@id=\"headlessui-menu-item-181\"]")
	public WebElement option3;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[1]/p")
	public WebElement paginationText;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[2]/nav")
	public WebElement pageNavigation;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[2]/nav/a[1]")
	public WebElement leftArrow;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[2]/nav/a[5]")
	public WebElement rightArrow;
	
	@FindBy(xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[2]/nav/a[2]")
	public WebElement numbers; 
	
	
	


	


	
}
