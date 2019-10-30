package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	
public ExcelDataProvider()
{
File src = new File("./testData/DataApp.xlsx");
try {
	FileInputStream fis = new FileInputStream(src);
	wb = new XSSFWorkbook(fis);
}
catch (Exception e)
{
System.out.println("Unable to read excel file "+e.getMessage());	
}

}

public String getStringData(int sheetIndex,int row,int column)
{
return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();	
}

public String getStringData(String sheetName,int row, int column)
{
return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();	
}

public double getNumStringData(String sheetName,int row,int column)
{
return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();	
}
	
	
	
}
