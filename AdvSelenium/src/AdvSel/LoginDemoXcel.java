package AdvSel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoXcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream file=new FileInputStream("./data/demo.xlsx");
		
		Workbook workbook = WorkbookFactory.create(file);
		
		String URL = workbook.getSheet("data").getRow(1).getCell(0).getStringCellValue();
		System.out.println(URL);
		String email = workbook.getSheet("data").getRow(1).getCell(1).getStringCellValue();
		System.out.println(email);
		 String password = workbook.getSheet("data").getRow(1).getCell(2).getStringCellValue();
		System.out.println(password);
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
