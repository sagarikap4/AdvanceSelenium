package TestScript;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import POMScript.RegisterPage;
import POMScript.WelcomePage;

public class RegistrationTest extends BaseClass {
	@Test(dataProvider="credential")
	public void TestCase1(String gender,String firstname,String lastname,String 
			emailid,String password ,String confirmpassword  )
	{
		WelcomePage wp=new WelcomePage(driver);
		wp.getRegister().click();
		
		RegisterPage rp=new RegisterPage(driver);
		rp.getGender().click();
		rp.getFN().sendKeys(firstname);
		rp.getLN().sendKeys(lastname);
		rp.getEmail().sendKeys(emailid);
		rp.getPW().sendKeys(password);
		rp.getCPW().sendKeys(confirmpassword);
		rp.getRegisterButton().click();		
	}
	@DataProvider(name="credential")
	public Object[][] data() throws IOException
	{
		return ReadExcelUtility.fetchAllData("sheet2");
		
	}

}

