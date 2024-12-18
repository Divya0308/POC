package com.stepdefinitions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	String filePath=" ";
	FileInputStream fs;
	XSSFWorkbook xs;
	static XSSFSheet sheet;

	public void getRowCount() throws IOException {
		fs=new FileInputStream(filePath);
		xs= new XSSFWorkbook(fs);
		 sheet=xs.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		System.out.println("Total rows: "+rowCount);
		
	}
	public void getColumnCount() throws IOException {
		fs=new FileInputStream(filePath);
		xs= new XSSFWorkbook(fs);
		sheet=xs.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		Row row=sheet.getRow(0);
		int columnCount=row.getPhysicalNumberOfCells();
		System.out.println("Total Columns: "+columnCount);
		
		
	}
	
	public static String getCellData(int rowNum, int colNum) {
        String data = "";
        try {
            Row row = sheet.getRow(rowNum);
            if (row != null) {
                Cell cell = row.getCell(colNum);
                if (cell != null) {
                    if (cell.getCellType() == CellType.STRING) {
                        data = cell.getStringCellValue();
                    } else if (cell.getCellType() == CellType.NUMERIC) {
                        data = String.valueOf((int) cell.getNumericCellValue());
                    } else if (cell.getCellType() == CellType.BOOLEAN) {
                        data = String.valueOf(cell.getBooleanCellValue());
                    } else {
                        data = "";
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading cell data: " + e.getMessage());
        }
        return data;
    }		
	}

