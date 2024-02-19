package AdvSel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToGetDateFromXcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./data/data2.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fis);
		LocalDateTime date = workbook.getSheet("data").getRow(1).getCell(1).getLocalDateTimeCellValue();
		
		System.out.println(date);
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfMonth());
		
		
		
		
		
		
	}

}
