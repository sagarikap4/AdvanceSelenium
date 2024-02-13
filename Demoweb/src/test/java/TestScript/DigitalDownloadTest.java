package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMScript.DigitalDownloadPage;
import POMScript.ShoppingCartPage;

public class DigitalDownloadTest extends BaseClass {
	@Test()
	public void digitalDownloadTestCase() throws Throwable
	{
		DigitalDownloadPage dp=new DigitalDownloadPage(driver);
		Thread.sleep(2000);
		dp.getDigitalDownload().click();
		Reporter.log("clicked on digital download link",true);
		Thread.sleep(2000);
		dp.getProduct1().click();
		Reporter.log("clicked on 3r album",true);
		
		ShoppingCartPage scp=new ShoppingCartPage(driver);
		scp.getShoppingCart().click();
		scp.getcartcheckbox().click();
		scp.getCheckbox().click();
		scp.getCheckout().click();
		Reporter.log("clicked on checkout",true);
	}
	

}
