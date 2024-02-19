package genericlibrary;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
@Test
	public void data() throws EncryptedDocumentException, IOException {
	    WebDriver driver=new ChromeDriver();
		UtilityMethodsForDataRead um=new UtilityMethodsForDataRead();
		driver.get(um.readingdatfrompropfile("./data/data.properties", "url"));
		driver.findElement(By.linkText("Log in")).click();
		String username = um.readdatafromexcel("./data/data2.xlsx","data" ,1, 0);
		driver.findElement(By.id("Email")).sendKeys(username);
		String pswd = um.readdatafromexcel("./data/data2.xlsx","data", 1, 1);
		driver.findElement(By.id("Password")).sendKeys(pswd);
		driver.quit();
	}
	
	
	
}
