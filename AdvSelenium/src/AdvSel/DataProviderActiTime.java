package AdvSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderActiTime {
	@Test(dataProvider="data")
	//public void actTime(String[] login)
	public void actTime(String un,String pwd) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
														//sendkeys.(login[0]);
		driver.findElement(By.name("username")).sendKeys(un);
		Thread.sleep(2000);							
													//sendkeys.(login[1]);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.quit();	
	}
	
	@DataProvider(name="data")
	public String[][] dataSet(){
		String[][] data= {{"apoorva","acm"},{"Taini","1234"}};
		return data;
		
	}
	
	
	
	
	

}
