package genericlibrary;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromXcelRow {
@Test
	public void data() throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		UtilityMethodsForDataRead um=new UtilityMethodsForDataRead();
		driver.get(um.readingdatfrompropfile("./data/data.properties","url"));
		String[] data = um.readingDatafromeXcelRowwise("./data/data2.xlsx","data", 0);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(data[0]);
		driver.findElement(By.id("Password")).sendKeys(data[1]);
		driver.quit();
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
