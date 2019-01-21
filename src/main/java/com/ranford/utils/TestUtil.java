package com.ranford.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.ranford.base.TestBase;

public class TestUtil extends TestBase{

	
	public static long pageLoadTime=40;
	public static long implicitTime=20;
	
	static Workbook book;
	static Sheet sheet;
	
	
	public static void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
	public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
		FileInputStream file = null;
		
		try {
			file = new FileInputStream("C:\\Users\\Himanshu.Dubey\\eclipse-workspace\\Ranford1\\src\\main\\java\\com\\ranford\\testdata\\testdata.xlsx");
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			book = WorkbookFactory.create(file);
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		sheet = book.getSheet(sheetName);
		Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				
			}
		}
		return data;
	}
}
