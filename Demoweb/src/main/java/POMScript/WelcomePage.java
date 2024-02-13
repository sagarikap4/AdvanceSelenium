package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {
	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerlink;
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginlink;
	
	@FindBy(id="topcartlink")
	private WebElement shoppingcartlink;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logoutlink;
	
	
	
	//To create getter
	public WebElement getRegister()
	{
		return registerlink;
		
	}
	public WebElement getLogin()
	{
		return loginlink;
		
	}
	public WebElement getShoppingcart()
	{
		return shoppingcartlink;
		
	}
	public WebElement getLogoutButton()
	{
		return logoutlink;
		
		
	}	

}
