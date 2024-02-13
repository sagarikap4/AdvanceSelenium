package TestScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import POMScript.BillingAddressPage;

public class BillingAddressTestCases extends BaseClass{
	@Test(dataProvider="credential",priority=3,dependsOnMethods="digitalDownloadTestCase")
	public void billing(String FN,String LN,String Email,String Company,
			String Country,String Add1,String Add2,
			String Zip,String PN,String Fax)
	{
		BillingAddressPage bp=new BillingAddressPage(driver);
		bp.getFN().sendKeys(FN);
		bp.getLN().sendKeys(LN);
		bp.getEmail().sendKeys(Email);
		bp.getCompany().sendKeys(Company);
		
		WebElement country = driver.findElement(By.name("BillingNewAddress.CountryId"));
		Select s=new Select(country);
		s.selectByIndex(2);
		
		WebElement state = driver.findElement(By.name("BillingNewAddress.StateProvinceId"));
		Select s1=new Select(state);
		s.selectByIndex(2);
		
		bp.getAdd1().sendKeys(Add1);
		bp.getAdd2().sendKeys(Add2);
		bp.getZip().sendKeys(Zip);
		bp.getPN().sendKeys(PN);
		bp.getFax().sendKeys(Fax);
		bp.getContinueButton().click();
	}
	@DataProvider(name="credential")
	public Object[][] data() throws IOException
	{
		return ReadExcelUtility.fetchAllData("sheet3");
		
	}
	

}
