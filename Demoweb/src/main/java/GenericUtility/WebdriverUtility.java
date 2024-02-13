package GenericUtility;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select s;
	public static Actions a;
	public static JavascriptExecutor js;
	public static Properties p;
	
	//Web driver methods------------------------------------------------
	/**
	 * This method is used to access the URL of the application
	 * @param url
	 */
	public static void getUrl(String url)//to make the method parameterized
	{
		driver.get(url);
	}
	/**
	 * This method is used to get the currentURL of the application
	 * @return
	 */
	public static String currentUrl()
	{
		return driver.getCurrentUrl();
	}
	/**
	 * This method is used to get the source-page of the application
	 * @return
	 */
	//page source method
	public static String pageSource()
	{
		return driver.getPageSource();		
	}
	/**
	 * This method is used to get the title of the webpage
	 * @return
	 */
	//For title
	public static String title()
	{
		return driver.getTitle();
		
	}
	
	public static void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	/**
	 * This method is used to get the currentwindow of the application
	 * @return
	 */	
		public static String currentWindow()
		{
			return driver.getWindowHandle();			
		}
		/**
		 * This method is used to get the all-window of the application
		 * @return
		 */
		public static Set<String> allWindow()
		{
			return driver.getWindowHandles();			
		}
		/**
		 * This method is used to maximize the window
		 */
		public static void maximize()	
		{
			driver.manage().window().maximize();				
		}
		/**
		 *This method is used to minimize the window 
		 */
		public static void minimize()	
		{
			driver.manage().window().minimize();	
		}
		/**
		 * This method is used for forward to next window
		 */
		public static void forword()
		{
			driver.navigate().forward();
		}
		/**
		 * This method is used for backward to previous window
		 */
		public static void backward()
		{
			driver.navigate().back();
		}
		/**
		 * refresh the window
		 */
		public static void refresh()
		{
			driver.navigate().refresh();
		}
		/**
		 * To get the URl of the page
		 * @return
		 */
		public static void toUrl(String url)
		{
			driver.navigate().to(url);		
		}
		/**
		 * This method is used to close current window
		 */		
		public static void close()
		{
			driver.close();			
		}
		/**
		 * This method is used to close all window
		 */
		public static void quit()
		{
			driver.quit();			
		}
		//Explicit wait statement-------------------------------------
		/**
		 * This method is used for explicitly wait
		 */
		public static void explicitWait(WebElement element)
		{
			wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		//Select class for dropdown----------------------------------------
		/**
		 * This method is used to select element from drop down using index 
		 * @param i
		 * @param element
		 */		
		public static void dropDown(int i,WebElement element)
		{
			s=new Select(element);
			s.selectByIndex(i);			
		}
		/**
		 * This method is used to select element from drop down using  value
		 * @param value
		 * @param element
		 */		
		public static void dropDown(String value,WebElement element)
		{
			s=new Select(element);
			s.selectByValue(value);
			
		}
		/**
		 * This method is used to select element from drop down using visible text
		 * @param element
		 * @param VisibleText
		 */
		public static void dropDown(WebElement element,String VisibleText)
		{
			s=new Select(element);
			s.selectByVisibleText(VisibleText);		
		}
		//Actions class for Mouse action----------------------------------------
		/**
		 * This method is used to move the cursor
		 * @param element
		 */
				public static void moveCursor(WebElement element)
		{
			a=new Actions(driver);
			a.moveToElement(element).perform();
		}
		/**
		 * This method is used to right click on the element
		 * @param element
		 */
		
		public static void rightClick(WebElement element)
		{
			a=new Actions(driver);
			a.contextClick(element).perform();
		}
		/**
		 * This method is used to double click on the element
		 * @param element
		 */
		public static void doubleClick(WebElement element)
		{
			a=new Actions(driver);
			a.doubleClick(element).perform();
		}
		/**
		 * This method is used to drag and drop the element
		 * @param source
		 * @param destination
		 */
		public static void dragAndDrop(WebElement source,WebElement destination)
		{
			a=new Actions(driver);
			a.dragAndDrop(source, destination).perform();
		}
		/**
		 * This method is used to click on the element
		 * @param element
		 */
		public static void clickElement(WebElement element)
		{
			a=new Actions(driver);
			a.click(element).perform();
		}
		/**
		 * This method is used to click on the element
		 */
		public static void click()
		{
			a=new Actions(driver);
			a.click().perform();
		}
		//property file-----------------------------------------------------
		
		
}
