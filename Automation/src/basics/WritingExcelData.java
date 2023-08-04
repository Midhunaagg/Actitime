package basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.input.RandomAccessFileInputStream;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("Sheet1").getRow(1).getCell(4).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream("./data/commondata.xlsx");
		wb.write(fos);
	}

}

