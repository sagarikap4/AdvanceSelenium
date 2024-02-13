package TestScript;


import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMScript.LoginPage;
import POMScript.WelcomePage;

public class LoginTestCases extends BaseClass {
	@Test
	public void t1() 
	{
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		Reporter.log(username,true);
		Reporter.log(password,true);
		
		
		WelcomePage wp=new WelcomePage(driver);
		wp.getLogin().click();
		
		LoginPage lp=new LoginPage(driver);
		//Thread.sleep(200);
		lp.getLoginEmail().sendKeys(username);
		lp.getLoginPassword().sendKeys(password);
		lp.getLoginButton().click();
	}

}
