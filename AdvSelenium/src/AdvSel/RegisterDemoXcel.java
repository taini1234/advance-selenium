package AdvSel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemoXcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/demo.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		
		String firstname = book.getSheet("register").getRow(1).getCell(1).getStringCellValue();
		String lastname = book.getSheet("register").getRow(1).getCell(2).getStringCellValue();
		String email = book.getSheet("register").getRow(1).getCell(3).getStringCellValue();
		String password = book.getSheet("register").getRow(1).getCell(4).getStringCellValue();
		String confirmpassword = book.getSheet("register").getRow(1).getCell(5).getStringCellValue();
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
		driver.findElement(By.id("register-button")).click();
		
		
		
		
		
		
		
		
		
	}

}
