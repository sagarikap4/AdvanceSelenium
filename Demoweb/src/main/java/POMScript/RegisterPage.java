package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage  {
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="gender-male")
	private WebElement gender;
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	
	@FindBy(id="LastName")
	private WebElement lastname;
	
	@FindBy(id="Email")
	private WebElement emailid;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpassword;
	
	@FindBy(name="register-button")
	private WebElement Registerbutton;
	
	
	
	
	public WebElement getGender()
	{
		return gender;	
	}
	public WebElement getFN()
	{
		return firstname;	
	}
	public WebElement getLN()
	{
		return lastname;	
	}
	public WebElement getEmail()
	{
		return emailid;	
	}
	public WebElement getPW()
	{
		return password;	
	}
	public WebElement getCPW()
	{
		return confirmpassword;	
	}
	public WebElement getRegisterButton()
	{
		return Registerbutton;
	
		
		
	}
	//Business Logic
	//public void registrationfunction()
	//{
		//gender.click();
		//firstname.sendKeys("aaa");
		//lastname.sendKeys("sss");
		//emailid.sendKeys("sss@gmail.com");
		//password.sendKeys("Sss@123");
		//confirmpassword.sendKeys("Sss@123");
		//Registerbutton.click();
		
	}
	



