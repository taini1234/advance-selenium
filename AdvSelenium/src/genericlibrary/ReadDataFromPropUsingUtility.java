package genericlibrary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadDataFromPropUsingUtility {
	
	@Test
	public void register() throws IOException {
		WebDriver driver=new ChromeDriver();
		UtilityMethodsForDataRead um=new UtilityMethodsForDataRead();
		String url = um.readingdatfrompropfile("./data/data.properties", "url");
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		String firstname = um.readingdatfrompropfile("./data/data.properties","firstname");
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		String lastname = um.readingdatfrompropfile("./data/data.properties", "lastname");
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		String mail = um.readingdatfrompropfile("./data/data.properties", "email");
		driver.findElement(By.id("Email")).sendKeys(mail);
		String pswd = um.readingdatfrompropfile("./data/data.properties", "password");
		driver.findElement(By.id("Password")).sendKeys(pswd);
		String cfpswd = um.readingdatfrompropfile("./data/data.properties", "confirmpassword");
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cfpswd);
		
		driver.findElement(By.id("register-button")).click();
		driver.quit();
		
	}
	
	
	
	
	

}
