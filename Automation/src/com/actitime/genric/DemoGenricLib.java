package com.actitime.genric;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class DemoGenricLib {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		 String un = f.getPropertyData("un");
		 String pw = f.getPropertyData("pw");
		 System.out.println(url);
		 System.out.println(un);
		 System.out.println(pw);
		 f.setExcelData("Sheet1", 1, 2, "SBI_003");
		 String cn = f.getExcelData("Sheet1", 1, 2);
				 System.out.println(cn);
	}

}
