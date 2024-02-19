package Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_launch_Apple {
	@Test
	public void apple() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apple.com/");
		driver.manage().window().maximize();
	}
	
	
	
	
	
	
}
