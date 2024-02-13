package TestScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import POMScript.BillingAddressPage;
import POMScript.DigitalDownloadPage;
import POMScript.LoginPage;
import POMScript.ShoppingCartPage;
import POMScript.WelcomePage;

public class SystemTestCases extends BaseClass {
	@Test(dataProvider="LoginTestCase",priority=1)
	public void LoginTestCase(String loginEmail,String loginPassword) throws InterruptedException
	{
		WelcomePage wp=new WelcomePage(driver);
		wp.getLogin().click();
		
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(200);
		lp.getLoginEmail().clear();
		lp.getLoginEmail().sendKeys(loginEmail);
		lp.getLoginPassword().clear();
		lp.getLoginPassword().sendKeys(loginPassword);
		lp.getLoginButton().click();
	}
	@DataProvider(name="LoginTestCase")
	public Object[][] data1() throws IOException
	{
		return ReadExcelUtility.fetchAllData("sheet1");
		
	}
	
	//Digital download
	@Test(priority=2)
	public void digitalDownloadTestCase() throws Throwable
	{
		DigitalDownloadPage dp=new DigitalDownloadPage(driver);
		Thread.sleep(2000);
		dp.getDigitalDownload().click();
		Reporter.log("clicked on digital download link",true);
		Thread.sleep(2000);
		dp.getProduct2().click();
		Reporter.log("clicked on 3r album",true);
		
		ShoppingCartPage scp=new ShoppingCartPage(driver);
		scp.getShoppingCart().click();
		scp.getcartcheckbox().click();
		scp.getCheckbox().click();
		scp.getCheckout().click();
		Reporter.log("clicked on checkout",true);
	}
	//Checkout
	@Test(dataProvider="billing",priority=3)
	public void billing(String Company,
			String Add1,String Add2,
			String Zip,String PN,String Fax)
	{
		BillingAddressPage bp=new BillingAddressPage(driver);
		//bp.getFN().clear();
		//bp.getFN().sendKeys(FN);
		//Reporter.log("Enter 1st name",true);
		//bp.getLN().clear();
		//bp.getLN().sendKeys(LN);
		//Reporter.log("Enter last name",true);
		//bp.getEmail().clear();
		//bp.getEmail().sendKeys(Email);
		//Reporter.log("Enter Email",true);
		bp.getCompany().sendKeys(Company);
		Reporter.log("Enter company",true);
		
		
		WebElement country = driver.findElement(By.name("BillingNewAddress.CountryId"));
		Select s=new Select(country);
		s.selectByIndex(6);
		Reporter.log("Enter country",true);
		
		WebElement state = driver.findElement(By.name("BillingNewAddress.StateProvinceId"));
		Select s1=new Select(state);
		s.selectByIndex(6);
		Reporter.log("Enter state",true);
		
		bp.getAdd1().sendKeys(Add1);
		Reporter.log("Enter add1",true);
		bp.getAdd2().sendKeys(Add2);
		Reporter.log("Enter add2",true);
		bp.getZip().sendKeys(Zip);
		Reporter.log("Enter zip",true);
		bp.getPN().sendKeys(PN);
		Reporter.log("Enter phone number",true);
		bp.getFax().sendKeys(Fax);
		Reporter.log("Enter Fax",true);
		bp.getContinueButton().click();
	}
	@DataProvider(name="billing")
	public Object[][] data2() throws IOException
	{
		return ReadExcelUtility.fetchAllData("sheet3");
		
	}
	


}
