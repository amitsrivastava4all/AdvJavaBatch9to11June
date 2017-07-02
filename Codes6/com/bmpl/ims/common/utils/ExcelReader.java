package com.bmpl.ims.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.chainsaw.Main;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelReader {
	public static void readExcel() throws IOException{
		String path = "/Users/amit/Documents/xlsfortest/StudentData.xls";
		File file = new File(path);
		if(!file.exists()){
			System.out.println("File Not Exist");
			return ;
		}
		FileInputStream fi = new FileInputStream(file);
		HSSFWorkbook workBook =new HSSFWorkbook(fi);
		HSSFSheet sheet = workBook.getSheetAt(0);
		Iterator<Row> rows = sheet.rowIterator();
		while(rows.hasNext()){
			Row row = rows.next();
			Iterator<Cell> cells = row.cellIterator();
			String currentCell = "";
			while(cells.hasNext()){
				Cell cell = cells.next();
				if(cell.getCellType()==Cell.CELL_TYPE_STRING){
					currentCell += cell.getStringCellValue() + " ";
				}
				else
				if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
					currentCell += cell.getNumericCellValue() + " ";
				}
			}
			System.out.println(currentCell);
		}
		workBook.close();
		fi.close();
		
	}
	public static void main(String[] args) throws IOException {
		ExcelReader.readExcel();
	}
}
