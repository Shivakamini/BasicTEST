package com.automation.JavaInterview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {

      
		File src=new File("D:\\\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("sheet1");
		
	    //System.out.println("no.of sheets: "+wb.getNumberOfSheets());
		//System.out.println("sheet name: "+sheet.getSheetName());
		//System.out.println("no.of rows: "+sheet.getPhysicalNumberOfRows());
		//System.out.println("first row num: "+sheet.getFirstRowNum());
		//System.out.println("first Last row num: "+sheet.getLastRowNum());
		
		for (int rowIndex = sheet.getFirstRowNum(); rowIndex <= sheet.getLastRowNum(); rowIndex++) 
		{
			for (int column = sheet.getRow(rowIndex).getFirstCellNum(); column < sheet.getRow(rowIndex)
			.getLastCellNum(); column++) 
			   { 
				//System.out.println("no.of cols: "+sheet.getRow(rowIndex).getPhysicalNumberOfCells());
				//System.out.println("first col num: "+sheet.getRow(rowIndex).getFirstCellNum());
				//System.out.println("Last col num: "+sheet.getRow(rowIndex).getLastCellNum());
				System.out.print(sheet.getRow(rowIndex).getCell(column) + "\t");
			   }
			System.out.println();
			}
		
		sheet.getRow(0).createCell(4).setCellValue("College");
	    FileOutputStream fos=new FileOutputStream(src);
		  wb.write(fos);
		
	}
	
}
