package TestNgProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc__006 extends BaseClass{
	
	@Test
	public void signupfornewsletter() {
		driver.findElement(By.id("newsletter-email")).sendKeys("tezza@6789gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		Reporter.log("user is able to click on subscribe button",true);
	}

}
