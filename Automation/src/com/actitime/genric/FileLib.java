package com.actitime.genric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Property;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this is a genric class for data driven testin
 * @param key
 * @return
 */
public class FileLib {
	
	/**
 * This is genric method for reading the data from property file
 * @param key
 * @return string
 * @throws IOException
 * */
	public  String getPropertyData(String key) throws FileNotFoundException {
	FileInputStream fis=new FileInputStream("C:\\Users\\midhu\\OneDrive\\Desktop\\actitime.property.txt");
	 Properties p = new Properties();
	  String data = p.getProperty(key);
	  return data;
	}
	  
/**
 * This is genric method for reading the data from Excel  file
 * @param sheetname
 * @return row
 * @throws cell
 * @return string
 * @throws IOException 
 * @throws EncryptedDocumentException
 * @throws IOexception
 */
	
	public String getExcelData(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String data = wb.getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
	return data;
		}

	
	/**
	 * This is a genric method for writing data to excel
	 * @param SheetName
	 * @param row
	 * @param cell
	 * @throws IOException 
	 * @throws EncryptedDocumentException
     * @throws IOexception
	 */
	public void setExcelData(String SheetName,int row,int cell,String data) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet("Sheet1").getRow(row).getCell(cell).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("./data/commondata.xlsx");
	wb.write(fos);
}
	
	
	
	

	  
	


}
