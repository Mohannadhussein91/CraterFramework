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
	public WebElement Customers;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[1]/div[1]/nav/ol")
	public WebElement HomeCustomers;
	
	@FindBy (xpath = "//button[@class='inline-flex whitespace-nowrap items-center "
			+ "border font-medium focus:outline-none focus:ring-2 focus:ring-offset-2 "
			+ "px-4 py-2 text-sm leading-5 rounded-md border-transparent  border-solid "
			+ "border-primary-500 font-normal transition ease-in-out duration-150 "
			+ "text-primary-500 hover:bg-primary-200 shadow-inner focus:ring-primary-500']")
	public WebElement FilterBtn;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[1]/div[2]/div/button[1]/text()")
	public WebElement Filter;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[1]/div[2]/div/button[1]/svg")
	public WebElement FilterIcon;
	
	@FindBy (xpath ="//button[@class='inline-flex whitespace-nowrap items-center border font-medium focus:outline-none "
			+ "focus:ring-2 focus:ring-offset-2 px-4 py-2 text-sm leading-5 rounded-md border-transparent "
			+ "shadow-sm text-white bg-primary-600 hover:bg-primary-700 focus:ring-primary-500']" )
	public WebElement PlusNewCustomer;
	
	@FindBy (xpath = "//div[@class='relative table-container']")
    public WebElement table;	
	
	@FindBy (id = "check_6046lnv9b")
	public WebElement SelectAllcheckbox;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/table/thead/tr/th[2]/text()")
	public WebElement Name;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/table/thead/tr/th[3]/text()")
	public WebElement Phone;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/table/thead/tr/th[4]/text()")
	public WebElement AmountDue;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/table/thead/tr/th[5]/text()")
public WebElement AddedOn;
	
	@FindBy (id = "//*[@id=\"headlessui-menu-button-114\"]")
	public WebElement ThreeDotIcon;
	
	@FindBy (xpath = "//*[@id=\"headlessui-menu-item-137\"]")
	public WebElement Option1;
	
	
	@FindBy(xpath = "//*[@id=\"headlessui-menu-item-171\"]")
	public WebElement Option2;
	
	@FindBy(xpath = "//*[@id=\"headlessui-menu-item-181\"]")
	public WebElement Option3;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[1]/p")
	public WebElement PaginationText;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[2]/nav")
	public WebElement PageNavigation;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[2]/nav/a[1]")
	public WebElement LeftArrow;
	
	@FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[2]/nav/a[5]")
	public WebElement RightArrow;
	
	@FindBy(xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[2]/nav/a[2]")
	public WebElement Numbers; 
	
	
	


	


	
}
