package com.TestNGSampleScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {

	public static void main(String[] args) throws IOException {

		List<String> al = new ArrayList<String>();

		File src = new File("F:\\Practice\\ExcelDataDriven.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		int sheets = wb.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (wb.getSheetName(i).equalsIgnoreCase("Test")) {
				XSSFSheet sheet = wb.getSheetAt(i);
				System.out.println(sheets);
				System.out.println(sheet.getSheetName());

				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();

				Iterator<Cell> cell = firstRow.cellIterator();
				int k = 0, column = 0;
				while (cell.hasNext()) {
					Cell ce = cell.next();
					if (ce.getStringCellValue().equalsIgnoreCase("Testcases")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);

				while (rows.hasNext()) {
					Row desiredRow = rows.next();
					if (desiredRow.getCell(column).getStringCellValue().equalsIgnoreCase("Smoke")) {
						Iterator<Cell> desiredCells = desiredRow.cellIterator();
						while (desiredCells.hasNext()) {
							Cell cellValue = desiredCells.next();
							if (cellValue.getCellType() == CellType.STRING) {
								al.add(cellValue.getStringCellValue());
							} else {
								al.add(NumberToTextConverter.toText(cellValue.getNumericCellValue()));
							}

						}
					}
				}
			}
		}
		System.out.println(al);
	}
}


 
