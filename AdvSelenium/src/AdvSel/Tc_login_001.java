package AdvSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_login_001 {
	
	//validate user is able to login in the demowebshop
	public static void main(String[] args) {
		String actualurl="https://demowebshop.tricentis.com/";
		String loginurl="https://demowebshop.tricentis.com/login";
		String actualmail="tezza@6789gmail.com";
		String actualpassword="123456";
		
		
		
		//step 1: open the browser
		WebDriver driver=new ChromeDriver();
		System.out.println("user is able to oprn the browser");
		
		//step2: enter the url
		 driver.get("https://demowebshop.tricentis.com/");
		String url = driver.getCurrentUrl();
		if(actualurl.equals(url)) {
			System.out.println("user is able to open demowebshop");
		}
		else {
			System.out.println("user is not able to open demowebshop");
		}
		
		//step3: click on login link
		 driver.findElement(By.linkText("Log in")).click();
		String currurl = driver.getCurrentUrl();
		if(loginurl.equals(currurl)) {
			System.out.println("user is able to click on login link");
		}
		else {
			System.out.println("user is not able to click on login link");
		}
		
		//step4:enter valid emailid
		WebElement mail = driver.findElement(By.id("Email"));
		mail.sendKeys("tezza@6789gmail.com");
		String att = mail.getAttribute("id");
		if(actualmail.equals(att)){
			System.out.println("enter the valid email");
		}
		else {
			System.out.println("enter invalid mail");
		}
		//step5: enter valid data for password
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123456");
		String att1 = password.getAttribute("id");
		if(actualpassword.equals(att1)) {
			System.out.println("enter the valid password");
		}
		else {
			System.out.println("enter invalid password");
		}
		
		//step6: user is able to click on checkbox
		WebElement checkbox = driver.findElement(By.id("RememberMe"));
		checkbox.click();
		if(checkbox.isSelected()) {
			System.out.println("user is able to click on checkbox");
		}
		else {
			System.out.println("user is not able to click on checkbox");
		}
		
		//step7:user is able to click on login button
		 WebElement button = driver.findElement(By.xpath("//input[@value='Log in']"));
		 button.click();
		String logurl = driver.getCurrentUrl();
		 if(actualurl.equals(logurl)) {
			 System.out.println("user is able to click login");
		 }
		 else {
			 System.out.println("user is not able to login");
		 }
		 
		 //step 8:quit
		 driver.quit();
		 System.out.println("user is able to close the demowebshop");
		
		
		
		
		
		
	}

}
