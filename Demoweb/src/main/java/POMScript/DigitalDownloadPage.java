package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalDownloadPage extends BasePage  {
	public DigitalDownloadPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='header-menu']/ul[1]/li[5]/a[@href='/digital-downloads']")
	private WebElement digitaldownload;
	
	public WebElement getDigitalDownload()
	{
		return digitaldownload;		
		
	}
    
	@FindBy(xpath="(//div[contains(@class,'product-grid')]/descendant::input)[1]")
	private WebElement prod1;
	public WebElement getProduct1()
	{
		return prod1;
	}
	
	@FindBy(xpath="(//div[contains(@class,'product-grid')]/descendant::input)[2]")
	private WebElement prod2;
	public WebElement getProduct2()
	{
		return prod2;
	}
	
	@FindBy(xpath="(//div[contains(@class,'product-grid')]/descendant::input)[3]")
	private WebElement prod3;
	public WebElement getProduct3()
	{
		return prod3;
	}

}
