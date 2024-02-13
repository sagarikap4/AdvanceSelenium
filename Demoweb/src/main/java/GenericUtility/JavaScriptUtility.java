package GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends WebdriverUtility{
	//JavaScript executor-----------------------------------------
	/**
	 * This method is used to scroll the webpage by x and y axis
	 * @param x
	 * @param y
	 */
	public void scrollBy(int x,int y)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	/**
	 * This method is used to scroll the webpage to element
	 * @param x
	 * @param y
	 */
	
	public void scrollTo(int x,int y)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
	/**
	 * This method is used to scroll the webpage to view point
	 * @param b
	 * @param element
	 * @param index
	 */
	public void scroll_In_To_View(Boolean b,WebElement element,int index)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments["+index+"].scrollInToview("+b+");,"+element+"");
	}
	/**
	 * This method is used to click action on disable element
	 * @param element
	 * @param index
	 */
	public static void clickDisable(WebElement element)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}

}
