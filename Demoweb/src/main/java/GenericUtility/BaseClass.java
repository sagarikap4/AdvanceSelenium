package GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass extends WebdriverUtility {
	
	@BeforeSuite
	public void connectServer()
	{
		Reporter.log("Connected",true);
	}
	
	@BeforeTest
	public void connectDB()
	{
		Reporter.log("Connected",true);
	}
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		Reporter.log("open",true);
		driver=new ChromeDriver();
		maximize();
		implicitWait();
		
		String url = PropertyFileUtility.propertyData("url");
		getUrl(url);
		
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close",true);
		driver.quit();
	}
	@AfterTest
	public void disconnectDB()
	{
		Reporter.log("disConnected",true);
	}
	@AfterSuite
	public void disconnectServer()
	{
		Reporter.log("disConnected",true);
	}
   


}
