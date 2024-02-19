package ListenersStudy;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListernersImplementation.class)
public class ListernersDemo {
	
	public static WebDriver driver;
	@Test
	public void login() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		String url = driver.getCurrentUrl();
		assertEquals(url,"https://demowebshop.tricentis.com/login");
		driver.quit();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
