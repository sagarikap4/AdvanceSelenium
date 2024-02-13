package TestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sample3 {
	@Test
	public void t1()
	{
		ExtentSparkReporter esr=new ExtentSparkReporter("D:\\QSPIDER\\java\\java eclisp\\Demoweb\\ExtentReport\\Report.html");
		ExtentReports er=new ExtentReports();
		er.attachReporter(esr);
		ExtentTest et = er.createTest("Sample3");//class name
		et.log(Status.INFO,"Test case successfully attached");
		er.flush();
	}

}
