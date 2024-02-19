package genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethodsForDataRead {
	
	public String readingdatfrompropfile(String path,String key) throws IOException {
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;			
	}
	
	public String readdatafromexcel(String path,String sheetname,int rownum,int celnum) throws EncryptedDocumentException, IOException {
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		String data = sheet.getRow(rownum).getCell(celnum).toString();
		return data;
			
	}
	
	public String[] readingDatafromeXcelRowwise(String path,String sheetname,int colnum) throws EncryptedDocumentException, IOException {
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		int rownums = sheet.getPhysicalNumberOfRows();
		String[]data=new String[rownums];
		for(int i=0;i<rownums;i++) {
			String datafromcell = sheet.getRow(i).getCell(colnum).toString();
			data[i]=datafromcell;
		}
		return data;
	}	
       public static String[][]readingDataFromMultipleRowColumn(String path,String sheetname) throws EncryptedDocumentException, IOException{
		
    	   File file=new File(path);
   		FileInputStream fis=new FileInputStream(file);
   		Workbook workbook=WorkbookFactory.create(fis);
   		Sheet sheet = workbook.getSheet(sheetname);
   		int rownums = sheet.getPhysicalNumberOfRows();
   		int colnum = sheet.getRow(0).getPhysicalNumberOfCells();
   		String[][]data=new String[rownums][colnum];
   		for(int i=0;i<rownums;i++) {
   			for(int j=0;j<colnum;j++) {
   				String datafromexcel = sheet.getRow(i).getCell(j).toString();  
   			data[i][j]=datafromexcel;
   			}
	}return data;
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
