package com.ExcelReader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	public static Object[][] getTestData(String filePath, String sheetName) {
		Object[][] data = null;
		try {
			File file = new File(filePath);
			FileInputStream inputStream = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = wb.getSheet(sheetName);
			data = new Object[sheet.getPhysicalNumberOfRows() - 1][sheet.getRow(0).getPhysicalNumberOfCells()];
			for (int rowIndex = sheet.getFirstRowNum() + 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) 
			{
				for (int colIndex = sheet.getRow(rowIndex).getFirstCellNum(); colIndex < sheet.getRow(rowIndex).getLastCellNum(); colIndex++)
				{
					if (ObjectUtils.isNotEmpty(sheet.getRow(rowIndex).getCell(colIndex))) 
					{
						data[rowIndex - 1][colIndex] = sheet.getRow(rowIndex).getCell(colIndex).toString();
					} else 
					{
						data[rowIndex - 1][colIndex] = "";
					}
				}
			}
			wb.close();
		} 
		catch (Exception exception) 
		{
			System.out.println(exception.toString());
		}
		return data;
	}
}
