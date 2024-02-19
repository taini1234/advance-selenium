package AdvSel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToOpenDemoWorkshop {
	
	public static void main(String[] args) throws IOException {
		//STEP1:.....CREATE OBJ FOR FILE AND PASSING PATH FOR PROP FILE
		File file=new File("./Data/data.properties");
				
		//STEP2 ......CREATE OBJ FOR FILEINPUTSTREAM
	    FileInputStream fis=new FileInputStream(file);
				
				
		//STEP3.....CREATE OBJ FOR PEOPERTIES FILE
		Properties prop=new Properties();
				
		prop.load(fis);
		
		WebDriver driver=new ChromeDriver();
		//String URL = prop.getProperty("url");
		//driver.get(URL);
		
		//directly passing string argument
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
		//driver.findElement(By.linkText("Log in")).click();
		
	}

}
