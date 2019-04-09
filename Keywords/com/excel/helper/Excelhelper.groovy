package com.excel.helper

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

public class ExcelHelper {

	public File createExcel(String fileName) throws IOException {
		File excel_file = new File(fileName);
		return excel_file;
	}

	public XSSFSheet getSheet(XSSFWorkbook book, String sheetName) {
		XSSFSheet sheet = book.getSheet(sheetName);
		return sheet;
	}

	@Keyword
	public void updateTheExcel(String fileName, String sheetName, String aValue) throws IOException {
		XSSFWorkbook book = null;
		FileInputStream fin = null;

		File excel_file = createExcel(fileName);
		if (excel_file.exists()) {
			fin = new FileInputStream(excel_file);
			book = new XSSFWorkbook(fin);
		} else {
			book = new XSSFWorkbook();
		}

		XSSFSheet sheet = getSheet(book, sheetName);

		if (sheet == null) {
			int rowIndex=rownext(fileName, sheetName);
			sheet = createSheet(book, sheetName, aValue, rowIndex, 0);
			writeToExcel(excel_file, book);
			return;
		}

		try {
			int rowIndex=rownext(fileName,sheetName);
			updateTheExcel(sheet, aValue, rowIndex,0);
			writeToExcel(excel_file, book);
		} finally {
			if (fin != null)
				fin.close();
		}
	}

	public void updateTheExcel(XSSFSheet sheet, String aValue, int rowIndex, int colIndex) {
		XSSFRow sheetRow = sheet.createRow(rowIndex);
		XSSFCell sheetCell = sheetRow.createCell(colIndex);
		sheetCell.setCellValue(aValue);
	}

	public void writeToExcel(File excel_file, XSSFWorkbook book) throws IOException {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(excel_file);
			book.write(out);
		} finally {
			if (out != null)
				out.close();
		}
	}

	public XSSFSheet createSheet(XSSFWorkbook book, String sheetName, String aValue, int rowIndex, int colIndex) {
		XSSFSheet sheet = book.createSheet(sheetName);
		XSSFRow sheetRow = sheet.createRow(rowIndex);
		XSSFCell sheetColumn = sheetRow.createCell(colIndex);
		sheetColumn.setCellValue(aValue);
		return sheet;
	}

	@Keyword
	public int rownext(String fileName, String sheetName) throws IOException{
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.physicalNumberOfRows;
		return rowCount++;
	}
}