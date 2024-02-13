package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement Shoppingcart;
	public WebElement getShoppingCart()
	{
		return Shoppingcart;	
	}
	
	@FindBy(id="termsofservice")
	private WebElement Checkbox;
	public WebElement getCheckbox()
	{
		return Checkbox;	
	}
	
	@FindBy(id="checkout")
	private WebElement Checkout;
	public WebElement getCheckout()
	{
		return Checkout;
		
	}
	
	@FindBy(name="removefromcart")
	private WebElement cartcheckbox;
	public WebElement getcartcheckbox()
	{
		return cartcheckbox;
		
	}

}
