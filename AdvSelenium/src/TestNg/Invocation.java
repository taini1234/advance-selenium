package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Invocationcount for running multiple times 
//threadpoolsize for running parallely
public class Invocation {
	
	@Test(invocationCount = 4,threadPoolSize = 4)
	public void tolaunchapp() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	
	
	
	
	
	

}
