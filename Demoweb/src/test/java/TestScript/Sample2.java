package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void t1()
	{
		Reporter.log("t1 executed",true);
	}
	@Test
	public void t2()
	{
		Reporter.log("t2 executed",true);
	}
	
	

}
