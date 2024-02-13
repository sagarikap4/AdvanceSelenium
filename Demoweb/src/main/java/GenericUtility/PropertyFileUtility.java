package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility extends WebdriverUtility {
	/**
	 * This method is used to give data which is stored in the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String propertyData(String key) throws IOException
	{
		//fileinput strem object
		FileInputStream fis=new FileInputStream(Iconstant.property_path);
		p=new Properties();
		p.load(fis);
		return p.getProperty(key);
		
	}

}
