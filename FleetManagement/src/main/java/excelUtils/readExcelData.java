package excelUtils;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import frameworkUtils.reusableComponent;

public class readExcelData {
	public static String getExcelData(int rowNum, int colNum) throws Exception {
		File file = new File(reusableComponent.excelFilePath);
		// FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook ws = new XSSFWorkbook(file);
		XSSFSheet sheet = ws.getSheet("TestData");
		String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return data;
		
//		File file = new File(reusableComponent.propertiesFile);
//		FileInputStream stream = new FileInputStream(file);
//		Properties prop = new Properties();
//		prop.load(stream);
//		String data = prop.getProperty(key);
//		return data;
		
	}

}
