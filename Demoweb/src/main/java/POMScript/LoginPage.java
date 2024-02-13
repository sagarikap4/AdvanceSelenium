package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath ="//input[@name='Email']")
	private WebElement loginEmail;
	
	@FindBy(xpath ="//input[@name='Password']")
	private WebElement loginPassword;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;
	
	public WebElement getLoginEmail()
	{
		return loginEmail;
		
	}
	public WebElement getLoginPassword()
	{
		return loginPassword;
		
	}
	public WebElement getLoginButton()
	{
		return loginButton;
		
		
	}
	//business logic
	//public void loginfunction()
	//{
		//loginEmail.sendKeys("ghi@gmail.com");
		//loginPassword.sendKeys("ghi@123");
		//loginButton.click();
		
		
	}
	


