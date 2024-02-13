package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingAddressPage extends BasePage {
	public BillingAddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@name='BillingNewAddress.FirstName']")
	private WebElement Firstname; 
	public WebElement getFN()
	{
		return Firstname;
			
	}
	
	@FindBy(xpath="//input[@name='BillingNewAddress.LastName']")
	private WebElement Lastname; 
	public WebElement getLN()
	{
		return Lastname;
			
	}
	
	@FindBy(xpath="//input[@name='BillingNewAddress.Email']")
	private WebElement Email;
	public WebElement getEmail()
	{
		return Email;
			
	}
	
	@FindBy(xpath="//input[@name='BillingNewAddress.Company']")
    private WebElement Company; 
	public WebElement getCompany()
	{
		return Company;
			
	}
	
	
	@FindBy(xpath="//input[@name='BillingNewAddress.City']")
    private WebElement City; 
	public WebElement getCity()
	{
		return City;
			
	}
	
	@FindBy(xpath="//input[@name='BillingNewAddress.Address1']")
    private WebElement Address1;
	public WebElement getAdd1()
	{
		return Address1;
			
	}
	
	@FindBy(xpath="//input[@name='BillingNewAddress.Address2']")
    private WebElement Address2;
	public WebElement getAdd2()
	{
		return Address2;
			
	}
	
	@FindBy(xpath="//input[@name='BillingNewAddress.ZipPostalCode']")
    private WebElement Zip; 
	public WebElement getZip()
	{
		return Zip;
			
	}
	
	@FindBy(xpath="//input[@name='BillingNewAddress.PhoneNumber']")
    private WebElement Phonenumber;
	public WebElement getPN()
	{
		return Phonenumber;
		
			
	}
	
	@FindBy(xpath="//input[@name='BillingNewAddress.FaxNumber']")
    private WebElement Faxnumber;
	public WebElement getFax()
	{
		return Faxnumber;
			
	}
	
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	public WebElement getContinueButton()
	{
		return continueButton;
		
	}
	
	

}
