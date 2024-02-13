package TestScript;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sample4 {
	@Test
	public void t1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demowebshop.tricentis.com/");
		String image=driver.getScreenshotAs(OutputType.BASE64);
		ExtentSparkReporter esr=new ExtentSparkReporter("D:\\QSPIDER\\java\\java eclisp\\Demoweb\\ExtentReport\\Report.html");
		ExtentReports er=new ExtentReports();
		er.attachReporter(esr);
		ExtentTest et = er.createTest("Sample3");//class name
		et.log(Status.INFO,"Test case successfully attached");
		et.addScreenCaptureFromBase64String(image);
		er.flush();
	}

}
