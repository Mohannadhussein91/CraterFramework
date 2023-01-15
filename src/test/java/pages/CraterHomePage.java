package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CraterHomePage {

	public CraterHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath =("//input[@name = 'email']"))
	public WebElement firstTextBoxName;
	
	@FindBy(xpath =("//div[contains(text() ,'Email')]"))
	public WebElement firstFieldTextTitle;
	
	@FindBy(xpath =("//input[@name = 'password']"))
	public WebElement secondTextBoxName;
	
	@FindBy(xpath =("//div[contains(text() ,'Password')]"))
	public WebElement secondFieldTextTitle;
	
	
	
	
	

}
