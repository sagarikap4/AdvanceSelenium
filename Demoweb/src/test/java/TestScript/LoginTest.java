package TestScript;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import POMScript.LoginPage;
import POMScript.WelcomePage;

public class LoginTest extends BaseClass {
	@Test(dataProvider="credential",priority=1)
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
	@DataProvider(name="credential")
	public Object[][] data() throws IOException
	{
		return ReadExcelUtility.fetchAllData("sheet1");
		
	}

}
