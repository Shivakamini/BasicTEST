package com.TestNGSampleScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

//Identify Testcases coloum by scanning the entire 1st row
//once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
//after you grab purchase testcase row = pull all the data of that row and feed into test

public class ExcelDataDriven {

	@Test
	public void readData() throws IOException
	{
		File src=new File("F:\\Practice\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		/*
		 * XSSFSheet sh=wb.getSheet("Test");
		 * 
		 * for(int rowIndex=sh.getFirstRowNum();rowIndex<=sh.getLastRowNum();rowIndex++)
		 * { for(int
		 * colIndex=sh.getRow(rowIndex).getFirstCellNum();colIndex<sh.getRow(rowIndex).
		 * getLastCellNum();colIndex++) {
		 * System.out.println(sh.getRow(rowIndex).getCell(colIndex).getStringCellValue()
		 * +"\t"); } }
		 */
		
		 List<String> lt=new ArrayList<String>();
		 
		 int sheets= wb.getNumberOfSheets();
		 for(int i=0;i<=sheets;i++)
		 {
			 if(wb.getSheetName(i).equalsIgnoreCase("Test"))
			 {
				 XSSFSheet sheet=wb.getSheetAt(i);
				 
				 Iterator<Row> rows=sheet.iterator();
				 Row firstRow=rows.next();
				 
				 int k=0;
				 int column=0;
				 Iterator<Cell> col=firstRow.cellIterator();
				 while(col.hasNext())
				 {
					 k++;
					 Cell colValue=col.next();
					 if(colValue.getStringCellValue().equalsIgnoreCase("TestCases"))
					 {
						 column=k;
					 }
					 
				 }
				 System.out.println(column);
				 
				 while(rows.hasNext())
				 {
					 Row rowValue=rows.next();
					 if(rowValue.getCell(column).getStringCellValue().equalsIgnoreCase("Smoke"))
					 {
						 Iterator<Cell> cellContent=rowValue.cellIterator();
						 while(cellContent.hasNext())
						 {
							 Cell ce=cellContent.next();
							 
							 if(ce.getCellTypeEnum()==CellType.STRING)
							 {
								 lt.add(ce.getStringCellValue());
							 }
							 else
								 lt.add(NumberToTextConverter.toText(ce.getNumericCellValue()));
						 }
					 }
				 }
			 }
		 }
		 }
	}


