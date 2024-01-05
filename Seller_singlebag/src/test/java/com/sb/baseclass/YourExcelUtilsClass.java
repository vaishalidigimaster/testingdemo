package com.sb.baseclass;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class YourExcelUtilsClass {
	 
	public static Object[][] getTestData(String sheetName) {
        Object[][] testData = null;
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\Digi-QA\\eclipse-workspace\\Seller_singlebag\\excel\\Data For seller.xlsx");
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet(sheetName);

            int rowCount = sheet.getPhysicalNumberOfRows();
            testData = new Object[rowCount][sheet.getRow(0).getPhysicalNumberOfCells()];

            for (int rowIdx = 0; rowIdx < rowCount; rowIdx++) {
                Row row = sheet.getRow(rowIdx);
                int cellCount = row.getPhysicalNumberOfCells();
                for (int cellIdx = 0; cellIdx < cellCount; cellIdx++) {
                    Cell cell = row.getCell(cellIdx);
                    testData[rowIdx][cellIdx] = getCellValueAsString(cell);
                }
            }

            workbook.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return testData;
 }
	 private static String getCellValueAsString(Cell cell) {
	        if (cell == null) {
	            return "";
	        }
	        if (cell.getCellType() == CellType.NUMERIC) {
	            return String.valueOf(cell.getNumericCellValue());
	        } else if (cell.getCellType() == CellType.STRING) {
	            return cell.getStringCellValue();
	        } else if (cell.getCellType() == CellType.BLANK) {
	            return "";
	        } else {
	            return ""; // Handle other cell types if needed
	        }
	    }
	}
	
