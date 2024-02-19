package AdvSel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadDataFromXcel {

	public static void main(String[] args) throws IOException {
		File file = new File("./data/data2.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet = xsf.getSheet("data");
		
	String entry1 = sheet.getRow(0).getCell(1).getStringCellValue();
	System.out.println(entry1);
	
	String entry2 = sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(entry2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
