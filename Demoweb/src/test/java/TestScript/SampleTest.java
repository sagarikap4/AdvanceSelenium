package TestScript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;

public class SampleTest  {
	@Test(dataProvider="credential")
	public void T1(String loginEmail,String loginPassword)
	{
		Reporter.log("T1 executed",true);
		Reporter.log(loginEmail,true);
		Reporter.log(loginPassword,true);
		
	}
	@DataProvider(name="credential")
	public Object[][] data() throws IOException
	{
		return ReadExcelUtility.fetchAllData("sheet1");
		
	}
}
