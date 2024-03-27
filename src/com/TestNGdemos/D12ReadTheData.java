package com.TestNGdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12ReadTheData {
	
	String fPath = "\"F:\\Agile Pratyush Java Demos\\PratyushSeleniumDemos\\Excelfiles\\LoginData.xlsx\"";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
  @Test
  public void readData() {
	  
	  /*row = sheet.getRow(0);			//Read the 1st row
		cell = row.getCell(0);			//Reads the 1st cell from 1st row
		
		//String data = cell.getStringCellValue();
		//System.out.println(data);
		
		System.out.println(cell.getStringCellValue());*/
	  
	  int rows = sheet.getPhysicalNumberOfRows();
	 // int cells = row.getPhysicalNumberOfCells();
	  
	  for(int i = 0; i < rows; i++)
		{
			row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			
			for(int j = 0; j < cells; j++)
			{
				cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
		
	}
	  
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	    file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		//sheet = wb.getSheet("Login Data");
		sheet = wb.getSheetAt(0);   //if we do not know the name of sheet
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  
	  wb.close();
		fis.close();
	  
  }

}
