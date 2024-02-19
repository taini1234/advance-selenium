package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void demoweb() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("browser is maximized",true);
		SoftAssert softAssert=new SoftAssert();
		
		String expectedurl="https://demowebshop.tricentis.com/login";
		String expectedEmailid="tezza@6789gmail.com";
		
		driver.get("https://demowebsho.tricentis.com/login");
		String actualurl = driver.getCurrentUrl();
		SoftAssert.(expectedurl, actualurl,"user is not able to land on webshop");
		
		WebElement emailid = driver.findElement(By.id("Email"));
		emailid.sendKeys("tezza@6789gmail.com");
		String actualemailid = emailid.getAttribute("value");
		System.out.println(actualemailid);
		Assert.assertEquals(actualemailid, expectedEmailid, "email id is not valid");
		
		driver.quit();
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
