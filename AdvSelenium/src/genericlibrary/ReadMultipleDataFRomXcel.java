package genericlibrary;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadMultipleDataFRomXcel {
	@Test(dataProvider = "data")
	public void login(String un,String pswd) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		UtilityMethodsForDataRead um=new UtilityMethodsForDataRead();
		driver.get(um.readingdatfrompropfile("./data/data.properties","loginurl"));
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pswd);
		driver.quit();	
		
	}
	@DataProvider(name="data")
	public String[][]dataSupply() throws EncryptedDocumentException, IOException{
		return UtilityMethodsForDataRead.readingDataFromMultipleRowColumn("./data/demo.xlsx","Sheet1");
	}
	
	
	
	
	
	
	

}
