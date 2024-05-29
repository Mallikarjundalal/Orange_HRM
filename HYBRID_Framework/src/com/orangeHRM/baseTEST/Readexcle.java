package com.orangeHRM.baseTEST;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcle implements Applicationconstent {
	public static String Readdata(String Sheet1,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(Exclepath);
		Workbook book=WorkbookFactory.create(fis);
		Cell cel = book.getSheet(Sheet1).getRow(row).getCell(cell);
		String value = cel.getStringCellValue().toString();
		return value;
		
	}

}
