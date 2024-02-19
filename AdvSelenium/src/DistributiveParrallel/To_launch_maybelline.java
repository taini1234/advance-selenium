package DistributiveParrallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_launch_maybelline {
	
	@Test
	public void maybelline() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.maybelline.co.in/");
		driver.manage().window().maximize();
	}

}
