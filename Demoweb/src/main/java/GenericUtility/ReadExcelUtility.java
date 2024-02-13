package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUtility {
	/**
	 * This method is used to get the data from row and column
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws IOException
	 */
	public static String fetchData(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\QSPIDER\\java\\java eclisp\\Demoweb\\src\\test\\resources\\Excel\\excel.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheet);
		return s.getRow(row).getCell(cell).toString();
	}
	/**
	 * This method is used to get the row 
	 * @param sheet
	 * @return
	 * @throws IOException
	 */
	
	public static int rowSize(String sheet) throws IOException
	{
		FileInputStream fis=new FileInputStream(Iconstant.excel_path);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheet);
		return s.getPhysicalNumberOfRows();
	}
	/**
	 * This method is used to get the column size of the data
	 * @param sheet
	 * @return
	 * @throws IOException
	 */
	
	public static int cellSize(String sheet) throws IOException
	{
		FileInputStream fis=new FileInputStream(Iconstant.excel_path);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheet);
		return s.getRow(0).getPhysicalNumberOfCells();
	}
	/**
	 * This method is used to fetch all data from excel sheet
	 * @param sheet
	 * @return
	 * @throws IOException
	 */
	
	public static Object[][] fetchAllData(String sheet) throws IOException
	{
		FileInputStream fis=new FileInputStream(Iconstant.excel_path);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheet);
		int rowsize=s.getPhysicalNumberOfRows();
		int colsize=s.getRow(0).getPhysicalNumberOfCells();
		Object d[][]=new Object[rowsize][colsize];
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
			{
				d[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return d;
	}

}
