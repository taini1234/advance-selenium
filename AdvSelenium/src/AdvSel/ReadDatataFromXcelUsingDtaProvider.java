package AdvSel;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDatataFromXcelUsingDtaProvider {
	@DataProvider
	public String[][] registerdata() throws Exception, IOException {
		
		File file=new File("./data/demo.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		int numofrows = book.getSheet("dataprovidersheet").getPhysicalNumberOfRows();
		int numofclm = book.getSheet("dataprovidersheet").getRow(0).getPhysicalNumberOfCells();
		System.out.println(numofrows);
		System.out.println(numofclm);
		
		String[][]data=new String[numofrows][numofclm];
		for(int i=0;i<numofrows;i++) {
			for(int j=0;j<numofclm;j++) {
				data[i][j]=book.getSheet("dataprovidersheet").getRow(i).getCell(j).toString();
			}
		}
		
		return data;
		
	}
	
	@Test(dataProvider="registerdata")
	public void registeruser(String[] dataToReg) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		if(dataToReg[0].equalsIgnoreCase("female")) {
			driver.findElement(By.id("gender-female")).click();
		}else {
			driver.findElement(By.id("gender-female")).click();
		}
		
		driver.findElement(By.id("FirstName")).sendKeys(dataToReg[1]);
		driver.findElement(By.id("LastName")).sendKeys(dataToReg[2]);
		driver.findElement(By.id("Email")).sendKeys(dataToReg[3]);
		driver.findElement(By.id("Password")).sendKeys(dataToReg[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(dataToReg[5]);
		driver.findElement(By.id("register-button")).click();
		
		
	}
	
	
}
