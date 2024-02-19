package TestNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
public WebDriver driver;
String email="tezza@6789gmail.com";
String password="123456";
	@BeforeSuite
	public void dataBaseStart() {
		Reporter.log("data base connection started",true);
		Reporter.log("extend report formation",true);
	}
	
	@AfterSuite
	public void dataBaseStoped() {
		Reporter.log("data base connection stoped",true);
		Reporter.log("extend report formation end",true);
	}
	@BeforeTest
	public void browsersetup() throws InterruptedException {
		driver=new ChromeDriver();
		Reporter.log("user is able to launch empty browser",true);
		driver.manage().window().maximize();
		Reporter.log("user is able to maximize the browser",true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("user is able to open demowebshop",true);
		Thread.sleep(3000);
		
	}
	@AfterTest
	public void teardownbrowser() {
		driver.quit();
		Reporter.log("user is able to quit the demowebshop",true);
	}
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("user is able to login",true);
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("user is able to logout",true);
	}
	
	
	
	
	
	
	
	
	
}
